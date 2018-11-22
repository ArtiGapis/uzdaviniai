package lt.bt.Uzdaviniai.papildomi;

import java.io.IOException;
import java.util.Scanner;

public class puodeliai {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        System.out.println("kiek turite puodeliu?");
        int m = reader.nextInt();

        double supakuosim = m / 3;
        double liko = m % 3f;

        if (liko > 1){

            System.out.println("liko " + liko + " nesupakuoti puodeliai");
        }
        else System.out.println("liko " + liko + " nesupakuotas puodelis");

        if (supakuosim == 1){

            System.out.println("Supakuota " + supakuosim+ " deze");
        }
        else if (supakuosim<10&&supakuosim!=0) {
            System.out.println("Viso supakuotos " + supakuosim + " dezes");
        }
        else System.out.println("Viso supakuotu " + supakuosim + " deziu");

    }
}