package lt.bt.Uzdaviniai.funkcijos;

import java.io.IOException;
import java.util.Scanner;

public class Uzduotis5 {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {

            int[] array = {3, 4, 5, 7, 4, 22, 11, 3, 5, 6, 6};
            int x=0;
            print("iveskite skaiciu:");
            int n = reader.nextInt();


           x= skaicius(array, n);
            isvestis(x, n);


        }
    }

    private static void print(String n) {
        System.out.println(n);
    }

    private static int skaicius(int[] array, int n){
            int x=0;
        for(int i = 0; i < array.length; i++){

            if(array[i]==n) {
                x= x+1;
            }
        }
        return x;
    }
    private static void isvestis(int x,int n){
        if(x==0){
            print("Tokio skaiciaus nera");
        }
        else print("skaicius: "+n+" pasikartoja: "+x+" kartu");

    }
}
