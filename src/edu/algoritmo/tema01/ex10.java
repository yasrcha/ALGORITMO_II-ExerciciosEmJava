package edu.algoritmo.tema01;

import java.util.Scanner;

// Tendo como referência o procedente código estruturado, julgue o item a seguir:
// Como a estratégia de programação estruturada e o uso de módulos de procedimento (sub-rotinas) e funções, o código apresenta a sub-rotina TROCA adequadamente descrita antes de sua chamada na rotina principal.

// Conversão do algoritmo para Java:
public class ex10 {
    private static void troca(int A, int B) {
        int Y;

        Y = A;
        A = B;
        B = Y;

        System.out.println("Dentro do procedimento TROCA:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B;

        System.out.println("Insira o valor de 'A':");
        System.out.print(">>> ");
        A = scanner.nextInt();
        System.out.println("Insira o valor de 'B':");
        System.out.print(">>> ");
        B = scanner.nextInt();

        troca(A, B);

        System.out.println("\nDepois de chamar o procedimento:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}

// Sim, as trocas ocorrem corretamente.