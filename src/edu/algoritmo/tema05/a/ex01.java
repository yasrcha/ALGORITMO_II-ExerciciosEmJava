package edu.algoritmo.tema05.a;

// Elabore um algoritmo que:
// Leia uma matriz MAT inteira de 3 linhas e 4 colunas para a memória (por linha)
// Imprima todos os números pares que ocorrem na matriz MAT, bem como as posições da matriz onde essa condição se verifica.

public class ex01 {

    private static void imprimirValor (int[][] matriz) {

        for (int[] ints : matriz) {
            for (int j = 0; j <= matriz.length; j++) {
                int valor = ints[j];
                System.out.println(valor);
            }
        }
    }

    private static void imprimirPares(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j <= matriz.length; j++) {
                int valor = matriz[i][j];
                if (valor % 2 == 0) {
                    System.out.printf("\nValor: %d, Linha: %d - Coluna: %d", valor, i+1, j+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] minhaMatriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        imprimirValor(minhaMatriz);
        imprimirPares(minhaMatriz);
    }
}
