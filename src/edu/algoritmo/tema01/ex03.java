package edu.algoritmo.tema01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex03 {
    // "Considere que, em um sistema, seja necessário monta uma lista de opções e criar um rotina para calcular a média das notas dos alunos. Nessa situação, é correto escolher um procedimento para a primeira ação e uma função para a segunda.

    // Esse primeiro metodo é 'void', pois não se espera que ele retorne algum valor. Quando fazendo um metodo/função que não retorna uma valor, ele é classificado como um procedimento. Então, para criar uma 'lista de opções', é correto escolher um procedimento.
    public static void listaOpcoes() {

        System.out.println("[1] - Calcular média");
        System.out.println("[0] - Sair");

    }

    // Já aqui temos um metodo que calcula a média de um array de números inteiros. Escolher uma lista de inteiros pode não ter sido a melhor decisão, pois no final perderemos precisão durante o arredondamento que tem por default em valores do tipo integer.
    // Independente do tipo de dado que o metodo retorne, é esperado que ele retorne algo, e é isso que importa para gente no momento. Se um metodo precisar retornar um valor, ele é uma função.
    public static int calcMedia(List<Integer> numeros) {

        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        return soma / numeros.size();

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        int opcao, x;

        System.out.println("Escolha uma das opções: ");
        listaOpcoes();
        System.out.print(">>> ");
        opcao = scanner.nextInt();

        if (opcao == 1 || opcao == 0) {

            while(opcao == 1) {

                System.out.println("Insira um valor: ");
                System.out.print(">>> ");
                x = scanner.nextInt();
                numeros.add(x);
                System.out.println("[1] - Adicionar outro valor");
                System.out.println("[0] - Sair");
                System.out.print(">>> ");
                opcao = scanner.nextInt();
            }

            System.out.println(calcMedia(numeros));

        } else {

            System.out.println("Valor inválido");

        }
    }
}

// Conclusão: Sim, é correto escolher um procedimento para a primeira opção (lista de opções) e uma função para a segunda (metodo para calcular a média).