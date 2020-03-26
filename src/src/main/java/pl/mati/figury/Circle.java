package pl.mati.figury;

public class Circle {
    private double promien;
    private double pi;

    public double liczPoleKola(){
        return this.promien * this.promien * this.pi;
    }

    public double liczObwodKola(){
        return this.promien * this.pi * 2.0;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
}
