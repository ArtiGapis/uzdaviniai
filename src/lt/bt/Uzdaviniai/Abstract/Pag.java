package lt.bt.Uzdaviniai.Abstract;

import lt.bt.Uzdaviniai.Abstract.Data.Apskritimas;
import lt.bt.Uzdaviniai.Abstract.Data.Kvadratas;
import lt.bt.Uzdaviniai.Abstract.Data.Trikampis;

import java.util.Scanner;

public class Pag {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Start");
        System.out.println("__________________________");

        Figura apskritimas  = new Apskritimas();
        Figura kvadratas = new Kvadratas();
        Figura trikampis = new Trikampis();
        System.out.println("Iveskite perimetra:");


        System.out.println("Plotai");
        System.out.println("Apskritimo: " +apskritimas.Plotai());
        System.out.println("Kvadrato " +kvadratas.Plotai());
        System.out.println("Trikampio " +trikampis.Plotai());

        System.out.println("__________________________");

        System.out.println("Perimetrai");
        System.out.println("Apskritimo " +apskritimas.Perimeter());
        System.out.println("Kvadrato " +kvadratas.Perimeter());
        System.out.println("Trikampio " +trikampis.Perimeter());
        System.out.println("__________________________");

        System.out.println("jaigu perimetras nurodytas ");
        System.out.println("Apskritimo plotas: " +apskritimas.PerimeterCalc());
        System.out.println("Kvadrato plotas: " +kvadratas.PerimeterCalc());
        System.out.println("Trikampio plotas: " +trikampis.PerimeterCalc());








    }
}