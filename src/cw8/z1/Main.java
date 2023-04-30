package cw8.z1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj liczbę (-1, aby zakonczyć): ");
            int k = sc.nextInt();
            if (k == -1)
                return;
            if (k > 0) {
                obliczPierwsza(k);
            }
        }
    }

    public static void obliczPierwsza(int ktora) {
        long[] tab = new long[ktora];
        long start = System.currentTimeMillis();
        int pos = 0;
        long n = 2;
        while (pos < ktora) {
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
