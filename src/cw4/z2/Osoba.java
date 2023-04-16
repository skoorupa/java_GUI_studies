package cw4.z2;

import java.util.Comparator;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String PESEL;

    public static final Comparator<Osoba> WG_NAZWISKA = (o1, o2) -> {
        if (o1.nazwisko.compareTo(o2.nazwisko) != 0)
            return o1.nazwisko.compareTo(o2.nazwisko);
        else if (o1.imie.compareTo(o2.imie) != 0)
            return o1.imie.compareTo(o2.imie);
        else
            return o1.PESEL.compareTo(o2.PESEL);
    };

    public Osoba(String imie, String nazwisko, String PESEL) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
    }

    public String toString() {
        return imie+" "+nazwisko+" "+PESEL;
    }
}
