package pl.mati.figury;

public class Hexagon {
    private double bok;
    private double pierwiastek;

    public double obliczpoleOsmiokata(){
        return (this.bok * this.bok) * (this.pierwiastek  + 1.0) * 2.0;
    }

    public double obliczObwodOsmiokata(){
        return this.bok * 8.0;
    }

    public void setBok(double bok) {
        this.bok = bok;
    }

    public void setPierwiastek(double pierwiastek) {
        this.pierwiastek = pierwiastek;
    }
}
