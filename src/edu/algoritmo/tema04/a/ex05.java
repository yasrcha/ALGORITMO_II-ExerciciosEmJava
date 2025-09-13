package edu.algoritmo.tema04.a;

// Crie um algoritmo que leia uma cadeia de caracteres maiúsculos (STRING-LITERAL)(S) sem brancos, e imprima quantas vezes ocorre a letra 'A'.

import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        String word;
        char[] caracteresArray;

        System.out.print("Introduza uma palavra: ");
        word = scanner.nextLine().toUpperCase(Locale.ROOT);

        caracteresArray = word.toCharArray();

        for (char character : caracteresArray) {
            if (character == 'A') {
                counter++;
            }
        }

        System.out.printf("A palavra %s tem %d 'A'", new String(caracteresArray), counter);
    }
}
