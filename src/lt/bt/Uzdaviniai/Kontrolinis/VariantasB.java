package lt.bt.Uzdaviniai.Kontrolinis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VariantasB {
    public static void main(String[] args) throws IOException {
        try {
            String filePath = "src\\lt\\bt\\Uzdaviniai\\txt\\DuomenysB.txt";
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            int sum = 0;
            int maximum = 0;
            int minimum = 0;

            int stopsCount = scanner.nextInt(); //stoteles

            System.out.println(stopsCount);
            System.out.println("____________________");

            while (scanner.hasNextLine()) {
                int[] array = new int[stopsCount];

                for (int i = 0; i < stopsCount; i++) {
                    array[i] = scanner.nextInt();
                    sum = sum + array[i];


                }
                System.out.println("bendras atstumas:" + sum); // ats pirmas
                int max = array[0];
                int min = array[0];
                for (int i = 0; i < stopsCount; i++) {
                    if (array[i] > max) {
                        max = array[i];
                        maximum = max;
                    } else if (array[i] < min) {
                        min = array[i];
                        minimum = min;
                    }
                }
                System.out.println("Didziausa: " + max); //Ats trecias
                System.out.println("Maziausias: " + min); //Ats antras

            }

            scanner.close();

            Print();
            String fileName = "src\\lt\\bt\\Uzdaviniai\\txt\\Rezultatai.txt";
            String r = "Rezultatų failas \n";
            String suma = "bendras atstumas: " + sum +"\n";
            String minimumas = "Maziausias: " + minimum+"\n";
            String maximumas = "Didziausias: " + maximum+"\n";
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(r);
            bw.write(suma);
            bw.write(maximumas);
            bw.write(minimumas);
            System.out.println("Done");
            bw.close();
            fw.close();

        }catch (IOException e){
            System.err.println("Nera failo");}
    }

    private static void Print() {

    }
}