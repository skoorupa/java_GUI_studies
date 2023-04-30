package cw8.z3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Long> liczbyPierwsze = new ArrayList<>();
    public static List<Thread> watki = new ArrayList<>();

    public static void main(String[] args) {
        Thread t_licz = new Thread(()->licz());
        watki.add(t_licz);
        t_licz.start();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj liczbę (-1, aby zakonczyć): ");
            int k = sc.nextInt();
            if (k == -1) {
                watki.forEach(t->{
                    t.interrupt();
                    try {
                        t.join();
                    } catch (InterruptedException e) {

                    }
                    System.out.println("Interrupt watku");
                });
                System.out.println("Koniec maina");
                return;
            }
            if (k > 0) {
                Thread t = new Thread(()-> {
                    while (true) {
                        boolean success = false;
                        if (sprawdzLiczbe(k-1)==1) {
                            System.out.println(k+" liczba pierwsza: "+liczbyPierwsze.get(k-1));
                            return;
                        } else {
                            System.out.println("moment...");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                });
                watki.add(t);
                t.start();
            }
        }
    }

    public static synchronized int sprawdzLiczbe(int index) {
        if (liczbyPierwsze.size()>index) {
            return 1;
        }
        return 0;
    }

    public static void licz() {
        while (true) {
            if (Thread.interrupted()) {
                System.out.println("Watek przerwany");
                return;
            }
            synchronized (new Object()) {
                liczbyPierwsze.add(obliczPierwsza(liczbyPierwsze.size()+1));
            }
        }
    }

    public static long obliczPierwsza(int ktora) {
        long[] tab = new long[ktora];
        long start = System.currentTimeMillis();
        int pos = 0;
        long n = 2;
        while (pos < ktora) {
            if (Thread.interrupted()) {
                System.out.println("Watek przerwany");
                return 0;
            }
            boolean czyPierwsza = true;
            for (int i = 0; i < pos; i++) {
                if (tab[i] * tab[i] > n)
                    break;
                if (n % tab[i] == 0) {
                    czyPierwsza = false;
                    break;
                }
            }
            if (czyPierwsza) {
                tab[pos] = n;
                pos++;
            }
            n++;
        }
        long end = System.currentTimeMillis();
        long wynik = tab[ktora-1];
        return wynik;
//        System.out.println("" + ktora + "-ta liczba pierwsza to " + wynik + " (czas obliczeń: " + (end - start) + "ms)");
    }
}
