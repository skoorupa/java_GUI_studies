package cw6.z1;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Double> marek = strumienMarka();
        marek.forEach(x -> {
            System.out.println("Wynik: " + x);
            System.out.println();
        });
    }

    public static int rzucKoscia() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int wynik = (int)(Math.random()*6)+1;
        System.out.println("Rzucam koscia: "+wynik);
        return wynik;
    }

    public static Stream<Double> strumienMarka() {
        return Stream.generate(Main::rzucKoscia)
                .limit(10)
                .filter(x -> {
                    System.out.println("Odrzucam szóstki: "+x);
                    return x != 6;
                })
                .limit(5)
                .map(x-> {
                    System.out.println("Dzielę przez dwa: "+x);
                    return (double) x / 2;
                });
    }
}
