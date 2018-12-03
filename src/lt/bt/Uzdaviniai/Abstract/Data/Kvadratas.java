package lt.bt.Uzdaviniai.Abstract.Data;

import lt.bt.Uzdaviniai.Abstract.Figura;

import java.util.Scanner;

public class Kvadratas extends Figura {
    Scanner reader = new Scanner(System.in);

    private double perimeter=getPerimeter();

    @Override
    public double PerimeterCalc() {
        return Math.pow(perimeter/4, 2);
    }
}
