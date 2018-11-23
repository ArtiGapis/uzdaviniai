package lt.bt.Uzdaviniai.papildomi;

import java.io.IOException;
import java.util.Scanner;

public class saldainiai {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        System.out.println("Kiek saldainių gauna Marius? ");
        int n = reader.nextInt();

        System.out.println("Po kiek saldainių suvalgo? ");
        int a = reader.nextInt();

        System.out.println("Kelios dienos liko iki Kalėdų? ");
        int k = reader.nextInt();

        keliems(n, a, k);
        liko(n, a, k);

    }

    private static int saldainiai(int n, int a, int k) {
        int viso=(n-a)*k;
        return viso;
    }

    private static void keliems(int n, int a, int k) {

        int dovana=saldainiai(n,a,k)/a;

        if (dovana == 1) {
            System.out.println("Marius dovana paruoš " + dovana + " draugui");
        }
        else if (dovana < 10 && dovana > 1) {
            System.out.println("Marius dovanas paruoš " + dovana + " draugams");
        }
        else if (dovana==0) {
            System.out.println("Marius nesupakuos ne vienosdovanos");
        }
        else System.out.println("Marius dovanas paruoš " + dovana + " draugu");
    }

    private static void liko(int n, int a, int k) {

        int lik=saldainiai(n,a,k)%a;

        if (lik == 1) {
            System.out.println("Supakavus dovanas liks " + lik + " saldainis");
        }
        else if (lik < 10 && lik > 1) {
            System.out.println("Supakavus dovanas liks " + lik + " saldainiai");
        }
        else if (lik==0) {
            System.out.println("Supakavus dovanas saldainiu neliks");
        }
        else System.out.println("Supakavus dovanas liks " + lik + " saldainiu");

    }

}