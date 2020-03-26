package pl.mati.figury;

import java.util.Locale;
import java.util.Scanner;

//Zaimportowaliśmy Biblioteki służące do wczytywania danych.

public class Main {
    public static void main(String[] args){

        //Tutaj ustawiamy możliwość wczytywania danych i sposób ich wczytywania. Będzie, to notacja dla liczb o rozwinięciu dziesiętnym z kropką.

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        //Teraz policzymy pole koła.

        System.out.println("Podaj liczbę stanowiącą o promieniu koła: ");
        double promien1 = scanner.nextDouble();
        double pi1 = Math.PI;

        //Tu program tworzy klasę.

        Circle kolo = new Circle();

        //Tu program przypisuje wartości do zmiennych, które same nadaliśmy.

        kolo.setPromien(promien1);
        kolo.setPi(pi1);

        System.out.printf("Pole koła wynosi: %3.3f / Natomiast obwód wynosi: %3.3f.\n", kolo.liczPoleKola(), kolo.liczObwodKola());

        //Tu program wyrzucił dane na standardowe wyjście.
        //Teraz policzymy pole ośmiokąta.

        System.out.println("Podaj liczbę stanowiącą o boku ośmiokąta: ");
        double ramie = scanner.nextDouble();
        double pierwiastek1 = Math.sqrt(2.0);

        //Tu program tworzy klasę.

        Hexagon osmiokat = new Hexagon();

        //Tu program przypisuje wartości do zmiennych, które sami nadaliśmy.

        osmiokat.setBok(ramie);
        osmiokat.setPierwiastek(pierwiastek1);

        System.out.printf("Pole ośmiokąta wynosi: %3.3f / Natomiast obwód wynosi: %3.3f.\n", osmiokat.obliczpoleOsmiokata(), osmiokat.obliczObwodOsmiokata());

        //Tu program wyrzucił dane na standardowe wyjście.
        //Teraz policzymy pole trójkąta prostokątnego.

        System.out.println("Podaj liczbę stanowiącą o podstawie trójkąta: ");
        double podstawa1 = scanner.nextDouble();
        System.out.println("Podaj liczbę stanowiącą o wysokości trójkąta opuszczonej na tą podstawę: ");
        double wysokosc1 = scanner.nextDouble();
        double trzecibok1 = Math.sqrt(wysokosc1 * wysokosc1 + podstawa1 * podstawa1);

        //Tu program tworzy klasę.

        Triangle trojkat = new Triangle();

        //Tu program przypisuje wartości do zmiennych, które sami nadaliśmy.

        trojkat.setPodstawa(podstawa1);
        trojkat.setWysokosc(wysokosc1);
        trojkat.setTrzeciBok(trzecibok1);

        System.out.printf("Pole trójkąta wynosi: %3.3f / Natomiast obwód wynosi: %3.3f.\n", trojkat.liczPoleTrojkata(), trojkat.liczObwodTrojkata());

        //Tu program wyrzucił dane na standardowe wyjście.
        //Teraz policzymy pole prostokąta.

        System.out.println("Podaj liczbę stanowiącą o pierwszym boku prostokąta: ");
        double bok1 = scanner.nextDouble();
        System.out.println("Podaj liczbę stanowiącą o drugim boku prostokąta: ");
        double bok2 = scanner.nextDouble();

        //Tu program tworzy klasę.

        Rectangle prostokat = new Rectangle();

        //Tu program przypisuje wartości do zmiennych, które sami nadaliśmy.

        prostokat.setDlugoscBokuPierwsza(bok1);
        prostokat.setDlugoscBokuDruga(bok2);

        System.out.printf("Pole prostokąta wynosi: %3.3f / Natomiast obwód wynosi: %3.3f.\n", prostokat.liczPoleProstokata() , prostokat.liczObwodProstokata());

        //Tu program wyrzucił dane na standardowe wyjście.
        //Teraz policzymy pole kwadratu.

        System.out.println("Podaj liczbę stanowiącą o boku kwadratu: ");
        double bokKwadratu = scanner.nextDouble();

        //Tu program tworzy klasę.

        Square kwadrat = new Square();

        //Tu program przypisuje wartości do zmiennych, które sami nadaliśmy.

        kwadrat.setDlugoscBoku(bokKwadratu);

        System.out.printf("Pole kwadratu wynosi: %3.3f / Natomiast obwód wynosi: %3.3f.\n", kwadrat.liczPoleKwadratu(), kwadrat.liczObwodKwadratu());
    }
}
