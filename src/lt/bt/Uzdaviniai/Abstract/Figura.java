package lt.bt.Uzdaviniai.Abstract;

import java.util.Scanner;

public abstract class Figura {
    Scanner reader = new Scanner(System.in);
    public abstract double Plotai();

    public abstract double Perimeter();

    public abstract double PerimeterCalc();

    private double perimeter=reader.nextDouble();


    public double getPerimeter() {
        return perimeter;
    }
  public void setPerimeter(double perimeter) {this.perimeter = perimeter; }

}

