package lt.bt.Uzdaviniai.papildomi;

import java.io.IOException;
import java.util.Scanner;

public class gimtadienis {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        System.out.println("Kiek sausainių iškepė Tautvydas? ");
        int a = reader.nextInt();

        System.out.println("Keli draugai dar atsinešė po tiek pat sausainių? ");
        int b = reader.nextInt();

        System.out.println("Kiek žmonių iš viso dalyvavo šventėje? ");
        int c = reader.nextInt();

        dalybos(a,b,c);
    }

    private static int sausainiai(int a, int b) {
       int viso=b*a+a;

       return viso;
    }

    private static void dalybos(int a, int b,int c) {

        int ats=sausainiai(a,b)/c;
        int pap=sausainiai(a,b)%c;

        atsakymas1(ats);
        atsakymas2(pap);
    }

    private static int atsakymas1(int ats) {

        if (ats == 1) {
            System.out.println("Padalinta po " + ats + " sausaini");
        } else if (ats < 10 && ats > 1) {
            System.out.println("Padalinta po " + ats + " sausainius");
        } else System.out.println("Padalinta po " + ats + " sausainiu");

        return ats;
    }


    private static int atsakymas2(int pap){

        if (pap == 0){
            System.out.println("Papildomai sausainiu negavo");
        }
        else if (pap==1) {
            System.out.println("Papildomai gavo " + pap+" sausaini");
        }
        else if (pap<10&&pap>1) {
            System.out.println("Papildomai gavo " + pap + " sausainius");
        }
        else System.out.println("Papildomai gavo " + pap+" sausainiu");

        return pap;
    }
}