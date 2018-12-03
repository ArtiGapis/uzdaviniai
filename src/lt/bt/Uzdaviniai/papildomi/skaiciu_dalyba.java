package lt.bt.Uzdaviniai.papildomi;

import java.io.IOException;
import java.util.Scanner;

public class skaiciu_dalyba {
    public static void main(String[] args) {
        int a=2;
        int b=5;

        arejus(a,b);
    }

    private static void arejus(int a, int b) {
        Scanner reader = new Scanner(System.in);

        int[][] array = new int[b][b];
        for(int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++){
                array[i][j] = i + a;
                array[i][j] = j + a;
                System.out.println("arrays - " + array[0][i]);
            }
        }System.out.println("arrayOut - "+array[0]);

    }


}