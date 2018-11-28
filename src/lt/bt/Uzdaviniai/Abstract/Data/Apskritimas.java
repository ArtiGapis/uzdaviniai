package lt.bt.Uzdaviniai.Abstract.Data;

import lt.bt.Uzdaviniai.Abstract.Figura;

public class Apskritimas extends Figura {

    public double perimeter;

    @Override
    public double Plotai() {
                int r=5;
        return Math.PI * (r * r);
    }

    @Override
    public double Perimeter() {
        int r=5;
        return 2 * Math.PI * r;
    }

    @Override
    public double PerimeterCalc() {
        double band=perimeter/(2*Math.PI);
        return Math.PI * Math.pow(band, 2);
    }
}
