package lt.bt.Uzdaviniai.ciklai;

import java.util.Scanner;

public class lyginiai_nelyginiai {
    public static void main(String[] args) {


        ivestis();
        NElyginis();
    }


    private static void ivestis(){
        System.out.println("Iveskite skaiciu :");
    }

    private static void NElyginis(){
        Scanner reader = new Scanner(System.in);
        int alyg = reader.nextInt();

        if((alyg%2)==0){
            System.out.println("Lyginis skaicius");
        }
        else { System.out.println("Nelyginis skaicius");}
    }
}
