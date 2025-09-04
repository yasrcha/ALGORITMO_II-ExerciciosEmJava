package edu.algoritmo.tema01;

// Sobre o código abaixo, assinale a alternativa correta:
// a - Este é ume exemplo de procedimento. [Falso, pois procedimentos não retornam valores.]
// b - o comando retorne (return) pode ser retirado do código e a função terá o mesmo efeito. [Falso, pois o metodo abaixo se trata de uma função, e é necessário que seja retornado um valor.]
// c - Exemplo clássico de recursividade. [Verdadeiro. Quando uma função chama a si própria dentro do seu bloco de código, chamamos de recursividade.]
// d - Não é possivel chamar a função fatorial dentro dela mesma. [Falso. A função em questão se trata de uma função recursiva, logo é possivel e necessário que ela seja chamada dentro do seu bloco de código.]
// e - O resultado da função sempre retornará um valor elevado a ele mesmo (valor**valor) [Falso, ele retornara o valor anterior a ele multiplicado pelo valor atual - que também pode mudar durante o processo..]

public class ex07 {
    private static int fatorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fatorial(n -1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fatorial(6));
    }
}
