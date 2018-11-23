package lt.bt.Uzdaviniai.papildomi;

import java.io.IOException;
import java.util.Scanner;

public class keltas {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        System.out.println("Automobilių skaičius:");
        int k = reader.nextInt();

        System.out.println("Į keltą telpa automobilių:");
        int m = reader.nextInt();

        keltas(k, m);

    }

    private static void keltas(int k, int m) {

        int perkels=k/m;
        int neperkels=k%m;

        if (neperkels == 0){

            System.out.println("Keltas neplauks");
        }
        else if (neperkels==1) {
            System.out.println("Keltas plauks " + perkels+" karta");
        }
        else if (neperkels<10&&neperkels>1) {
            System.out.println("Keltas plauks " + perkels+" kartus");
        }
        else System.out.println("Keltas plauks " + perkels+" kartu");


        if (neperkels == 0){
            System.out.println("Visi automobiliai perkelti");
        }
        else if (neperkels==1) {
            System.out.println("Liks " + neperkels+" automobilis");
        }
        else if (neperkels<10&&neperkels>1) {
            System.out.println("Keltas neperkels " + neperkels + " automobilius");
        }
        else System.out.println("Keltas neperkels " + neperkels+" automobiliu");
    }
}