package lt.bt.Uzdaviniai.papildomi.Padangu_uzd;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Padangos {
    public static void main(String[] args) throws IOException {
        read();
    }

    private static void read() throws IOException {
        String filePath = "src\\lt\\bt\\Uzdaviniai\\txt\\padanga.txt";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        int plotis = scanner.nextInt();
        //System.out.println("plotis - " + plotis);

        int aukstis = scanner.nextInt();
        //System.out.println("aukstis - " + aukstis);

        String greit = scanner.nextLine();
        //System.out.println("greitis - " + greit);

        greit = greit.trim();

        int arrayNum = scanner.nextInt(); //masyvo ilgis
        //System.out.println("ilgis - " + arrayNum);


        Ratas[] padang = new Ratas[arrayNum];
        double bendraKaina=0;
        int kiekis=0;
        for (int i = 0; i < arrayNum; i++) {
            Ratas padangaSandeliy = new Ratas();

            padangaSandeliy.setPlotis(scanner.nextInt());
            padangaSandeliy.setAukstis(scanner.nextInt());
            padangaSandeliy.setGreit(scanner.next());
            padangaSandeliy.setKaina(scanner.nextDouble());
            padang[i] = padangaSandeliy;

            if (padangaSandeliy.getPlotis() == plotis && padangaSandeliy.getAukstis() == aukstis&&padangaSandeliy.getGreit().equals(greit)) {
                //System.out.println(padangaSandeliy);
                bendraKaina=padangaSandeliy.getKaina()+bendraKaina;
                kiekis++;
            }
        }System.out.println(bendraKaina);System.out.println(kiekis);
    }

    private static void pirmasAts() {

    }

    }