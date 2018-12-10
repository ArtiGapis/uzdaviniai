package lt.bt.Uzdaviniai.papildomi.Kaledu_senelis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Santa {

    /*
     Artėja šv. Kalėdos, ir Kalėdų seneliui reikia pagalbos ruošiant dovanas vaikams.
     Vaikai siunčia laiškus su savo norais. Kalėdų senelis turi duomenų apie kiekvieną vaiką, ar jis buvo geras,
     elgėsi gerai ir klausė tėvų. Priklausomai nuo vaiko gerumo priklauso ir tai, ką jis gaus dovanų, t.y.
     ar jam dovanoti tai ko jis nori, ar maišą anglių. Tačiau Kalėdų seneliui  laiškus siunčia ne vien vaikai,
     tad jis nepildo vyresniu vaikų nei 15 metų norus. Ankstesniais metais, elfai tiesiogiai gaudavo vaikų laiškus
     ir gamindavo visus žaislus, tačiau Kalėdų senelis ne visus juos padovanojo, nes ne visi vaikai buvo geri.
     Tad elfų sandėlyje yra žaislų, kurie jau pagaminti. Reikia jiems pagalbos su žaislų apskaita, t.y.
     jie nežino kokius žaislus reikia pagaminti, o kokie jau yra sandėlyje ir kokius galima išardyti
     ir jų detales panaudoti kitų žaislų gamybai. Parašykite programą, kuri sudarytų sąrašą, kuriuos žaislus reikia pagaminti,
     kuriuos išardyti ir ar reikia papildyti anglių maišų atsargas. Paruoškite sąrašą Kalėdų seneliui su vaikų sąrašu ir
     jų adresais ir kokią dovaną jie gaus.
     */

    public static void main(String[] args) throws FileNotFoundException {

        //System.out.println(readToys());
        //System.out.println(readChildren());
        System.out.println(wishes());

    }

    private static List<ElfWarehouse> readToys() throws FileNotFoundException {
        String filePath = "src\\lt\\bt\\Uzdaviniai\\txt\\Kaledos\\duomenys.txt";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        List<ElfWarehouse> toys = new LinkedList<>();
        while (scanner.hasNext()) {
            ElfWarehouse elfWarehouse = new ElfWarehouse();
            elfWarehouse.setToyName(scanner.findInLine("[A-Ža-ž].*[A-Ža-ž]"));
            scanner.next();
            elfWarehouse.setQuantity(scanner.nextInt());
            scanner.nextLine();
            toys.add(elfWarehouse);
        }
        return toys;
    }

    private static List<ChildrenList> readChildren() throws FileNotFoundException {
        String filePath = "src\\lt\\bt\\Uzdaviniai\\txt\\Kaledos\\charakteristikos.txt";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        List<ChildrenList> child = new LinkedList<>();
        while (scanner.hasNext()) {
            ChildrenList childrenList = new ChildrenList();
            childrenList.setChildName(scanner.next());
            if (childrenList.getChildName().endsWith(",")) {
                childrenList.setChildName(childrenList.getChildName().substring(0, childrenList.getChildName().length() - 1));
            }
            childrenList.setChildSurname(scanner.next());
            if (childrenList.getChildSurname().endsWith(",")) {
                childrenList.setChildSurname(childrenList.getChildSurname().substring(0, childrenList.getChildSurname().length() - 1));
            }
            childrenList.setCarma(scanner.next());
            child.add(childrenList);

        }
        return child;
    }

    private static List<ChildrenWishes> wishes() throws FileNotFoundException {
        String filePath = "src\\lt\\bt\\Uzdaviniai\\txt\\Kaledos\\norai.txt";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);


        List<ChildrenWishes> wish = new LinkedList<>();
        while(scanner.hasNextLine()){
            String value = scanner.next();
            String[] values = value.split(",");


            System.out.println(Arrays.toString(values));
        }

        return wish;
    }
}
