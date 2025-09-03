package edu.algoritmo.teste_surpresa;

import java.util.Scanner;

public class ex004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        boolean q1, q2;

        System.out.println("Digite um valor para q1 (true/false): ");
        q1 = scanner.nextBoolean();

        System.out.println("Digite um valor para q2 (true/false): ");
        q2 = scanner.nextBoolean();

        // Na tabela, o "a" é executado independente das condições. Sendo q1 e q2 true ou false, o "a" será executado.
        System.out.println("Ação executada: a");

        // Observer que, independentemente do q2 ser true ou false, se o q1 for verdadeiro, "a" e "b" serão executados.
        if (q1) {
            System.out.println("Ação executada: b");
        } else {
            // Agora, se q1 não for true, consequentemente é false. Sendo ele false, precisaremos checar o valor do q2.
            // Se ele for verdadeiro, é impresso "c", senão, nada acontece pois apenas o "a" será executado, e ele já está setado para ser impresso no começo.
            if (q2) {
                System.out.println("Ação executada: c");
            }
        }

    }
}
