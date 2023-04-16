package cw5.z1;

import java.util.Iterator;

public class Ciag implements Iterable<Integer> {
    private int begin;
    private int end;
    public Ciag (int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int number = begin;
            @Override
            public boolean hasNext() {
                return number <= end;
            }

            @Override
            public Integer next() {
                return number++;
            }
        };
    }
}
