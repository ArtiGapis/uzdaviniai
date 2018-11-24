package lt.bt.Uzdaviniai.papildomi;

import java.io.IOException;
import java.util.Scanner;

public class konkursas {

    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        System.out.println("Įveskite intervalo pradžią:");
        int a = reader.nextInt();

        System.out.println("Įveskite intervalo pabaigą:");
        int b = reader.nextInt();

        int m=0;

        System.out.println("Reikalingų marškinėlių skaičius: "+arejus(a,b,m));

    }

    private static int arejus(int a, int b, int m) {
        Scanner reader = new Scanner(System.in);

        int[] array = new int[b+a];
        int arraySize = a;

        for(int i = a; i <= b; i++){
            array[i] = i;
            arraySize++;
        }

        for(int i = a; i < arraySize; i++){
            if (array[i]%6==0){
                m++;
            }
        }
        return m;
    }
}