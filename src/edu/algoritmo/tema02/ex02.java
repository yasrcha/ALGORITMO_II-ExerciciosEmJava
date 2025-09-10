package edu.algoritmo.tema02;

// Analise a função ff definida pelo trecho de pseudocódigo exibido a seguir:
public class ex02 {

    // Aqui temos outra função recursiva. Ela segue quase a mesma lógica do calculo fatorial. A diferença é que, ao invés de multiplicar pelo seu antecessor, estaremos somando.

    public static int ff(int n) {
        // Se n for 5, ele vai apenas retornar 5. Se for menor ou maior, irá executar a próxima parte da estrutura de condição.
        if (n == 5) {
            return n;
        } else {
            // Aqui ele vai somar n com o resultado de ff(n - 1).
            return n + ff(n - 1);
        }
    }

    // O exércicio propõe que o parâmetro passado é 12. Sendo assim:
    // 12 + (12 - 1) + (11 - 1) + (10 - 1) + (9 - 1) + (8 - 1) + (7 - 1) + (6 - 1)
    // 12 + 11 + 10 + 9 + 8 + 7 + 6 + 5 = 68.
    public static void main(String[] args) {
        System.out.println(ff(12));
    }
}