package lt.bt.Uzdaviniai.papildomi.Padangu_uzd;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Padangos {
    public static void main(String[] args) throws IOException {

        calc();
    }

    private static String read() throws IOException {
        String filePath = "src\\lt\\bt\\Uzdaviniai\\txt\\padanga.txt";
        return filePath;
    }

    private static int plot() throws IOException {
        File file = new File(read());
        Scanner scanner = new Scanner(file);
        int plotis = scanner.nextInt();
        //System.out.println("plotis - " + plotis);
        return plotis;
    }

    private static int auks() throws IOException {
        File file = new File(read());
        Scanner scanner = new Scanner(file);
        scanner.nextInt();
        int aukstis = scanner.nextInt();
        //System.out.println("aukstis - " + aukstis);
        return aukstis;
    }

    private static String index() throws IOException {
        File file = new File(read());
        Scanner scanner = new Scanner(file);
        scanner.nextInt();
        scanner.nextInt();
        String greit = scanner.nextLine();
        greit = greit.trim();
        //System.out.println("greitis - " + greit);
        return greit;
    }

    private static int arrayNumber() throws IOException {
        File file = new File(read());
        Scanner scanner = new Scanner(file);
        scanner.nextInt();
        scanner.nextInt();
        scanner.nextLine();
        int arrayNum = scanner.nextInt(); //masyvo ilgis
        //System.out.println("ilgis - " + arrayNum);
        return arrayNum;
    }

    private static void calc() throws IOException {
        int arrayNum=arrayNumber();
        Ratas[] padang = new Ratas[arrayNum];
        double bendraKaina=0;
        int kiekis=0;
        File file = new File(read());
        Scanner scanner = new Scanner(file);
        scanner.nextInt();
        scanner.nextInt();
        scanner.nextLine();
        scanner.nextInt();

        for (int i = 0; i < arrayNum; i++) {
            Ratas padangaSandeliy = new Ratas();
            padangaSandeliy.setPlotis(scanner.nextInt());
            padangaSandeliy.setAukstis(scanner.nextInt());
            padangaSandeliy.setGreit(scanner.next());
            padangaSandeliy.setKaina(scanner.nextDouble());
            padang[i] = padangaSandeliy;
            if (padangaSandeliy.getPlotis() ==plot() && padangaSandeliy.getAukstis() == auks()&&padangaSandeliy.getGreit().equals(index())) {
                //System.out.println(padangaSandeliy);
                bendraKaina=padangaSandeliy.getKaina()+bendraKaina;
                kiekis++;
            }
        }
        System.out.println("Tinkamų padangų skaičius: "+kiekis);
        System.out.println("Jos kainuotų: "+bendraKaina);
    }
}