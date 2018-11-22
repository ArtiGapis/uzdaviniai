package lt.bt.Uzdaviniai.papildomi;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class statybininkai {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        DecimalFormat plyt = new DecimalFormat("#");
        DecimalFormat litai = new DecimalFormat("#.00");

        System.out.println("Koks sienos ingis metrais?");
        double a = reader.nextInt();

        System.out.println("Koks sienos aukstis metrais?");
        double h = reader.nextInt();


        double kaina=0.5;

        double siena=a*h;
        double plyta=20/100f*10/100f;
        double kiekis=siena/plyta;
        double ats=kiekis*kaina;

        System.out.println("Rekes " +plyt.format(kiekis)+" plytu.");
        System.out.println("Viso kainuos "+litai.format(ats)+" Lt");



    }
}