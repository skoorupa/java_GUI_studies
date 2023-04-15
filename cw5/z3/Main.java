package cw5.z3;

import java.util.function.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> kosc = ()->(int)(Math.random()*6)+1;
        Predicate<Integer> bez6 = (x)->x!=6;
        Function<Integer,Double> dzielprzez2 = (x)->(double)x/2;
        Consumer<Double> wypisz = (x)->System.out.println("Wynik: "+x);

        Stream kosc_marka = Stream.generate(kosc)
                .filter(bez6)
                .limit(5)
                .map(dzielprzez2);

        kosc_marka.forEach(wypisz);
    }
}
