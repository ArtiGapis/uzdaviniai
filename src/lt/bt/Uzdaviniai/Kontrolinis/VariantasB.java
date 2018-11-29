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
            int min=0;
            int max=0;
            int stopsCount = scanner.nextInt(); //stoteles
            int[] array = new int[stopsCount];




            while (scanner.hasNextLine()) {

                for (int i = 0; i < stopsCount; i++) {
                    array[i] = scanner.nextInt();
                    sum = sum + array[i];


                }
                max = array[0];
                min = array[0];
                for (int i = 0; i < stopsCount; i++) {
                    if (array[i] > max) {
                        max = array[i];
                        maximum = max;
                    } else if (array[i] < min) {
                        min = array[i];
                        minimum = min;
                    }
                }


            }scanner.close();

            printConsole(sum, min, max);
            print(sum,minimum,maximum);

        }catch (IOException e){
            System.err.println("Nera failo");}
    }

    private static void reader() throws IOException {

    }

    private static void printConsole(int sum,int min,int max) throws IOException {
        System.out.println("REZULTATU FAILAS"); // ats pirmas
        System.out.println("____________________");
        System.out.println("Bendras atstumas:" + sum); // ats pirmas
        System.out.println("Maziausias: " + min); //Ats antras
        System.out.println("Didziausa: " + max); //Ats trecias
    }


    private static void print(int sum,int minimum,int maximum) throws IOException {
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
    }
}