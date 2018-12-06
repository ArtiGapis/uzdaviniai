package lt.bt.Uzdaviniai.papildomi.Padangu_uzd;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) throws IOException {

        System.out.println("naudojant tarpine klase:");
        TireWraper tireWraper = readUsingWrap();
        //System.out.println(tireWraper.getNeedTire());
        finish(tireWraper.getHaveTire(), tireWraper.getNeedTire());

    }

    private static TireWraper readUsingWrap() throws IOException {
        String filePath = "src\\lt\\bt\\Uzdaviniai\\txt\\padanga.txt";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);


        int width = scanner.nextInt();
        int ratio = scanner.nextInt();
        String indeksas = scanner.nextLine();
        Tire tireNeed = new Tire();
        tireNeed.setTireWidth(width);
        tireNeed.setTireRatio(ratio);
        tireNeed.setTireDiameter(indeksas);

        System.out.println("reikamas: "+tireNeed);

        int arrayNum = scanner.nextInt();
        Tire[] tireHave = new Tire[arrayNum];

        for (int i = 0; i < arrayNum; i++) {
            Tire padangaSandeliy = new Tire();
            padangaSandeliy.setTireWidth(scanner.nextInt());
            padangaSandeliy.setTireRatio(scanner.nextInt());
            padangaSandeliy.setTireDiameter(scanner.next());
            padangaSandeliy.setPrice(scanner.nextDouble());
            tireHave[i] = padangaSandeliy;

            System.out.println("Turimi: "+padangaSandeliy);
        }

        TireWraper tireWraper = new TireWraper();
        tireWraper.setNeedTire(tireNeed);
        tireWraper.setHaveTire(tireHave);


        return tireWraper;
    }
    private static void finish(Tire[] haveTire, Tire needTire) {
        int quantity = 0;
        double price = 0;
        for (Tire tireFinish : haveTire) {
            if (calc(needTire, tireFinish)) {
                price = tireFinish.getPrice() + price;
                quantity++;
            }
        }
        System.out.println("kiek padangu: "+quantity);
        System.out.println("kokia kaina³: "+price);
    }

    private static boolean calc(Tire ieskoma, Tire turima) {
        boolean atitinka = false;

        if (ieskoma.getTireWidth() == turima.getTireWidth() &&
                ieskoma.getTireRatio() == turima.getTireRatio()
                && ieskoma.getTireDiameter().trim().equals(turima.getTireDiameter().trim())) {
            atitinka = true;
            System.out.println("atsiliepk");
        }

        return atitinka;
    }

}