package cw1.z2;

public class Osoba {
    private String imie;
    private int stanPortfela;

    public String getImie() {
        return imie;
    }

    public int getStanPortfela() {
        return stanPortfela;
    }

    public Osoba(String imie, int stanPortfela) {
        this.imie = imie;
        this.stanPortfela = stanPortfela;
    }

    class Pupil {
        private String imie, nazwaGatunku;
        private int cenaKarmy;

        public String getImie() {
            return imie;
        }

        public String getNazwaGatunku() {
            return nazwaGatunku;
        }

        public int getCenaKarmy() {
            return cenaKarmy;
        }

        public Pupil(String imie, String nazwaGatunku, int cenaKarmy) {
            this.imie = imie;
            this.nazwaGatunku = nazwaGatunku;
            this.cenaKarmy = cenaKarmy;
        }

        public void nakarm() throws RuntimeException {
            if (stanPortfela < cenaKarmy) throw new RuntimeException("brak srodkow");
            stanPortfela -= cenaKarmy;
        }
    }
}
