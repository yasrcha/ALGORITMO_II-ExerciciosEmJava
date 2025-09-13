package edu.algoritmo.tema04.a;

import java.util.ArrayList;

// Elabore um algoritmo que leia um conjunto de 10 dados numéricos e gere dois vetores, o primeiro (vetor X) com os elementos de ordem par, e o segundo (vetor Y) com os elementos de ordem ímpar. (está se referindo aos indices)
public class ex02 {

    public static void main(String[] args) {
        // Vetor principal, que irá armazenar os números gerados randomicamente (Linha 15...18), e será lido futuramente.
        ArrayList<Integer> vectorMain = new ArrayList<>();
        // Array que irá armazenar elementos pares do vectorMain
        ArrayList<Integer> vectorOrdemPar = new ArrayList<>();
        // Array que irá armazenar elementos ímpares do vectorMain
        ArrayList<Integer> vectorOrdemImpar = new ArrayList<>();

        // Loop para gerar 10 números randomicamente
        for(int i = 0; i < 10; i++) {
            // Váriavel para armazenar o valor gerado randomicamente.
            // O '* 100' é usado para garantir que os números gerados fiquem entre 0 e 100.
            double randomNumber = Math.random() * 100;
            vectorMain.add((int)randomNumber);
        }

        for(int i = 0; i < vectorMain.size(); i++) {
            if(i % 2 == 0) {
                vectorOrdemPar.add(vectorMain.get(i));
            } else {
                vectorOrdemImpar.add(vectorMain.get(i));

            }
        }

        System.out.println("O vetor principal, completo, é: " + vectorMain);
        System.out.println("Vetor de elementos de ordem par: " + vectorOrdemPar);
        System.out.println("Vetor de elementos de ordem ímpar: " + vectorOrdemImpar);
    }
}
