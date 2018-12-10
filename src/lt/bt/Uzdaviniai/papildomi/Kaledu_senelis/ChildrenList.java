package lt.bt.Uzdaviniai.papildomi.Kaledu_senelis;

import java.util.Arrays;

public class ChildrenList {

    private String childName;
    private String childSurname;
    private String carma;




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

    String getCarma() {
        return carma;
    }
    void setCarma(String carma) {
        this.carma = carma;
    }

    @Override
    public String toString(){
        return childName +" "+childSurname+" "+carma;
    }

}
