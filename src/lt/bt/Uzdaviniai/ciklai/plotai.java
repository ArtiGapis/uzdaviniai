package lt.bt.Uzdaviniai.ciklai;

import java.util.Scanner;

public class plotai {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("hello world");
        int n;
        System.out.println("Pasirinkite ka norite skaiciuoti:");
        System.out.println("Jai trikampi iveskite: 1;");
        System.out.println("Jai staciakampi iveskite: 2;");
        System.out.println("Jai skritulys iveskite: 3;");
        System.out.println("Jei patikrinti lyginius nelyginius skaicius iveskite: 4;");
        System.out.println("Jei patikrinti kvadratine lygti: 5;");
        n = reader.nextInt();
        System.out.println(n);
        int a,b,c,akv,bkv,Skv,r;
        double P,S;
        if (n==1) {
            System.out.println("Iveskite krastine a:");
            a = reader.nextInt();
            System.out.println("Iveskite krastine b:");
            b = reader.nextInt();
            System.out.println("Iveskite krastine c:");
            c = reader.nextInt();
            P = a + b + c;
            P = P / 2;
            S = Math.sqrt(P * (P - a) * (P - b) * (P - c));
            System.out.println("trikapio plotas " + S);
        }
        else if (n==2) {
            System.out.println("iveskite pirma krastine:");
            akv = reader.nextInt();
            System.out.println("Iveskite antrakrastine:");
            bkv = reader.nextInt();
            Skv = akv * bkv;
            System.out.println("Staciakampio plotas: " + Skv);
        }
        else if (n==3){
            System.out.println("Iveskite spinduli :");
            r = reader.nextInt();
            double Sap = Math.PI * (r * r);
            System.out.println("Skritulio plotas: " + Sap);
        }
        else if (n==4){
            int alyg;
            System.out.println("Iveskite skaiciu :");
            alyg = reader.nextInt();
            if((alyg%2)==0){
                System.out.println("Lyginis skaicius");
            }
            else { System.out.println("Nelyginis skaicius");}
        }
        else  {
            System.out.println("bloga ivestis");
            reader.close();

        }
    }
}

