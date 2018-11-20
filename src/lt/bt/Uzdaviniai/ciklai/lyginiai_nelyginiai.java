package lt.bt.Uzdaviniai.ciklai;

import java.util.Scanner;

public class lyginiai_nelyginiai {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int alyg;
        System.out.println("Iveskite skaiciu :");
        alyg = reader.nextInt();
        if((alyg%2)==0){
            System.out.println("Lyginis skaicius");
        }
        else { System.out.println("Nelyginis skaicius");}
    }
}
