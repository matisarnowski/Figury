package pl.mati.figury;

public class Rectangle {
    private double dlugoscBokuPierwsza;
    private double dlugoscBokuDruga;

    public double liczPoleProstokata(){
        return this.dlugoscBokuPierwsza * this.dlugoscBokuDruga;
    }

    public double liczObwodProstokata(){
        return 2.0 * this.dlugoscBokuPierwsza + 2.0 * this.dlugoscBokuDruga;
    }

    public void setDlugoscBokuPierwsza(double dlugoscBokuPierwsza) {
        this.dlugoscBokuPierwsza = dlugoscBokuPierwsza;
    }

    public void setDlugoscBokuDruga(double dlugoscBokuDruga) {
        this.dlugoscBokuDruga = dlugoscBokuDruga;
    }
}
