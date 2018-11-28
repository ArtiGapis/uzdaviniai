package lt.bt.Uzdaviniai.Abstract.Data;

import lt.bt.Uzdaviniai.Abstract.Figura;

public class Apskritimas extends Figura {

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
        double perimeter=5;
        double plotas=0;
        double band=perimeter/(2*Math.PI);
        plotas=Math.PI * Math.pow(band);
        return band;
    }


}
