package lt.bt.Uzdaviniai.papildomi.Padangu_uzd;

public class Ratas {

    private int plotis=0;
    private int aukstis=0;
    private String greit;
    private double kaina=0;

    public int getPlotis() {
        return plotis;
    }
    public void setPlotis(int plotis) {
        this.plotis = plotis;
    }

    public int getAukstis() {
        return aukstis;
    }
    public void setAukstis(int aukstis) {
        this.aukstis = aukstis;
    }

    public String getGreit() {
        return greit;
    }
    public void setGreit(String greit) {
        this.greit = greit;
    }

    public double getKaina() {
        return kaina;
    }
    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    @Override
    public String toString(){
        return plotis+" "+aukstis+" "+greit+" "+kaina;
    }
}
