package lt.bt.Uzdaviniai.papildomi;

import java.io.IOException;
import java.util.Scanner;

public class parasiutininkas {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        System.out.println("Iš kokio aukščio šoka parašiutininkas? ");
        int h = reader.nextInt();

        System.out.println("Per kiek sekundžių išsiskleidžia jo parašiutas? ");
        int t = reader.nextInt();

        double g = 9.8f; //laisvojo kritimo greitis

        sprendimas(h, g, t);
    }

    private static void sprendimas(double h, double g, double t) {
        double ats = Math.sqrt((2 * h) / g);
        atsakimas(ats, t);
    }

    private static void atsakimas(double ats, double t) {
        if (ats > t) {
            System.out.println("Parašiutas išsiskleis");
        } else {
            System.out.println("Parašiutas neišsiskleis");
        }
    }
}