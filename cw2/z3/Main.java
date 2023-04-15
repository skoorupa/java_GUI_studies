package cw2.z3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Osoba[] osoby = new Osoba[]{
                new Osoba("Adam", "Skorupski", "1234567890"),
                new Osoba("Adam", "Kowalski", "0987654321"),
                new Osoba("Patryk", "Iksinski", "1111111111"),
                new Osoba("Marcin", "Igrekowski", "22222222222"),
                new Osoba("Sebastian", "Skorupski", "33333333333"),
                new Osoba("Paweł", "Pawłowski", "444444444444"),
                new Osoba("Stefan", "Stefanovic", "5555555555"),
                new Osoba("Marko", "Markovic", "66666666666")
        };

        Arrays.sort(osoby);
        System.out.println(Arrays.toString(osoby));
    }
}
