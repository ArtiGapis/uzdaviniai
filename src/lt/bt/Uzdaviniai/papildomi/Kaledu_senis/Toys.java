package lt.bt.Uzdaviniai.papildomi.Kaledu_senis;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Toys {
    private String zaisloPavadinimas="as";
    private int quantity;
    private int used;



    public Toys() {

    }

    public Toys(String zaisloPavadinimas, int quantity, int used) {
        super();
        this.zaisloPavadinimas = zaisloPavadinimas;
        this.quantity = quantity;
        this.used = used;
    }

    public static List<Toys> listinis() throws IOException {
        BufferedReader br =new BufferedReader(new FileReader("src\\lt\\bt\\Uzdaviniai\\txt\\Kaledos\\duomenys.txt"));
        String line = null;
        List<Toys> toys = new LinkedList<>();
        while ((line = br.readLine()) != null) {
            String[] values = line.split(", ");
            Toys toy = new Toys();
            toy.setZaisloPavadinimas(values[0]);
            toy.setQuantity(Integer.parseInt(values[1]));
            toys.add(toy);
        }
        return toys;
    }

    public static void calcToys() throws IOException {
        List<Toys> toys = Toys.listinis();
        for (int i=0; i<toys.size(); i++){
            Toys toy = new Toys.listinis();
            Child child = new Child();

            int b=1;

            System.out.println("calcToys: "+toy.getZaisloPavadinimas());
            //System.out.println("Noras: "+Child.child());

//            if ( toy.getZaisloPavadinimas().equals(child.getWish())){
//                toy.setUsed(b++);
//                System.out.println("calcToys: "+child.getWish());
//            }

        }


    }

    public String getZaisloPavadinimas() {
        return zaisloPavadinimas;
    }

    public void setZaisloPavadinimas(String zaisloPavadinimas) {
        this.zaisloPavadinimas = zaisloPavadinimas;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUsed(){
        return used;
    }

    public void setUsed(int used){
        this.used = used;
    }

    @Override
    public String toString(){
        return "\r\n"+"Zaislas: " + zaisloPavadinimas + " Kiekis: " + quantity + " Panaudota: "+used;
    }

    private static class listinis extends Toys {
    }
}



