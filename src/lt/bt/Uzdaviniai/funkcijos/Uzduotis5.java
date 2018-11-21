package lt.bt.Uzdaviniai.funkcijos;

import java.io.IOException;
import java.util.Scanner;

public class Uzduotis5 {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        int[] array = {3, 4, 5, 7, 4, 22, 11, 3, 5, 6, 6};

        print("iveskite skaiciu");

        int n = reader.nextInt();
       skaicius(array, n);

    }

    private static void print(String n) {
        System.out.println(n);
    }
    private static void skaicius(int[] array, int n){

        for(int i = 0; i < array.length; i++){
            if(array[i]==n) {

                System.out.println(array[i]);

            }

        }
    }
}
