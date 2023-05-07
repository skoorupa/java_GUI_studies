package cw8.z2;


import java.util.*;

public class Main {
    public static ArrayList<Thread> threads = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj liczbę (-1, aby zakonczyć): ");
            int k = sc.nextInt();
            if (k == -1) {
                threads.forEach(t -> {
                    t.interrupt();
                    try {
                        t.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
                return;
            }

            if (k > 0) {
                Thread t = new Thread(()->obliczPierwsza(k));
                t.start();
                threads.add(t);
            }
        }
    }

    public static void obliczPierwsza(int ktora) {
        long[] tab = new long[ktora];
        long start = System.currentTimeMillis();
        int pos = 0;
        long n = 2;
        while (pos < ktora) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("koniec pracy watku");
                return;
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
        System.out.println("" + ktora + "-ta liczba pierwsza to " + wynik + " (czas obliczeń: " + (end - start) + "ms)");
    }
}
