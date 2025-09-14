package edu.algoritmo.tema04.b;

// Elabore um algoritmo que leia uma variável String(S) e inverta as posições dos seus caracteres.
// Exemplos:
// S:= 'CASA' -> S:= 'ASAC'

public class ex05 {

    private static String invertString(String S) {
        StringBuilder inverseString = new StringBuilder();

        for(int i = S.length() - 1; i >= 0; i--) {
            inverseString.append(S.charAt(i));
        }

        return inverseString.toString();

    }

    public static void main(String[] args) {
        String s = "CASA";
        System.out.println(invertString(s));
    }
}
