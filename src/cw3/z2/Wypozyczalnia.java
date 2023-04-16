package cw3.z2;

import java.util.HashMap;
import java.util.Map;

public class Wypozyczalnia {
    private Map<String, Integer> konta = new HashMap<>();

    public void zaloz(String stud) throws Exception {
        if (konta.containsKey(stud)) throw new Exception("jest juz takie konto");
        konta.put(stud, 2);
    }

    public void wypozycz(String stud) throws Exception {
        if (!konta.containsKey(stud)) throw new Exception("nie ma takiego konta");
        if (konta.get(stud) <= 0) throw new Exception("brak pieniedzy na koncie");
        konta.replace(stud, konta.get(stud)-1);
    }

    public void usun(String stud) throws Exception {
        if (!konta.containsKey(stud)) throw new Exception("nie ma takiego konta");
        konta.remove(stud);
    }

    public int stan(String stud) throws Exception {
        if (!konta.containsKey(stud)) throw new Exception("nie ma takiego konta");
        return konta.get(stud);
    }

    public void wypiszWszystkich() {
        for (String stud :
                konta.keySet()) {
            System.out.println(stud+": "+konta.get(stud));
        }
    }
}
