package cw1.z1;

public class Main {
    public static void main(String[] args) {
        Zwierze[] zwierzeta = {
            new Pies(), new Kot(), new Krowa()
        };
    
        for (Zwierze zwierze : zwierzeta) {
            zwierze.koncert();
            System.out.println();
        }
    }
}
