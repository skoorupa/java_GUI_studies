package cw3.z3;

public class Main {
    public static void main(String[] args) {
        Wypozyczalnia wypozyczalnia = new Wypozyczalnia();
        try {
            wypozyczalnia.wypozycz("Adam","Fight Club");
            wypozyczalnia.wypozycz("Adam","Twilight");
            wypozyczalnia.wypozycz("Adam", "Batman");
            wypozyczalnia.zwroc("Adam","Twilight");

            wypozyczalnia.wypiszStan("Adam");

            wypozyczalnia.zapros("Adam", "Mikołaj");
            wypozyczalnia.wypozycz("Adam","Harry Potter");

            wypozyczalnia.wypiszWszystkich();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
