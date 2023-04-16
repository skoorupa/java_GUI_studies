package cw2.z1;

public class Kon implements SprzedawalneZaKg{
    public float cena;
    public float masa;

    public Kon(float cena) {
        this.cena = cena;
        this.masa = 800;
    }

    public float cena() {
        return cena;
    }

    public float masaKg() {
        return masa;
    }

    public String toString() {
        return "Kon";
    }
}
