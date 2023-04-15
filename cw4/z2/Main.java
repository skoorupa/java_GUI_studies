package cw4.z2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Osoba[] osoby = {
                new Osoba("Adam","Skorupski","00111222333"),
                new Szachista("Hubert","Hubertowski","11111111111", 2),
                new Szachista("Marko","Boskowski","99111222333",3),
                new Osoba("Stefan","Stefanowicz","22567567567"),
                new Szachista("Wlada","Stefanowicz","11121372137",1),
                new Osoba("Marko","Boskowski","42069213711")
        };

        Szachista[] szachisci = {
                new Szachista("Hubert","Radzewicz","02128562393",1),
                new Szachista("Patryk","Patrykowski","00013371337",3),
                new Szachista("Konrad","Konradowski","77777777777",2),
                new Szachista("Marcin","Mareczkowksi","71830718301",3)
        };

        System.out.println(Arrays.toString(osoby));
        System.out.println("====================");
        Arrays.sort(osoby, Osoba.WG_NAZWISKA);
        System.out.println(Arrays.toString(osoby));
        System.out.println("====================");
        Arrays.sort(szachisci, Szachista.WG_NAZWISKA);
        System.out.println(Arrays.toString(szachisci));
        System.out.println("====================");
        Arrays.sort(szachisci, Szachista.WG_RANKINGU);
        System.out.println(Arrays.toString(szachisci));


    }
}
