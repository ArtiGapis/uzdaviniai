package lt.bt.Uzdaviniai;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class juodrastis {
    public static void main(String[] args) throws IOException {
        String filePath ="src\\lt\\bt\\Uzdaviniai\\txt\\masyvas.txt";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        int elementCount = 0;   //pavertimui
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            elementCount++;     //pavertimui
        }
        scanner.close();
                                //Paversti arejum
        scanner = new Scanner(file);

        int[] array = new int[elementCount];

        for(int i = 0; i < elementCount; i++){
            array[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println(array[1]);


    }
}