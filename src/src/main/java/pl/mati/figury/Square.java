package pl.mati.figury;

public class Square {
    private double dlugoscBoku;

    public double liczPoleKwadratu(){
        return this.dlugoscBoku * this.dlugoscBoku;
    }

    public double liczObwodKwadratu(){
        return this.dlugoscBoku * 4.0;
    }

    public void setDlugoscBoku(double dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }
}
