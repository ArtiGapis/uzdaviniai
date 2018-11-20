package lt.bt.Uzdaviniai.ciklai;

import java.util.Scanner;

public class kvadratine_lygtis {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Kintamasis a: ");
        double a2 = reader.nextInt();
        System.out.print("Kintamasis b: ");
        double b2 = reader.nextInt();
        System.out.print("Kintamasis c: ");
        double c2 = reader.nextInt();

        double ats=kvadratine(a2, b2, c2);
        System.out.print(ats);

    }




    private static double kvadratine(double a, double b, double c){
        double result = b * b - 4.0 * a * c;
        if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println(r1 + r2);
        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println(r1);
        } else {
            System.out.println("Nera saknu.");
        }
        return result;
    }
}
