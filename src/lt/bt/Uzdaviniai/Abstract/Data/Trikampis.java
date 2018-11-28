package lt.bt.Uzdaviniai.Abstract.Data;

import lt.bt.Uzdaviniai.Abstract.Figura;

public class Trikampis extends Figura {

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
    @Override
    public double PerimeterCalc() {

        return 0;
    }


}
