package lt.bt.Uzdaviniai;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;

public class skaiciuotuvas {
    public static void main(String[] args)throws IOException {
        Scanner reader = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {
            System.out.println("Iveskite pirma skaiciu:");
            double a = reader.nextDouble();
            System.out.println("Iveskite antra skaiciu:");
            double b = reader.nextDouble();
            System.out.println("Norima operacija :");
            System.out.println("1 = +");
            System.out.println("2 = -");
            System.out.println("3 = *");
            System.out.println("4 = /");


            int c = reader.nextInt();


            System.out.println(a);
            System.out.println(b);

            String veiksmai;
            switch (c) {
                case 1:
                    veiksmai = "atsakymas: " + (a + b);
                    break;
                case 2:
                    veiksmai = "atsakymas: " + (a - b);
                    break;
                case 3:
                    veiksmai = "atsakymas: " + (a * b);
                    break;
                case 4:
                    veiksmai = "atsakymas: " + (a / b);
                    break;

                default:
                    veiksmai = "netinkamas";
                    break;
            }
            System.out.println(veiksmai);


            System.out.println("Kartoti? (taip arba ne)");
            BufferedReader atsakymas = new BufferedReader(new InputStreamReader(System.in));

            if (atsakymas.readLine().equals("ne")) {
                stop = true;
            }
        }
    }
}