package lt.bt.Uzdaviniai;

import java.util.Scanner;

public class SkaiciausPavadinimas {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Iveskite skaiciu nuo 1 iki 10:");
        int n = reader.nextInt();

        String skaiciai;
        switch (n) {
            case 1:
                skaiciai = "Vienas";
                break;
            case 2:
                skaiciai = "Du";
                break;
            case 3:
                skaiciai = "Tris";
                break;
            case 4:
                skaiciai = "Keturi";
                break;
            case 5:
                skaiciai = "Penki";
                break;
            case 6:
                skaiciai = "Sesi";
                break;
            case 7:
                skaiciai = "Septyni";
                break;
            case 8:
                skaiciai = "Astuoni";
                break;
            case 9:
                skaiciai = "Devyni";
                break;
            case 10:
                skaiciai = "Desimt";
                break;
            default:
                skaiciai = "netinkamas skaicius";
                break;
        }
        System.out.println(skaiciai);
    }
}
