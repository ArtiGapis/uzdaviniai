package lt.bt.Uzdaviniai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class naujas_masyvu_vidurkis {
    public static void main(String[] args) throws IOException {

        String filePath = "src\\lt\\bt\\Uzdaviniai\\txt\\masyvu vidurkis.txt";
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;

        int[] array = new int[5];
        int i = 0;
        int j = 0;

        while ((st = br.readLine()) != null) {
            array[i] = Integer.parseInt(st);
            i++;
        }

        int sum = 0;
        for (i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        double average = (double) sum / array.length;
        int[] newArray = new int[array.length - 2];

        for (i = 0; i < array.length; i++) {
            if (array[i] > average) {
                newArray[j] = array[i];
                j++;
            }
        }

    }
}
