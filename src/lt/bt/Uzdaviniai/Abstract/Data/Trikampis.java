package lt.bt.Uzdaviniai.Abstract.Data;

import lt.bt.Uzdaviniai.Abstract.Figura;

import java.util.Scanner;


public class Trikampis extends Figura {
    Scanner reader = new Scanner(System.in);

    @Override
    public double Plotai() {
        int a=5;

        return (Math.sqrt(3)/4)*(a*a);
    }

    @Override
    public double Perimeter() {
        int a=5;
        return 3 * a;

    }


    private double perimeter=getPerimeter();

    @Override
    public double PerimeterCalc() {
        double p=perimeter/3;
        return (p*p*Math.sqrt(3))/4;
    }
}
