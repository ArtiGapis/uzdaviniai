package lt.bt.Uzdaviniai.papildomi;

import java.io.IOException;
import java.util.Scanner;

public class konkursas {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        int a = 5; //intervalo pradzia
        int b = 24; //intervalo pabaiga

        arejus(a,b);
    }

    private static void arejus(int a, int b) {
        Scanner reader = new Scanner(System.in);

        int elementai=0;

        //int[] array = new int[elementai];
        int[] masyvas = new int[50];
        for(int as = a; as <= b; as++){

            System.out.println("pirmas" +as);

        }

        for (int i=0;i < masyvas.length; i++) {
            masyvas[i] = reader.nextInt();
            System.out.println("antras" +masyvas.length);
        }
    }
}