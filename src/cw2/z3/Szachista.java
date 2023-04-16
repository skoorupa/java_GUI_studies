package cw2.z3;

public class Szachista extends Osoba implements Comparable {
    private int ranking;

    public Szachista(String imie, String nazwisko, String PESEL, int ranking) {
        super(imie, nazwisko, PESEL);

        this.ranking = ranking;
    }

    @Override
    public int compareTo(Object o) {
        Szachista x = (Szachista) o;
        return x.ranking - ranking;
    }
}
