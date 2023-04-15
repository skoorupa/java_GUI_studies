package cw1.z4;

public class MultiZbiorNieuporzadkowany extends MultiZbior {
    public MultiZbiorNieuporzadkowany() {
        zbior = new int[0];
    }

    @Override
    public void dodaj(int elem) {
        int[] tmp = new int[zbior.length + 1];
        for (int i = 0; i < zbior.length; i++)
            tmp[i] = zbior[i];

        tmp[zbior.length] = elem;
        zbior = tmp;
    }

    @Override
    public int usunMax() {
        int mi = 0;
        for (int i = 0; i < zbior.length; i++)
            if (zbior[mi] < zbior[i]) mi = i;

        int[] tmp = new int[zbior.length - 1];
        for (int i = 0, j = 0; j < zbior.length; i++, j++) {
            if (i == mi) j++;
            tmp[i] = zbior[j];
        }

        int out = zbior[mi];
        zbior = tmp;

        return out;
    }
}
