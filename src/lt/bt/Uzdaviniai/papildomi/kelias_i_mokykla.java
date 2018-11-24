package lt.bt.Uzdaviniai.papildomi;

import java.io.IOException;
import java.util.Scanner;

public class kelias_i_mokykla {
    /*
        Kiekvieną dieną Petriukas, eidamas į mokyklą, skaičiuoja kiekvieną savo žingsnį ir žaidžia tokį žaidimą:
         kai žingsnių skaičius baigiasi nuliu, Petriukas suploja rankomis, o kai penketu - spragteli pirštais.
         Parašykite programą, kuri suskaičiuotų, kiek kartų Petriukas suplos rankomis ir kiek – spragtels pirštais,
         jei jam iki mokyklos yra lygiai n žingsnių.
    */
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        int sprakteli=0;
        int ploja=0;

        System.out.println("Įveskite žingsnių kiekį iki mokyklos:");

        arejus(sprakteli,ploja);
    }

    private static void arejus(int sprakteli,int ploja) {
        Scanner reader = new Scanner(System.in);
        int n=reader.nextInt();

        int[] array = new int[n+1];

        for(int i = 1; i <= n; i++){
            array[i] = i;
            if (array[i]%5==0&&array[i]%10!=0){
                sprakteli++;
            }
            if (array[i]%10==0){
                ploja++;
            }
        }
        System.out.println("Suplojimų bus: "+ploja);
        System.out.println("Spragtelėjimų bus: "+sprakteli);
    }
}