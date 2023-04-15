package cw2.z1;

public class LekcjaTanca implements Sprzedawalne {
    public float cena;
    public float czas;

    public LekcjaTanca(float czas) {
        this.cena = 100;
        this.czas = czas;
    }

    public float cena() {
        return cena/czas;
    }

    public String toString() {
        return "LekcjaTanca";
    }
}
