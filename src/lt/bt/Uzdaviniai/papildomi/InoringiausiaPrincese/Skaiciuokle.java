package lt.bt.Uzdaviniai.papildomi.InoringiausiaPrincese;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Skaiciuokle {
    public static void main(String[] args) throws IOException {

        scaner();
    }

    // NUSKAITYMAS
    private static void scaner() throws IOException {
        String filePath = "src\\lt\\bt\\Uzdaviniai\\txt\\princai.txt";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        int arrayNum = scanner.nextInt();



        for (int i = 0; i < arrayNum; i++) {
            Princas princai = new Princas();
            princai.setVardas(scanner.next());
            princai.setPavarde(scanner.next());
            princai.setPedos(scanner.nextInt());
            princai.setColiai(scanner.nextInt());
            princai.getBendras();
            //princeWraper[i] = princai;

            System.out.println("Kandidatas : " + princai.getBendras());
        }
    }
}