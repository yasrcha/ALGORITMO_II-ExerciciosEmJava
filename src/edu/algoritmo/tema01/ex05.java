package edu.algoritmo.tema01;

// Quais afirmativas estão corretas:
// 1 - Procedimentos e funções são blocos de instruções para realizar tarefas específicas e são considerados sub-rotinas.
// 2 - Em um procedimento, a passagem de parâmetro é obrigatória.
// 3 - Em uma função, a passagem de parâmetro e o retorno de um valor são obrigátorios.

import java.util.Scanner;

// Respostas:
// 1 - Sim, procedimentos e funções SÃO blocos de instruções bem definidos com um proposito claro e direto.
// 2 - Não, em um procedimento a passagem de parâmetro não é obrigatório, por mais que possivel.
// 3 - Não, não é obrigatório que funções tenham parâmetros, mas é obrigatório que elas retornem um valor.

public class ex05 {

    // Metodo que recebe um parâmetro 'nome', do tipo 'String'. Ele não retorna um valor, portanto é um procedimento.
    private static void menu(String nome) {
        System.out.printf("\n\nOlá, %s! ", nome);
        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("[1] - Somar dois valores");
        System.out.println("[0] - Sair");
        System.out.print(">>> ");
    }

    // Metodo que recebe os parâmetros 'a' e 'b', do tipo integer. Ele retorna a soma de 'a' com 'b', portanto é uma função.
    private static int somarDoisValores(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao, a, b;
        String nome;

        System.out.print("Insira o seu nome: ");
        nome = scanner.nextLine();

        menu(nome);
        opcao = scanner.nextInt();

        while(opcao != 0) {
            System.out.println("Digite o primeiro valor:");
            System.out.print(">>> ");
            a = scanner.nextInt();
            System.out.println("Digite o segundo valor:");
            System.out.print(">>> ");
            b = scanner.nextInt();
            System.out.printf("A soma dos dois valores é: %d", somarDoisValores(a, b));
            menu(nome);
            opcao = scanner.nextInt();
        }
    }
}
// Percebe-se que, dos dois métodos criados para a execução desse processo, ambos possuem um próposito bem definido (somar dois numéros e imprimir o menu no terminal).