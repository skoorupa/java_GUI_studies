package cw3.z3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Wypozyczalnia {
    private Map<String, ArrayList<String>> konta = new HashMap<>();

    public void wypozycz(String stud, String film) throws Exception {
        if (!konta.containsKey(stud)) konta.put(stud, new ArrayList<>());
        konta.get(stud).add(film);
    }

    public void zwroc(String stud, String film) throws Exception {
        if (!konta.containsKey(stud)) throw new Exception("nie ma takiego konta");
        if (!konta.get(stud).contains(film)) throw new Exception("student nie ma tego filmu");
        konta.get(stud).remove(film);
    }

    public void wypiszStan(String stud) throws Exception {
        if (!konta.containsKey(stud)) throw new Exception("nie ma takiego konta");
        System.out.println(konta.get(stud).toString());
    }

    public void zapros(String s1, String s2) throws Exception {
        if (!konta.containsKey(s1)) throw new Exception("nie ma takiego konta");
        konta.put(s2, konta.get(s1));
    }

    public void wypiszWszystkich() {
        for (String stud :
                konta.keySet()) {
            System.out.println(stud+": "+konta.get(stud).toString());
        }
    }
}
