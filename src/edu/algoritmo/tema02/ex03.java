package edu.algoritmo.tema02;

// A situação em que dois subprogramas fazem chamadas recíprocas, como, por exemplo, um subprograma P faz uma chamada para um subprograma J, que, por sua vez, faz uma chamada a P, é caracterizada como uma:
// R: Recursividade indireta. O subprograma P está chamando diretamente o subprograma J, que está chamando diretamente o subprograma P. Sendo assim, quando executamos P, e ele executa J dentro de sí, está executando a sí mesmo INDIRETAMENTE (já que J está chamando P).

public class ex03 {
    private static int subProgramaP(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n + subProgramaJ(n - 1);
        }
    }

    private static int subProgramaJ(int n){
        if (n <= 1) {
            return 1;
        } else {
            return n * subProgramaP(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(subProgramaP(3));
    }
}

// 5 + sPJ(4) = 5 + (4 * (3 + (2 * 1)
// 4 * sPP(3) = 4 * (3 + (2 * 1))
// 3 + sPJ(2) = 3 + (2 * 1)
// 2 * SPP(1) = 2 * 1

// 2 + 3 = 5
// 5 * 4 = 20
// 20 + 5 = 25