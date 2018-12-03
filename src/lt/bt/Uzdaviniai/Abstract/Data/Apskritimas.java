package lt.bt.Uzdaviniai.Abstract.Data;

import lt.bt.Uzdaviniai.Abstract.Figura;

import java.util.Scanner;

public class Apskritimas extends Figura {

    Scanner reader = new Scanner(System.in);

    private double perimeter=getPerimeter();

    @Override
    public double PerimeterCalc() {
        double band=perimeter/(2*Math.PI);
        return Math.PI * Math.pow(band, 2);
    }
}
