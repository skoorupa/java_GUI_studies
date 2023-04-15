package cw2.z1;

public class Kapusta implements SprzedawalneZaKg {
    public float cena;
    public float masa;

    public Kapusta(float cena) {
        this.cena = cena;
        this.masa = 1.5F;
    }

    public float cena() {
        return cena;
    }

    public float masaKg() {
        return masa;
    }

    public String toString() {
        return "Kapusta";
    }
}
