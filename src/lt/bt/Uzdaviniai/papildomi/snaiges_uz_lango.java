package lt.bt.Uzdaviniai.papildomi;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class snaiges_uz_lango {
    /*
    Per atostogas Simas turėjo daugiau laisvo laiko ir nutarė suskaičiuoti, kiek sningant po jo namo langu nukrenta snaigių.
    Jis pastebėjo, kad kiekvieną kitą sekundę nukrenta dvigubai daugiau snaigių, nei prieš tai buvusią.
    Parašykite programą, skaičiuojančią kiek snaigių s bus nukritę per n sekundžių, kai per pirmąją sekundę nukrito k snaigių.
     */
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        System.out.println("Įveskite, kiek snaigių nukrito per pirmąją sekundę ir kiek sekundžių snigo:");

        masyvas();

    }

    private static void masyvas() {
        Scanner reader = new Scanner(System.in);
        int a=0;
        int b=0;

        int sum=0;
        int[] array = new int[2];

        for (int i = 0; i <= 1; i++) {
            array[i] = reader.nextInt();
            a= array[0];
            b=array[1]+a;
        }

        int[] snaiges = new int[b+1];
        int band=array[0];

        for (int i = a; i <b ; i++) {

            snaiges[i]=band;
            band=band*2;
            sum = IntStream.of(snaiges).sum();
        }
        System.out.println(sum);
    }
}