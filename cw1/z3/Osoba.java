package cw1.z3;

public class Osoba {
    private final String imie, nazwisko, adres, email, nrdowodu;

    public Osoba(String imie, String nazwisko, String adres, String email, String nrdowodu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.email = email;
        this.nrdowodu = nrdowodu;
    }

    public String toString() {
        return imie+" "+nazwisko+" "+adres+" "+email+" "+nrdowodu;
    }

    static class Builder {
        private String imie, nazwisko, adres, email, nrdowodu;

        public Builder setImie(String imie) {
            this.imie = imie;
            return this;
        }

        public Builder setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
            return this;
        }

        public Builder setAdres(String adres) {
            this.adres = adres;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setNrdowodu(String nrdowodu) {
            this.nrdowodu = nrdowodu;
            return this;
        }

        public Osoba build() {
            return new Osoba(imie, nazwisko, adres, email, nrdowodu);
        }
    }
}
