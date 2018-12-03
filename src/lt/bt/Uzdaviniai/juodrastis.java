package lt.bt.Uzdaviniai;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class juodrastis {
    public static void main(String[] args) throws IOException {

        int totalRow = 5;
        int totalColumn = 20;
        char[][] myArray = new char[totalRow][totalColumn];
        File file = new File("src\\lt\\bt\\Uzdaviniai\\txt\\2Dband.txt");
        Scanner scanner = new Scanner(file);


        for (int row = 0; scanner.hasNextLine() && row < totalRow; row++) {
            char[] chars = scanner.nextLine().toCharArray();
            for (int i = 0; i < totalColumn && i < chars.length; i++) {
                myArray[row][i] = chars[i];
                System.out.println(myArray[row][i]);

            }
        }
    }
}