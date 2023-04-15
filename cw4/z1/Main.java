package cw4.z1;

public class Main {
    public static void main(String[] args) {
        String[] tablica = {"adam", "kot", "barbara", "karate", "ala"};

        Warunek jestPalindromem = s -> {
            for (int i = 0; i < s.length()/2; i++) {
                if (s.charAt(i) != s.charAt(s.length()-i-1))
                    return false;
            }
            return true;
        };

        wypiszPasujace(tablica, s -> s.length() > 6);
        wypiszPasujace(tablica, s -> s.charAt(0) == 'a');
        wypiszPasujace(tablica, jestPalindromem);
        wypiszPasujace(tablica, Warunek.nie(jestPalindromem));
        wypiszPasujace(tablica, new zawieraZnak('b'));
        wypiszPasujace(tablica, Warunek.nie(new zawieraZnak('b')));
        wypiszPasujace(tablica, new zawieraZnak('k'));
        wypiszPasujace(tablica, Warunek.nie(new zawieraZnak('k')));

    }
    public static void wypiszPasujace(String[] tab, Warunek war) {
        for (String s : tab) {
            if (war.sprawdz(s)) System.out.println(s);
        }
        System.out.println("surowosc: "+war.surowosc());
        System.out.println("==============");
    }
}
