package edu.algoritmo.tema01;

import java.util.Scanner;

public class ex01 {

//    O exercício um nós dá esse código:

//    public static void cab(int nome){
//        System.out.println("========UNICARIOCA========");
//        System.out.println("       Algoritmo-II       ");
//        System.out.println("Nome: " + nome);
//        System.out.println("==========================");
//    }
    // Ele gera um erro no resultado final, pois era esperado um dado do tipo 'integer' (int), mas é pedido para inserir o nome, que é um dado do tipo 'string'
    // Para corrigir, é necessário mudar o parametro do metódo de 'int' para 'String'.
    public static void cab(String nome){
        System.out.println("========UNICARIOCA========");
        System.out.println("       Algoritmo-II       ");
        System.out.println("Nome: " + nome);
        System.out.println("==========================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x;
        System.out.print("Digite seu nome: ");
        x = scanner.nextLine();

        cab(x);
    }
}
