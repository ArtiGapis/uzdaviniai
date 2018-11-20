package lt.bt.Uzdaviniai.ciklai;

import java.util.Scanner;

public class Uzduotis2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Pradzia");
        int a;
        System.out.println("Iveskite gimimo metus: ");
        a = reader.nextInt();
        amzius(a);
    }

    private static void amzius(int a){
        a = 2018 - a;
        if (a>=18){
            System.out.println("pilnametis " + a);
        }
        else {
            System.out.println("Nepilnametis " + a);
        }
    }
}
