package cw3.z1;

public enum DzienTygodnia {
    PN(1,"poniedziałek"),
    WT(2,"wtorek"),
    SR(3,"środa"),
    CZ(4,"czwartek"),
    PT(5,"piątek"),
    SO(6,"sobota"),
    ND(7,"niedziela");

    private int nr;
    private String nazwa;

    DzienTygodnia(int nr, String nazwa) {
        this.nr = nr;
        this.nazwa = nazwa;
    }

    boolean czyWeekend() {
        return nr > 5;
    }

    int ileDniPo(DzienTygodnia d) {
        if (nr >= d.nr)
            return nr - d.nr;     // nr = 2, d.nr = 5, = 4
        else return 7-d.nr+nr;
    }

    DzienTygodnia nastepny() {
        return values()[(nr)%7];
    }

    public String toString() {
        return nr+": "+nazwa;
    }
}
