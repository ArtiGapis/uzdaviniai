package lt.bt.Uzdaviniai.Abstract.Data;

import lt.bt.Uzdaviniai.Abstract.Figura;

import java.util.Scanner;


public class Trikampis extends Figura {
    Scanner reader = new Scanner(System.in);


    private double perimeter=getPerimeter();

    @Override
    public double PerimeterCalc() {
        double p=perimeter/3;
        return (p*p*Math.sqrt(3))/4;
    }
}
