package lt.bt.Uzdaviniai.papildomi.Kaledu_senis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Child {
    private String name;
    private String surname;
    private int age;
    private String adress;
    private String wish;
    private String charakter;

    public Child(String name, String surname, int age, String adress, String wish) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
        this.wish = wish;
    }

    public Child() {

    }

    public static List<Child> child() throws IOException {
        BufferedReader brNorai =new BufferedReader(new FileReader("src\\lt\\bt\\Uzdaviniai\\txt\\Kaledos\\norai.txt"));
        BufferedReader brCharakter =new BufferedReader(new FileReader("src\\lt\\bt\\Uzdaviniai\\txt\\Kaledos\\charakteristikos.txt"));
        String lineNorai = null;
        String lineCharakter = null;
        List<Child> children = new LinkedList<>();
        while (((lineNorai = brNorai.readLine()) != null)&&((lineCharakter = brCharakter.readLine()) != null)) {
            String[] valuesNorai = lineNorai.split(", ");
            String[] valuesCharakter = lineCharakter.split(", ");
            if (Integer.parseInt(valuesNorai[2])<15){
                Child child = new Child();
                child.setName(valuesNorai[0]);
                child.setSurname(valuesNorai[1]);
                child.setAge(Integer.parseInt(valuesNorai[2]));
                child.setAdress(valuesNorai[3]);
                child.setWish(valuesNorai[4]);
                child.setCharakter(valuesCharakter[2]);
                children.add(child);
            }
        }
        return children;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getWish() {
        return wish;
    }
    public void setWish(String wish) {
        this.wish = wish;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getCharakter() {
        return charakter;
    }

    public void setCharakter(String charakter) {
        this.charakter = charakter;
    }


    @Override
    public String toString(){
        return "\r\n"+name+" "+ surname+" "+ age+" "+ adress+" "+ wish+" "+ charakter;
    }
}
