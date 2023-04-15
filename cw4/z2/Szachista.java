package cw4.z2;

import java.util.Comparator;

public class Szachista extends Osoba {
    private int ranking;

    public static final Comparator<Szachista> WG_RANKINGU = (o1, o2) -> {
        if (Integer.compare(o1.ranking, o2.ranking) != 0)
            return Integer.compare(o1.ranking, o2.ranking);
        else
            return Osoba.WG_NAZWISKA.compare(o1,o2);
    };

    public Szachista(String imie, String nazwisko, String PESEL, int ranking) {
        super(imie, nazwisko, PESEL);

        this.ranking = ranking;
    }

    public String toString() {
        return super.toString()+" "+ranking;
    }
}

