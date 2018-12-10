package lt.bt.Uzdaviniai.papildomi.Kaledu_senelis;

public class ElfWarehouse {

    private String toyName;
    private int quantity;


    String getToyName() {
        return toyName;
    }
    void setToyName(String toyName) {
        this.toyName = toyName;
    }

    int getQuantity() {
        return quantity;
    }
    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return toyName+" "+quantity;
    }
}
