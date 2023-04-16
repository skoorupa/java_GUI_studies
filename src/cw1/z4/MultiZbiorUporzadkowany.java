package cw1.z4;

public class MultiZbiorUporzadkowany extends MultiZbior {
    public MultiZbiorUporzadkowany() {
        zbior = new int[0];
    }

    @Override
    public void dodaj(int elem) {
        int mi = 0; // max
        for (int i = 0; i < zbior.length; i++)
            if (elem > zbior[i]) mi = i+1;

        int[] tmp = new int[zbior.length + 1];
        tmp[mi] = elem;

        for (int i = 0, j = 0; j < zbior.length; i++, j++) {
            if (mi == i) i++;
            tmp[i] = zbior[j];
        }

        zbior = tmp;
    }

    @Override
    public int usunMax() {
        int[] tmp = new int[zbior.length - 1];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = zbior[i];
        }

        int out = zbior[zbior.length-1];
        zbior = tmp;

        return out;
    }
}
