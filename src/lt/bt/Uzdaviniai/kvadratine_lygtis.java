package lt.bt.Uzdaviniai;

import java.util.Scanner;

public class kvadratine_lygtis {
    public static void main(String[] args) {
        System.out.print("Kintamasis a: ");
        Scanner reader = new Scanner(System.in);
        double a2 = reader.nextInt();
        System.out.print("Kintamasis b: ");
        double b2 = reader.nextInt();
        System.out.print("Kintamasis c: ");
        double c2 = reader.nextInt();
        double result = b2 * b2 - 4.0 * a2 * c2;
        if (result > 0.0) {
            double r1 = (-b2 + Math.pow(result, 0.5)) / (2.0 * a2);
            double r2 = (-b2 - Math.pow(result, 0.5)) / (2.0 * a2);
            System.out.println(r1 + r2);
        } else if (result == 0.0) {
            double r1 = -b2 / (2.0 * a2);
            System.out.println(r1);
        } else {
            System.out.println("Nera saknu.");
        }
    }
}
