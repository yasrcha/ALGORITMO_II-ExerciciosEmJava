package edu.algoritmo.tema05.a;

// Com base no algoritmo abaixo, responda a questão seguinte:
// Se na linha "leia MAT[1,1]...MAT[3,4]" forem fornecidos os valores abaixo, qual será o valor da variável "T" na linha "escreva T"

// matriz = 1, 0, 2, -1
         // 4, 3, 2,  1
         // 1, -2, 3, 4

public class ex04 {

    public static void main(String[] args) {
        System.out.println("Reposta: 12. nos comentários do código.");
    }
}

// Loop com I = 1
// S é zerado, S = 0.

// O loop interno começa com J de 1 a 4.
    // J = 1: A condição I > J (1 > 1) é falsa. A = 1.
    // S = 0 + (1 * MAT[1,1]) = 0 + (1 * 1) = 1.

    // J = 2: A condição I > J (1 > 2) é falsa. A = 1.
    // S = 1 + (1 * MAT[1,2]) = 1 + (1 * 0) = 1.

    // J = 3: A condição I > J (1 > 3) é falsa. A = 1.
    // S = 1 + (1 * MAT[1,3]) = 1 + (1 * 2) = 3.

    // J = 4: A condição I > J (1 > 4) é falsa. A = 1.
    // S = 3 + (1 * MAT[1,4]) = 3 + (1 * -1) = 2.

// T: T = T + S | T: 0 + 2 = 2.

// Loop com I = 2
// S é zerado. S = 0.

    // J = 1: A condição I > J (2 > 1) é verdadeira. A = -1.
    // S = 0 + (-1 * MAT[2,1]) = 0 + (-1 * 4) = -4.

    // J = 2: A condição I > J (2 > 2) é falsa. A = 1.
    // S = -4 + (1 * MAT[2,2]) = -4 + (1 * 3) = -1.

    // J = 3: A condição I > J (2 > 3) é falsa. A = 1.
    // S = -1 + (1 * MAT[2,3]) = -1 + (1 * 2) = 1.

    // J = 4: A condição I > J (2 > 4) é falsa. A = 1.
    // S = 1 + (1 * MAT[2,4]) = 1 + (1 * 1) = 2.

// T: T = T + S | T: 2 + 2 = 4.

// Loop I = 3
// S é zerado, S = 0.

    // J = 1: A condição I > J (3 > 1) é verdadeira. A = -1.
    // S = 0 + (-1 * MAT[3,1]) = 0 + (-1 * 1) = -1.

    // J = 2: A condição I > J (3 > 2) é verdadeira. A = -1.
    // S = -1 + (-1 * MAT[3,2]) = -1 + (-1 * -2) = -1 + 2 = 1.

    // J = 3: A condição I > J (3 > 3) é falsa. A = 1.
    // S = 1 + (1 * MAT[3,3]) = 1 + (1 * 3) = 4.

    // J = 4: A condição I > J (3 > 4) é falsa. A = 1.
    // S = 4 + (1 * MAT[3,4]) = 4 + (1 * 4) = 8.

// T: T = T + S | T: 4 + 8 = 12.

