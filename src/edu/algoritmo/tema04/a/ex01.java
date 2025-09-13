package edu.algoritmo.tema04.a;

// Elabore um algoritmo que leia um conjunto de 10 dados numéricos inteiros e gere dois vetores, o primeiro (vetor X) contendo os elementos pares e o segundo (vetor Y) contendo os elementos ímpares.

import java.util.ArrayList;

public class ex01 {

    public static void main(String[] args) {
        // Vetor principal, que irá armazenar os números gerados randomicamente (Linha 15...18), e será lido futuramente.
        ArrayList<Integer> vectorMain = new ArrayList<>();
        // Array que irá armazenar elementos pares do vectorMain
        ArrayList<Integer> vectorX = new ArrayList<>();
        // Array que irá armazenar elementos ímpares do vectorMain
        ArrayList<Integer> vectorY = new ArrayList<>();

        // Loop para gerar 10 números randomicamente
        for(int i = 0; i < 10; i++) {
            // Váriavel para armazenar o valor gerado randomicamente.
            // O '* 100' é usado para garantir que os números gerados fiquem entre 0 e 100.
            double randomNumber = Math.random() * 100;
            vectorMain.add((int)randomNumber);
        }

        // Loop que irá verificar todos os elementos do ArrayList e separá-los em Array de elementos pares e Arrays de elementos ímpares.
        // Essa estrutura é um for-each. Ao invés de eu usar o indice para acessar o valor do Array, nessa estrutura ele já é atribuido a váriavel que criamos (nesse caso 'i').
        for(Integer i : vectorMain) {
            if (i % 2 == 0) {
                vectorX.add(i);
            } else {
                vectorY.add(i);
            }
        }
        System.out.println("O vetor principal, completo, é: " + vectorMain);
        System.out.println("Vetor de elementos pares: " + vectorX);
        System.out.println("Vetor de elementos ímpares: " + vectorY);
    }
}
