package edu.algoritmo.tema04.b;

import java.util.ArrayList;
import java.util.Scanner;

//Crie um algorítimo que leia uma String S e imprima quantas vezes ocorre o caractere "A" e as posições onde essa condição se verifica.
public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count;
        String s;
        ArrayList<Integer> index = new ArrayList<>();

        count = 0;

        System.out.println("Insira uma palavra:");
        System.out.print(">>> ");
        s = scanner.nextLine();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
                index.add(i+1);
            }
        }

        System.out.printf("A letra A aparece %d vezes. ", count);
        System.out.print("Nas posições: " + index.toString().replaceAll("[^a-zA-Z0-9,]", ""));
    }
}
