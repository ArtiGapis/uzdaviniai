package lt.bt.Uzdaviniai;

import java.util.Scanner;

public class Plotas {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
	// write your code here
        System.out.println("hello world");
    int a,b,c;
    double P,S;
    System.out.println("Iveskite krastine a");
    a = reader.nextInt();
        System.out.println("Iveskite krastine b");
    b = reader.nextInt();
        System.out.println("Iveskite krastine c");
    c = reader.nextInt();
    P = a + b + c;
        P = P/2;
        S = Math.sqrt(P*(P-a)*(P-b)*(P-c));

        System.out.println("trikapio plotas "+S);


    }
}