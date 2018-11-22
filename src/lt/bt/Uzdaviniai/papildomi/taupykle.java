package lt.bt.Uzdaviniai.papildomi;

import java.io.IOException;
import java.util.Scanner;

public class taupykle {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);


        System.out.println("kiek turite monetu po 5ct?");
        int a = reader.nextInt();

        System.out.println("kiek turite monetu po 20ct?");
        int b = reader.nextInt();

        System.out.println("kiek turite monetu po 2LT?");
        int c = reader.nextInt();

        double d=(a*5+b*20+c*200)/100f;

        System.out.println("ATS "+d);
    }
}
