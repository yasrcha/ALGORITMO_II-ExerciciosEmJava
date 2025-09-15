package edu.algoritmo.tema05.a;

// Dada uma matriz M (inteira) de 3L e 4C construa uma algoritmo que ache e imprima o maior elemento dessa matriz bem como a linha e a coluna onde ele ocorre.

public class ex03 {
    private static void procurarMaiorValorMatriz(int[][] matriz) {
        int maiorValor, linha, coluna;

        maiorValor = 0;
        linha = 0;
        coluna = 0;

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                int valorAtual = matriz[i][j];

                if(maiorValor < valorAtual) {
                    maiorValor = valorAtual;
                    linha = i+1;
                    coluna = j+1;
                }
            }
        }

        System.out.printf("O maior valor é %d, e está na posição: Linha %d, Coluna: %d", maiorValor, linha, coluna);
    }

    public static void main(String[] args) {
        int[][] minhaMatriz = {
                {3, 43, 21, 15},
                {71, 1, 18, 37},
                {90, 36, 7, 62},
        };

        procurarMaiorValorMatriz(minhaMatriz);
    }
}
