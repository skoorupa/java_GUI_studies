package cw1.z2;

public class Main {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Adam", 1000);
        Osoba.Pupil kot = osoba.new Pupil("Mruczek", "kot", 40);
        Osoba.Pupil pies = osoba.new Pupil("Tosia", "pies", 50);
        Osoba.Pupil[] pupile = {kot, pies};

        while (osoba.getStanPortfela() >= 0) {
            for (Osoba.Pupil pupil : pupile) {
                pupil.nakarm();
                System.out.println(osoba.getStanPortfela());
            }
        }
    }
}
