package lt.bt.Uzdaviniai;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class juodrastis {
    public static void main(String[] args) throws IOException {
        String filePath = "src\\lt\\bt\\Uzdaviniai\\txt\\bandomasis1.txt";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }
        scanner.close();
    }
}