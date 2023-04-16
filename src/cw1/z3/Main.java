package cw1.z3;

public class Main {
    public static void main(String[] args) {
        Osoba ja = new Osoba.Builder()
            .setImie("Adam")
            .setNazwisko("Kowalski")
            .setEmail("adam@pja.edu.pl")
            .setAdres("Warszawa")
            .setNrdowodu("XYZ654321")
            .build();

        System.out.println(ja);
    }
}
