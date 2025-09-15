package edu.algoritmo.tema05.a;

// Dadas duas matrizes genéricas X e Y, de mesma dimensão, construa um algoritmo que gere a matriz Z definida como a soma de X + Y. (Z = X + Y)

public class ex02 {
    private static int[][] somaMatriz(int[][] X, int[][] Y, int[][] Z) {
        for(int i = 0; i < X.length; i++) {
            for(int j = 0; j < X.length; j++) {
                int valorDeX, valorDeY, soma;

                valorDeX = X[i][j];
                valorDeY = Y[i][j];

                soma = valorDeX + valorDeY;

                Z[i][j] = soma;
            }
        }

        return Z;
    }

    private static void imprimirMatriz(int[][] Z) {
        for(int i = 0; i < Z.length; i++) {
            for(int j = 0; j < Z[i].length; j++) {
                System.out.print(Z[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrizX = {
                {3, 34, 21},
                {12, 32, 2},
                {45, 7, 16}
        };

        int[][] matrizY = {
                {8, 22, 56},
                {26, 2, 44},
                {54, 21, 5}
        };

        int[][] matrizZ = new int[3][3];

        int[][] resultadoSoma = somaMatriz(matrizX, matrizY, matrizZ);
        imprimirMatriz(resultadoSoma);
    }
}
