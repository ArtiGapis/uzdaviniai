package lt.bt.Uzdaviniai.papildomi;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class automobilis {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        int tunelioIlgis=264;
        int s;
        System.out.println("Koks automobilio greitis?");
        int v = reader.nextInt();
        double sek=(v/3600f)*1000;
        System.out.println(sek);

       double atsakymas=tunelioIlgis/sek;

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(atsakymas));
    }
}
