package pl.mati.figury;

public class Triangle {
    private double podstawa;
    private double wysokosc;
    private double trzeciBok;

    public double liczPoleTrojkata(){
        return this.podstawa * this.wysokosc / 2;
    }

    public double liczObwodTrojkata(){
        return this.podstawa + this.wysokosc + this.trzeciBok;
    }

    public void setPodstawa(double podstawa) {
        this.podstawa = podstawa;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public void setTrzeciBok(double trzeciBok) {
        this.trzeciBok = trzeciBok;
    }
}
