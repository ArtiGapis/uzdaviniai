package lt.bt.Uzdaviniai.papildomi;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LEGO {

    /*
    Linas nusprendė 6 mėnesius taupyti pinigus LEGO robotui, kuris kainuoja a
Lt. Kiekvieną mėnesį jis skirtingą kartų kiekį n į taupyklę mesdavo pinigus. Duomenų faile
Duomenys.txt yra 6 eilutės, kuriose pirmasis skaičius nurodo, kiek kartų n tą mėnesį Linas į
taupyklę įmetė pinigų, o kiti skaičiai toje eilutėje nurodo, kiek pinigų m (litais) Linas įmetė.
Duomenų failo paskutiniojoje (septintoje) eilutėje yra nurodyta norimo LEGO roboto kaina a
(litais). Parašykite programą, kuri suskaičiuotų, kiek Linas per šešis mėnesius sutaupė pinigų ir
ar jų užteks nusipirkti norimą LEGO robotą, o rezultatus įrašytų į rezultatų failą Rezultatai.txt.
     */

    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);

        String filePath = "src\\lt\\bt\\Uzdaviniai\\txt\\Duomenys.txt";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        int elementCount = 0;   			//pavertimui
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            elementCount++;     			//pavertimui
        }
        scanner.close();
        //Paversti arejum
        scanner = new Scanner(file);

        int[] array = new int[elementCount];

        for(int i = 0; i < elementCount; i++){
            array[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println(array[1]);

        int a = 0; //roboto kaina (septinta eilute)
        int n = 0;//imesta i taupykle (faile pirmas)
        int m = 0; //kiek imete (5 eilutes)

        duomenysWraper();
        bandymas2dimenciju();
    }

    private static void duomenysWraper() {
        Scanner reader = new Scanner(System.in);
        System.out.println("startas");

        int sum = 0;
        int[] array = new int[7];

        for (int i = 0; i <= 6; i++) {
            array[i]= i;
            System.out.println(array[i]);

        }
    }

    private static void bandymas2dimenciju() {
        Scanner reader = new Scanner(System.in);
        System.out.println("startas");


        int numbers[][];
        numbers = new int[5][5];

        for (int r=0; r < numbers.length; r++) {
            for (int c=0; c < numbers[r].length; c++) {
                System.out.print(" " + numbers[r][c]);
                numbers[0][2]=2;
                numbers[0][3]=3;
            }
            System.out.println("");
        }
        numbers[0][0]=numbers[0][1]+numbers[0][2]+numbers[0][3]+numbers[0][4];
        System.out.println(numbers[0][0]);
    }

}