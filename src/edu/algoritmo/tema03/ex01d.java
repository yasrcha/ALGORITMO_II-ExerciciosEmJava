package edu.algoritmo.tema03;

public class ex01d {
    // d) y <- z + x
    //    x <- y - x
    private static void original(int x, int y, int z) {
        y = z + x;
        x = y - x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    // d) x <- y - x
    //    y <- z + x
    private static void invertida(int x, int y, int z) {
        x = y - x;
        y = z + x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    public static void main(String[] args) {
        original(1,2,3);
        invertida(1,2,3);
    }
}
