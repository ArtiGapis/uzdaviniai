package lt.bt.Uzdaviniai.masyvai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class masyvu_vidurkis {
    public static void main(String[] args)throws IOException {
        String filePath = "src\\lt\\bt\\Uzdaviniai\\txt\\bandomasis1.txt";
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String masyvas = br.readLine();

        int suma = 0;
        int i=0;
        int vid=0;
        int arraySize = 10;

        int[] smallerArray = new int[arraySize];

        for (i = 0; i < masyvas.length(); i++) {
            suma += Integer.parseInt(String.valueOf(masyvas.charAt(i)));
        }

        vid = suma / masyvas.length();
        System.out.println("masyvas " +masyvas);
        System.out.println("masyvo vidurkis " +vid);
        int j = 0;
        int removeElement = vid;
        for (i = 0; i < masyvas.length(); i++) {
            if (Integer.parseInt(String.valueOf(masyvas.charAt(i))) >= removeElement) {
                smallerArray[j] =  Integer.parseInt(String.valueOf(masyvas.charAt(i)));
                j++;
                System.out.println(Integer.parseInt(String.valueOf(masyvas.charAt(i))));
            }
        }
    }
}
