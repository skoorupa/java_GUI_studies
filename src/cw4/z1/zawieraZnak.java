package cw4.z1;

public class zawieraZnak implements Warunek {
    private char ch;

    public zawieraZnak(char ch) {
        this.ch = ch;
    }

    @Override
    public boolean sprawdz(String s) {
        return s.contains(""+ch);
    }
}
