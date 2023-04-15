package cw4.z1;

public interface Warunek {
    boolean sprawdz(String s);

    static Warunek nie(Warunek w) {return s -> !w.sprawdz(s);}
    default double surowosc() {
        int pass = 0;
        for (int i = 0; i < 1000; i++) {
            String s = "";
            for (int j = 0; j < Math.random() * 16 + 1; j++) {
                s += (char)(Math.random()*('z'-'a')+'a');
            }
            if (sprawdz(s)) pass++;
        }
        return (double)(pass)/1000;
    }
}
