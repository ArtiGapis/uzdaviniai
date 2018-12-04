package lt.bt.Uzdaviniai.papildomi.InoringiausiaPrincese;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Skaiciuokle {
    public static void main(String[] args) throws IOException {
        arrayNumber();
        princas();
        ped();
    }

    // NUSKAITYMAS
    private static String read() {
        String filePath = "src\\lt\\bt\\Uzdaviniai\\txt\\princai.txt";
        File file = new File(filePath);
        //Scanner scanner = new Scanner(file);
        return filePath;
    }

    // BENDRAS PRINCU KIEKIS
    private static int arrayNumber() throws IOException {
        File file = new File(read());
        Scanner scanner = new Scanner(file);
        int arrayNum = scanner.nextInt(); //masyvo ilgis
        //System.out.println("Princu kiekis : " + arrayNum);
        return arrayNum;
    }

    //PRINCU DUOMENYS
    private static Princas[] princas() throws IOException {
        File file = new File(read());
        Scanner scanner = new Scanner(file);
        int arrayLength = arrayNumber();
        Princas band = null;

        Princas[] princID = new Princas[arrayLength];
        scanner.nextInt();
        int arrayNum = arrayNumber();
        for (int i = 0; i < arrayNum; i++) {
            Princas princai = new Princas();
            princai.setVardas(scanner.next());
            princai.setPavarde(scanner.next());
            princai.setPedos(scanner.nextInt());
            princai.setColiai(scanner.nextInt());
            princai.getBendras();
            princID[i] = princai;

           // band=princID[princID.length - 1];

            System.out.println("Kandidatas1 : " +princai);
        }//System.out.println("Auksciausias : " +band );

        return princID;
    }

    private static void ped() throws IOException {

        //System.out.println("Kandidatas : " + princas());
    }
}