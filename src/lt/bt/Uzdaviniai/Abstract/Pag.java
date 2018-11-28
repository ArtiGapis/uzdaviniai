package lt.bt.Uzdaviniai.Abstract;

import lt.bt.Uzdaviniai.Abstract.Data.Apskritimas;
import lt.bt.Uzdaviniai.Abstract.Data.Kvadratas;
import lt.bt.Uzdaviniai.Abstract.Data.Trikampis;

public class Pag {
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println("__________________________");

        Figura apskritimas  = new Apskritimas();
        Figura kvadratas = new Kvadratas();
        Figura trikampis = new Trikampis();

        System.out.println("Plotai");
        System.out.println("aps " +apskritimas.Plotai());
        System.out.println("aps " +kvadratas.Plotai());
        System.out.println("aps " +trikampis.Plotai());

        System.out.println("__________________________");

        System.out.println("Perimetrai");
        System.out.println("aps " +apskritimas.Perimeter());
        System.out.println("aps " +kvadratas.Perimeter());
        System.out.println("aps " +trikampis.Perimeter());








    }
}