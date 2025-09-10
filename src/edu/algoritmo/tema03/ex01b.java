package edu.algoritmo.tema03;

public class ex01b {

    // b) z <- x
    //    x <- z
    private static void original(int x, int y, int z) {
        z = x;
        x = z;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    // b) x <- z
    //    z <- x
    private static void invertida(int x, int y, int z) {
        x = z;
        z = x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    public static void main(String[] args) {
        original(1,2,3);
        invertida(1,2,3);
    }
}
