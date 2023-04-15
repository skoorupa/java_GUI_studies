package cw3.z2;

public class Main {
    public static void main(String[] args) {
        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();
        try {
            wypozyczalnia.zaloz("Adam");
            wypozyczalnia.zaloz("Maciek");
            wypozyczalnia.zaloz("Marcin");

            wypozyczalnia.wypozycz("Adam");
            wypozyczalnia.wypozycz("Adam");
            wypozyczalnia.wypozycz("Marcin");

            wypozyczalnia.wypiszWszystkich();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
