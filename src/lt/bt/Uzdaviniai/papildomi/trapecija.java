package lt.bt.Uzdaviniai.papildomi;

import java.io.IOException;
import java.util.Scanner;

public class trapecija {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        System.out.println("Koks trapecijos ilgesniojo pagrindo ilgis?");
        int a = reader.nextInt();

        System.out.println("Koks trapecijos trumpesniojo pagrindo ilgis?");
        int b = reader.nextInt();

        System.out.println("Koks trapecijos aukštinės ilgis?");
        int h = reader.nextInt();

       double area = 0.5f * (a + b) * h;
        System.out.println("Trapecijos plotas: "+area);
    }
}