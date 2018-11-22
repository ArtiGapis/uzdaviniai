package lt.bt.Uzdaviniai.papildomi;

import java.io.IOException;
import java.util.Scanner;

public class akvariumas {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        System.out.println("kiek zuvu akvariume?");
        int a = reader.nextInt();

        System.out.println("kiek zuvu idedate kiekviena diena?");
        int b = reader.nextInt();

        System.out.println("kiek dienu praejo?");
        int c = reader.nextInt();

        int ats=a+b*c;

        System.out.println("Po "+c+" dienu gyvena: "+ats);
    }

}
