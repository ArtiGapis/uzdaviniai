package lt.bt.Uzdaviniai.papildomi.Padangu_uzd;

public class Tire {

    private int tireWidth=0;
    private int tireRatio=0;
    private String tireDiameter;
    private double price=0;

    int getTireWidth() {
        return tireWidth;
    }
    void setTireWidth(int tireWidth) {
        this.tireWidth = tireWidth;
    }

    int getTireRatio() {
        return tireRatio;
    }
    void setTireRatio(int tireRatio) {
        this.tireRatio = tireRatio;
    }

    String getTireDiameter() {
        return tireDiameter;
    }
    void setTireDiameter(String tireDiameter) {
        this.tireDiameter = tireDiameter;
    }

    double getPrice() {
        return price;
    }
    void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return tireWidth+" "+tireRatio+" "+tireDiameter+" "+price;
    }
}
