package edu.algoritmo.tema02;

public class ex05 {
// Considere a função recursiva 'func' definida por:
    private static int func(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return (n - 1) * func(n - 1);
        }
    }

    // Processo 'explicado':
    // func(4)
    // (4 - 1) * func(4 - 1) = 3 * (2 * (1 * 1))) = 6;
    // (3 - 1) * func(3 - 1) = 2 * (1 * 1)
    // (2 - 1) * func(2 - 1) = 1 * 1

    // func(5)
    // (5 - 1) * func(5 - 1) = 4 * (3 * (2 * (1 * 1)))) = 24;
    // (4 - 1) * func(4 - 1) = 3 * (2 * (1 * 1)))
    // (3 - 1) * func(3 - 1) = 2 * (1 * 1)
    // (2 - 1) * func(2 - 1) = 1 * 1
    public static void main(String[] args) {
        System.out.println(func(4));
        System.out.println(func(5));
    }
}

