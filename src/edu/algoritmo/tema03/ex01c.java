package edu.algoritmo.tema03;

public class ex01c {
    // c) x <- x + 1
    //    z <- y - x
    private static void original(int x, int y, int z) {
        x = x + 1;
        z =  y - x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    // c) z <- y - x
    //    x <- x + 1
    private static void invertida(int x, int y, int z) {
        z =  y - x;
        x = x + 1;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    public static void main(String[] args) {
        original(1,2,3);
        invertida(1,2,3);
    }
}
