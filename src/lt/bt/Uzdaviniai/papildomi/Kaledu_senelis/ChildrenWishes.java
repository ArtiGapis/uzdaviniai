package lt.bt.Uzdaviniai.papildomi.Kaledu_senelis;

public class ChildrenWishes {

    private String childName;
    private String childSurname;
    private int age;
    private String adress;
    private String wish;


    String getChildName() {
        return childName;
    }
    void setChildName(String childName) {
        this.childName = childName;
    }

    String getChildSurname() {
        return childSurname;
    }
    void setChildSurname(String childSurname) {
        this.childSurname = childSurname;
    }

    int getAge() {
        return age;
    }
    void setAge(int age) {
        this.age = age;
    }

    String getAdress() {
        return adress;
    }
    void setAdress(String adress) {
        this.adress = adress;
    }

    String getWish() {
        return wish;
    }
    void setWish(String wish) {
        this.wish = wish;
    }

    @Override
    public String toString(){
        return childName +" "+childSurname+" "+age+" "+adress+" "+wish;
    }

}
