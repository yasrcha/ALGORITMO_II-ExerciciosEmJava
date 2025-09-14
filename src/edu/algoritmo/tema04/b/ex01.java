package edu.algoritmo.tema04.b;

import java.util.Scanner;

//Crie um algoritmo que leia uma String S e imprima aos caracteres das posições pares.
public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s;

        System.out.println("Insira uma palavra:");
        System.out.print(">>> ");
        s = scanner.nextLine();

        for(int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(s.charAt(i));
            }
        }
    }
}
