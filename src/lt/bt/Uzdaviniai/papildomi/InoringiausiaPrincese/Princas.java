package lt.bt.Uzdaviniai.papildomi.InoringiausiaPrincese;

public class Princas {
    private String vardas;
    private String pavarde;
    private int pedos=0;
    private int coliai=0;
    private int bendras=0;

    String getVardas() {
        return vardas;
    }
    void setVardas(String vardas) {
        this.vardas = vardas;
    }

    String getPavarde() {
        return pavarde;
    }
    void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    int getPedos() {
        return pedos;
    }
    void setPedos(int pedos) {
        this.pedos = pedos;
    }

    int getColiai() {
        return coliai;
    }
    void setColiai(int coliai) {
        this.coliai = coliai;
    }
    int getBendras(){
        return bendras=(pedos*12)+coliai;
    }


    @Override
    public String toString(){
        return vardas+" "+pavarde+" "+pedos+" "+coliai+" "+"ugis: "+bendras;
    }
}
