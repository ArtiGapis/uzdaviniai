package lt.bt.Uzdaviniai.papildomi;

import java.io.IOException;
import java.util.Scanner;

public class skaiciu_dalyba {
    public static void main(String[] args) throws IOException {
        int a=2;
        int b=5;

        arejus(a,b);
    }

    private static void arejus(int a, int b) {
        Scanner reader = new Scanner(System.in);

        int[] array = new int[b+a];

        for(int i = a; i <= b; i++){
            array[i] = i;
            System.out.println("band - "+array[i]);
            for(int i1 = a; i1 <= array[i]; i1++){

            }



            }
    }

}