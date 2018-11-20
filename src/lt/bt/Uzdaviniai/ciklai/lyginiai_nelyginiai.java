package lt.bt.Uzdaviniai.ciklai;

import java.util.Scanner;

public class lyginiai_nelyginiai {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaiciu :");
        int alyg = reader.nextInt();

        ivestis();
        NElyginis(alyg);
    }


    private static void ivestis(){
        System.out.println();
    }

    private static void NElyginis(int alyg){
        if((alyg%2)==0){
            System.out.println("Lyginis skaicius");
        }
        else { System.out.println("Nelyginis skaicius");}
    }
}
