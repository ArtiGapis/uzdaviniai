package lt.bt.Uzdaviniai.ciklai;

import java.util.Scanner;

public class plotai {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n,a,b,c,akv,bkv,r;

        print("Pasirinkite ka norite skaiciuoti:");
        print("Jai trikampi iveskite: 1;");
        print("Jai staciakampi iveskite: 2;");
        print("Jai skritulys iveskite: 3;");
        print("Jei patikrinti lyginius nelyginius skaicius iveskite: 4;");
        print("Jei patikrinti kvadratine lygti: 5;");

        n = reader.nextInt();


        if (n==1) {
            print("Iveskite krastine a:");
            a = reader.nextInt();
            print("Iveskite krastine b:");
            b = reader.nextInt();
            print("Iveskite krastine c:");
            c = reader.nextInt();

            double ats = TrikapioPlotas(a, b, c);
            print("Trikampio plotas:  " + ats);
        }

        else if (n==2) {
            print("iveskite pirma krastine:");
            akv = reader.nextInt();
            print("Iveskite antrakrastine:");
            bkv = reader.nextInt();

            int ats = StaciakampioPlotas(akv, bkv);
            print("Staciakampio plotas:  " + ats);
        }

        else if (n==3){
            print("Iveskite spinduli :");
            r = reader.nextInt();

            double ats = SkritulioPlotas(r);
            print("Skritulio plotas:  "+ats);
        }

        else if (n==4){
            int alyg;
            print("Iveskite skaiciu :");
            alyg = reader.nextInt();

            NeLyg(alyg);
        }

        else  {
            print("bloga ivestis");
            reader.close();

        }
    }





    private static void print(String n) {
        System.out.println(n);
    }

    private static double TrikapioPlotas(int a, int b, int c){
        double P = (a + b + c)/2;
        double S = Math.sqrt(P * (P - a) * (P - b) * (P - c));
        return S;
    }

    private static int StaciakampioPlotas(int akv, int bkv){
        int Skv = akv * bkv;
        return Skv;
    }

    private static double SkritulioPlotas(int r){
        double Sap = Math.PI * (r * r);
        return Sap;
    }

    private static void NeLyg(int alyg) {
        if ((alyg % 2) == 0) {
            System.out.println("Lyginis skaicius");
        }
        else {
            System.out.println("Nelyginis skaicius");
        }
    }
}

