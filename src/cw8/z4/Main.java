package cw8.z4;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static ArrayList<Long> liczbyPierwsze = new ArrayList<>();
    public static ArrayList<Thread> threads = new ArrayList<>();
    public static TreeSet<Long> zamowione = new TreeSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thread counter = new Thread(Main::obliczPierwsza);
        counter.start();
        threads.add(counter);

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
                Thread t = new Thread(()->{
                    long wynik = 0;
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Przerwano watek...");
                        return;
                    }
//                    wynik = getLiczba(k);
                    System.out.println(k+"-ta liczba pierwsza to: "+wynik);
                });
                threads.add(t);
                t.start();
            }
        }
    }

    public synchronized long getLiczba(int ktora) {
        while (ktora > liczbyPierwsze.size()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return liczbyPierwsze.get(ktora-1);
    }

    public static void obliczPierwsza() {
        long n = 2;
        while (!Thread.currentThread().isInterrupted()) {
            boolean czyPierwsza = true;

            for (long p :
                    liczbyPierwsze) {
                if (p * p > n)
                    break;
                if (n % p == 0) {
                    czyPierwsza = false;
                    break;
                }
            }
            if (czyPierwsza) {
                synchronized (liczbyPierwsze) {
                    liczbyPierwsze.add(n);
                }
            }
            n++;
        }
        System.out.println("Koniec liczenia...");
    }
}
