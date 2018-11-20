package lt.bt.Uzdaviniai.ciklai;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;

public class skaiciuotuvas {
    public static void main(String[] args)throws IOException {
        Scanner reader = new Scanner(System.in);
        boolean stop = false;
        while (!stop) {


            print("Iveskite pirma skaiciu:");
            double a = reader.nextDouble();

            print("Iveskite antra skaiciu:");
            double b = reader.nextDouble();

            print("Norima operacija :");
            print("1 = +");
            print("2 = -");
            print("3 = *");
            print("4 = /");

            int c = reader.nextInt();

            String ats=MatVeiksmai(a, b, c);
            print(a+" + "+b+" = "+ ats);


            print("Kartoti? (taip arba ne)");
            BufferedReader atsakymas = new BufferedReader(new InputStreamReader(System.in));

            if (atsakymas.readLine().equals("ne")) {
                stop = true;
            }
        }
    }



    private static String MatVeiksmai(double a, double b, int c){

        String veiksmai;
        switch (c) {
            case 1:
                veiksmai = " " + (a + b);
                break;
            case 2:
                veiksmai = " " + (a - b);
                break;
            case 3:
                veiksmai = " " + (a * b);
                break;
            case 4:
                veiksmai = " " + (a / b);
                break;

            default:
                veiksmai = "netinkamas";
                break;
        }
        return veiksmai;
    }

    private static void print(String n) {
        System.out.println(n);
    }

}