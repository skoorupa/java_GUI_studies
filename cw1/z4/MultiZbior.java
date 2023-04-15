package cw1.z4;

abstract public class MultiZbior {
    int[] zbior;
    abstract public void dodaj(int elem);
    abstract public int usunMax();
    void wypiszIUsunNajwieksze(int k) {
        for (int i = 0; i < k; i++) {
            System.out.println(usunMax());
        }
    }
}
