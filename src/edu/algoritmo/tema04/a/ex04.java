package edu.algoritmo.tema04.a;

public class ex04 {
    public static void main(String[] args) {
        int l, m, aux;
        int[] vetor = {10, 8, 6, 5, 12, 1, 10, 12, 8, 5};

        l = 1;
        m = 0;
        aux = 0;

        while(l < 10) {
            if (vetor[l] > m) {
                m = vetor[l];
                aux = l + 1;
            }
            l++;
        }

        System.out.println(aux);
        System.out.println(m);
    }
}
