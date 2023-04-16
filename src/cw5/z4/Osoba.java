package cw5.z4;

public class Osoba {
    public final String imie, nazwisko, miasto;
    public final int wiek;

    public Osoba(String imie, String nazwisko, int wiek, String miasto) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.miasto = miasto;
    }

    @Override
    public String toString() {
        return "Osoba("+imie+","+nazwisko+","+wiek+","+miasto+")";
    }
}
