package lt.bt.Uzdaviniai.papildomi;

import java.io.IOException;
import java.util.Scanner;

public class pamokos {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);


        System.out.println("kiek pamoku pirmadieni: ");
        int a = reader.nextInt();

        System.out.println("kiek pamoku antradieni: ");
        int b = reader.nextInt();

        System.out.println("kiek pamoku treciadieni: ");
        int c = reader.nextInt();

        System.out.println("kiek pamoku ketvirtadieni: ");
        int d = reader.nextInt();

        System.out.println("kiek pamoku penktadieni: ");
        int e = reader.nextInt();

        int viso = (a + b + c + d + e) * 45;

        System.out.println("isviso: " + viso);
    }
}
