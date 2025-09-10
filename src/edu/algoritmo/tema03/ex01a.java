package edu.algoritmo.tema03;

public class ex01a {

    // a) x <- x + 1 + y
    //    z <- y - x
    private static void original(int x, int y, int z) {
        // Nessa função, X foi declarado/executado primeiro. Por esse motivo, quando atribuimos a 'z' o valor de 'y - x', significa que x está valendo 'x + 1 + y'.
        x = x + 1 + y;
        z = y - x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    // a) z <- y - x
    //    x <- x + 1 + y
    private static void invertida(int x, int y, int z) {
        // Quando invertemos, e declaramos Z primeiro, o resultado final será diferente, pois o valor de X ainda é X, e não 'x + 1 + y', já que quando Z foi declarado, esse novo valor de X ainda não tinha sido executado.

        z = y - x;
        x = x + 1 + y;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    public static void main(String[] args) {
        original(1,2,3);
        invertida(1,2,3);
    }
}
