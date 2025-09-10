package edu.algoritmo.tema02;


public class ex09 {
    // Considere a função recursiva a seguir:

    private static int f(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 2 * f(n - 1) - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }

    // Qual o valor de f(5):
    // f(5) = 2 * f(5 - 1) - 1 || f(5) = 2 * -15 - 1 [-31]
    // f(4) = 2 * f(4 - 1) - 1 || f(4) = 2 * -7 - 1 [-15]
    // f(3) = 2 * f(3 - 1) - 1 || f(3) = 2 * -3 - 1 [-7]
    // f(2) = 2 * f(2 - 1) - 1 || f(2) = 2 * -1 - 1 [-3]
    // f(1) = 2 * f(1 - 1) - 1 || f(1) = 2 * 0 - 1 [-1]
    // f(0) = 0
    // R: -31
}
