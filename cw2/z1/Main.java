package cw2.z1;

public class Main {
    public static void main(String[] args) {
        wypiszCeny(new Sprzedawalne[]{
            new Kon(200),
            new Kapusta(40),
            new LekcjaTanca(1.5F)
        });

        wypiszMasyKg(new MajaceMase[]{
            new Kon(200),
            new Kapusta(40)
        });

        wypiszCenyZaKg(new SprzedawalneZaKg[]{
            new Kon(200),
            new Kapusta(40)
        });
    }

    public static void wypiszCeny(Sprzedawalne[] sprzedawalne) {
        for (Sprzedawalne s : sprzedawalne) {
            System.out.println(s.toString()+" "+s.cena());
        }
    }

    public static void wypiszMasyKg(MajaceMase[] majacemase) {
        for (MajaceMase s : majacemase) {
            System.out.println(s.toString()+" "+s.masaKg());
        }
    }

    public static void wypiszCenyZaKg(SprzedawalneZaKg[] sprzedawalnezakg) {
        for (SprzedawalneZaKg s : sprzedawalnezakg) {
            System.out.println(s.toString()+" "+s.cena()/s.masaKg());
        }
    }
}
