package cw3.z1;

public class Main {
    public static void main(String[] args) {
        for (DzienTygodnia d :
                DzienTygodnia.values()) {
            System.out.println(d);
            System.out.println("czyWeekend: "+d.czyWeekend());
            System.out.println("ile dni po SR: "+d.ileDniPo(DzienTygodnia.SR));
            System.out.println("nastepny: "+d.nastepny());
            System.out.println("==========================");
        }
    }
}
