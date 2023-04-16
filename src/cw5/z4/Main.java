package cw5.z4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Osoba[] osoby = new Osoba[]{
                new Osoba("Tomasz", "Zieliński", 30, "Łódź"),
                new Osoba("Anna", "Wójcik", 32, "Kraków"),
                new Osoba("Jan", "Kowalski", 45, "Warszawa"),
                new Osoba("Piotr", "Nowak", 58, "Wrocław"),
                new Osoba("Marta", "Nowak", 27, "Warszawa"),
                new Osoba("Piotr", "Zieliński", 18, "Warszawa"),
                new Osoba("Jan", "Wójcik", 25, "Warszawa")
        };
        System.out.println("sortujOsoby -------------");
        sortujOsoby(osoby);
    }
    public static void sortujOsoby(Osoba[] osoby) {
        Comparator<Osoba> WG_NAZWISKA = (o1,o2) -> {
            if (o1.nazwisko.compareTo(o2.nazwisko) != 0)
                return o1.nazwisko.compareTo(o2.nazwisko);
            else
                return o1.imie.compareTo(o2.imie);
        };
        Stream.of(osoby)
                .sorted(WG_NAZWISKA)
                .forEach(System.out::println);
    }
}
