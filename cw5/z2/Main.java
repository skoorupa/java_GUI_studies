package cw5.z2;

public class Main {
    public static void main(String[] args) {
        Ciag ciag = new Ciag(1,10);
        for (int num :
                ciag) {
            System.out.println(num);
        }
        for (int num :
                ciag) {
            System.out.println(num);
        }
        for (int x : ciag) {
            for (int y : ciag) {
                System.out.print(x*y+" ");
            }
            System.out.println();
        }
    }
}
