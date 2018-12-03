package lt.bt.Uzdaviniai.Abstract;

import java.util.Scanner;

public abstract class Figura {
    Scanner reader = new Scanner(System.in);

    public abstract double PerimeterCalc();

    private double perimeter=reader.nextInt();



    public double getPerimeter() {
        return perimeter;
    }
  public void setPerimeter(double perimeter) {this.perimeter = perimeter; }

}

