package cw2.z3;

public class Osoba implements Comparable {
    private String imie;
    private String nazwisko;
    private String PESEL;

    public Osoba(String imie, String nazwisko, String PESEL) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
    }

    @Override
    public int compareTo(Object o) {
        Osoba x = (Osoba) o;
        if (nazwisko.compareTo(x.nazwisko) != 0)
            return nazwisko.compareTo(x.nazwisko);
        if (imie.compareTo(x.imie) != 0)
            return imie.compareTo(x.imie);
        return PESEL.compareTo(x.PESEL);
    }

    public String toString() {
        return imie+" "+nazwisko+" "+PESEL;
    }
}
