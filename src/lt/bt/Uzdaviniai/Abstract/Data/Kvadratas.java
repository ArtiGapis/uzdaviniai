package lt.bt.Uzdaviniai.Abstract.Data;

import lt.bt.Uzdaviniai.Abstract.Figura;

public class Kvadratas extends Figura {

    @Override
    public double Plotai() {
        int a=5;
        int b=5;

        return a * b;
    }

    @Override
    public double Perimeter() {
        int a=5;
        return 4*a;
    }
    @Override
    public double PerimeterCalc() {
        double perimeter=100;
        int plotas;
        plotas=Math.pow(perimeter/4);
        return 0;
    }
}
