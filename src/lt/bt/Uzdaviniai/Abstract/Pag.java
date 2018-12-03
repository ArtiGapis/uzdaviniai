package lt.bt.Uzdaviniai.Abstract;

import lt.bt.Uzdaviniai.Abstract.Data.Apskritimas;
import lt.bt.Uzdaviniai.Abstract.Data.Kvadratas;
import lt.bt.Uzdaviniai.Abstract.Data.Trikampis;

import java.util.Scanner;

public class Pag {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Iveskite triju figuru perimetra");
        pirmasAts();
    }

    private static void pirmasAts() {
        Figura apskritimas  = new Apskritimas();
        Figura kvadratas = new Kvadratas();
        Figura trikampis = new Trikampis();

        System.out.println("Apskritimo plotas: " +apskritimas.PerimeterCalc());
        System.out.println("Kvadrato plotas: " +kvadratas.PerimeterCalc());
        System.out.println("Trikampio plotas: " +trikampis.PerimeterCalc());
        System.out.println("__________________________");
    }
}