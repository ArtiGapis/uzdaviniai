package lt.bt.Uzdaviniai.Kontrolinis;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VariantasB {
    public static void main(String[] args) {
        int sum = 0;
        read( sum);
    }

    private static void read(int sum){
        try {
            String filePath = "src\\lt\\bt\\Uzdaviniai\\txt\\DuomenysB.txt";
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            int stopsCount = scanner.nextInt(); //stoteles
            int[] array = new int[stopsCount];

            while (scanner.hasNextLine()) {
                for (int i = 0; i < stopsCount; i++) {
                    array[i] = scanner.nextInt();
                    sum = sum + array[i];
                }

                int max = array[0];
                int min = array[0];

                for (int i = 0; i < stopsCount; i++) {
                    if (array[i] > max) {
                        max = array[i];
                    } else if (array[i] < min) {
                        min = array[i];
                    }
                }
                printToConsole(sum, min, max);
                writeToFiles(sum, min, max);

            }scanner.close();
        }catch (IOException e){ System.err.println("Nera failo");}
    }

    private static void printToConsole(int sum,int min,int max) {
        System.out.println("REZULTATU FAILAS"); // Ats pirmas
        System.out.println("____________________");
        System.out.println("Maršruto atstumas:" + sum +" m."); // Ats pirmas
        System.out.println("Trumpiausias atstumas: " + min +" m."); //Ats antras
        System.out.println("Ilgiausias atstumas: " + max +" m."); //Ats trecias
    }

    private static void writeToFiles(int sum,int min,int max) throws IOException {
        String fileName = "src\\lt\\bt\\Uzdaviniai\\txt\\Rezultatai.txt";
        String r = "Rezultatų failas \r\n";
        String suma = "Maršruto atstumas: " + sum +" m."+"\r\n";
        String minimumas = "Trumpiausias atstumas: " + min+" m."+"\r\n";
        String maximumas = "Ilgiausias atstumas: " + max+" m."+"\r\n";
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