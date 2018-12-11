package lt.bt.Uzdaviniai.papildomi.Kaledu_senelis;

import java.io.*;
import java.util.LinkedList;
import java.util.List;


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

     15 m ir vyresnius atmesti

     vaikas geras ar blogas geram zaislas blogam anglys

     kokius zaislus pagaminti

     kokius isardyti

     kiek reikia angliu
     */

    public static void main(String[] args) throws IOException {


        System.out.println(readToys());
        System.out.println(readChildren());
        System.out.println(wishes());
    }

    private static List<ElfWarehouse> readToys() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\lt\\bt\\Uzdaviniai\\txt\\Kaledos\\duomenys.txt"));
        String line = null;
        List<ElfWarehouse> toys = new LinkedList<>();
        while ((line = br.readLine()) != null) {
            String[] values = line.split(", ");
            ElfWarehouse elfWarehouse = new ElfWarehouse();
            elfWarehouse.setToyName(values[0]);
            elfWarehouse.setQuantity(Integer.parseInt(values[1]));
            toys.add(elfWarehouse);
        }
        br.close();
        return toys;
    }

    private static List<ChildrenList> readChildren() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\lt\\bt\\Uzdaviniai\\txt\\Kaledos\\charakteristikos.txt"));
        String line = null;
        List<ChildrenList> child = new LinkedList<>();
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            ChildrenList childrenList = new ChildrenList();
            childrenList.setChildName(values[0]);
            childrenList.setChildSurname(values[1]);
            childrenList.setCarma(values[2]);
            child.add(childrenList);
        }
        br.close();
        return child;
    }

    private static List<ChildrenWishes> wishes() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\lt\\bt\\Uzdaviniai\\txt\\Kaledos\\norai.txt"));
        String line = null;
        List<ChildrenWishes> wish = new LinkedList<>();
        while ((line = br.readLine()) != null) {
            String[] values = line.split(", ");
            ChildrenWishes childrenWishes = new ChildrenWishes();
            childrenWishes.setChildName(values[0]);
            childrenWishes.setChildSurname(values[1]);
            childrenWishes.setAge(Integer.parseInt(values[2]));
            childrenWishes.setAdress(values[3]);
            childrenWishes.setWish(values[4]);
            wish.add(childrenWishes);
        }
        br.close();
        return wish;
    }
}
