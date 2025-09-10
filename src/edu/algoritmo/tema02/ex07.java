package edu.algoritmo.tema02;

// Julgue o item a seguir relativo a técnicas de programação:
// Em um algoritmo que utilize o processo de recursão, é necessário a existência de uma condição de parada a fim de evitar que o algoritmo entre em um loop.
// [Correto. Se não criamos uma condição de parada, a função ficará se chamando infinitamente.]
public class ex07 {

    // Nessa função, vista no 'ex05', a condição de parada está no primeiro 'if'. Quando o valor de 'n' for 1, ou menor, o programa irá retornar um valor e então encerrar o processo.
    private static int func(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return (n - 1) * func(n - 1);
        }
    }

    public static void main(String[] args) {

    }
}
