package lt.bt.Uzdaviniai.try_cache;

import java.io.*;
import java.util.Scanner;

public class nuskaitymas {

    public static void main(String[] args) throws IOException {
        boolean stop = false;
        while (!stop) {

            //      src\lt\bt\Uzdaviniai\txt\try_cache.txt
            //      src\lt\bt\Uzdaviniai\txt\masyvas.txt

            print("Nurodykite norima faila:");
            String[] band =scanFile();
            for(int i = 0; i < 100; i++) {

                print("isbandom " + band[1]);
            }
        }
    }

    private static void print(String n) {
        System.out.println(n);
    }

//Nuskanuojame faila

    private static String[] scanFile() {
        Scanner reader = new Scanner(System.in);

        String[] rezult = new String[100];

        String failas = reader.nextLine();
        try{
            String filePath = failas;
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            int elementCount = 0;
            while (scanner.hasNextInt()) {
                System.out.println(scanner.nextInt());
                elementCount++;
            }
            scanner.close();
            scanner = new Scanner(file);

            int[] array = new int[elementCount];

            for(int i = 0; i < elementCount; i++){
                array[i] = scanner.nextInt();
            }
            scanner.close();
        }
        catch (IOException e){
            System.err.println("Failas nerastas, nurodykite kita Faila");
            scanFile();
        }
        return rezult;
    }
}
