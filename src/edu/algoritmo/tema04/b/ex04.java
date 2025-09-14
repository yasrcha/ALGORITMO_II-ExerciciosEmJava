package edu.algoritmo.tema04.b;

// Elabore um algoritmo que leia duas variáveis do tipo String (S1 e S2) de mesmo comprimento e troque os seus conteúdos.
// Exemplo:
// S1:= 'INFORMÁTICA';
// S2:= 'TECNOLOGIAS';
// Após a execução do algoritmo os conteúdos de S1 e S2 serão:
// S1:= 'TECNOLOGIAS';
// S2:= 'INFORMÁTICA';

public class ex04 {
    private static void changeVariables(String S1, String S2) {
        String aux;

        aux = S1;
        S1 = S2;
        S2 = aux;

        System.out.printf("S1:= %s", S1);
        System.out.printf("\nS2:= %s", S2);
    }

    private static void changeParPosition(String S1, String S2) {
        char aux;
        char[] s1, s2;

        s1 = S1.toCharArray();
        s2 = S2.toCharArray();

        for(int i = 0; i < S1.length(); i++) {
            if(i % 2 == 0) {
                aux = s1[i];
                s1[i] = s2[i];
                s2[i] = aux;
            }
        }
        System.out.println(s1);
        System.out.println(s2);
    }
    public static void main(String[] args) {
        String s1 = "INFORMÁTICA";
        String s2 = "TECNOLOGIAS";

        System.out.printf("S1:= %s", s1);
        System.out.printf("\nS2:= %s", s2);
        System.out.println("\nApós o algoritmo #1:");
        changeVariables(s1, s2);

        System.out.println("\nApós o algoritmo #2:");
        changeParPosition(s1, s2);
    }
}
