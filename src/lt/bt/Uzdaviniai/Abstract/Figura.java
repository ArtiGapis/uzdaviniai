package lt.bt.Uzdaviniai.Abstract;

public abstract class Figura {

    public abstract double Plotai();

    public abstract double Perimeter();

    public abstract double PerimeterCalc();

    private double perimeter;

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {this.perimeter = perimeter; }

}

