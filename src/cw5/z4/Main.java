package cw5.z4;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
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
        System.out.println("sredniWiek --------------");
        System.out.println(sredniWiek(osoby));
        System.out.println("najmlodszaOsoba ---------");
        System.out.println(najmlodszaOsoba(osoby));
        System.out.println("najmlodszaZMiasta -------");
        najmlodszaZMiasta(osoby,"Warszawa");
        najmlodszaZMiasta(osoby,"Poznań");
        System.out.println("rozneImiona -------------");
        System.out.println(rozneImiona(osoby));
    }
    public static void sortujOsoby(Osoba[] osoby) {
//        Stream.of(osoby)
//                .sorted((o1,o2) -> {
//                    if (o1.nazwisko.compareTo(o2.nazwisko) != 0)
//                        return o1.nazwisko.compareTo(o2.nazwisko);
//                    else
//                        return o1.imie.compareTo(o2.imie);
//                })
//                .forEach(System.out::println);
        Stream.of(osoby)
                .sorted(Comparator
                        .comparing((Osoba o)->o.nazwisko)
                        .thenComparing((Osoba o)->o.imie))
                .forEach(System.out::println);
    }
    public static double sredniWiek(Osoba[] osoby) {
        return Stream.of(osoby)
                .mapToInt(o->o.wiek)
                .average()
                .getAsDouble();
    }
    public static Osoba najmlodszaOsoba(Osoba[] osoby) {
        return Stream.of(osoby)
                .min(Comparator.comparing(o -> o.wiek))
                .get();
    }
    public static void najmlodszaZMiasta(Osoba[] osoby, String miasto) {
        Stream.of(osoby)
                .filter(o->o.miasto.equals(miasto))
                .min(Comparator.comparing(o->o.wiek))
                .ifPresentOrElse(
                        System.out::println,
                        ()->System.out.println("brak osob z takiego miasta")
                );
    }
    public static Set rozneImiona(Osoba[] osoby) {
        return Stream.of(osoby)
                .map(o->o.imie)
                .collect(Collectors.toSet());
    }
    public static void policzImiona(Osoba[] osoby) {
        Stream.of(osoby)
                .collect(Collectors.groupingBy(o->o.imie))
                .entrySet().stream()
                .sorted(
                        Comparator.comparing((Map.Entry<String, List<Osoba>> e)->e.getValue().size())
                                .reversed())
                .map(e->e.getKey()+": "+e.getValue().size())
                .forEach(System.out::println);


    }
}
