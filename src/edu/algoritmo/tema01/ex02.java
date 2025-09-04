package edu.algoritmo.tema01;


// Nesse exercício, é pedido para julgarmos o item subsequente abaixo:
// "Em uma função, os parâmetros podem ser passados por meio de valor; isso, no entanto, implica que a mudança do valor do parâmetro dentro da função irá afetar o valor da variável original."
public class ex02 {

    // Função criada para testar a passagem de parâmetro.
    public static void printValor(int a, int b, int c) {
        a = 10;
        b= 5;
        c = 9;

        System.out.printf("Valor alterado dentro da função: %d, %d, %d", a, b, c);
    }

    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 5;
        c = 10;

        // Dentro da função, ocorre a alteração dos valores das váriaveis que recebemos como parâmetro.
        printValor(a, b, c);

        // Mas ao 'imprimir' o valor das variáveis, notamos que não ouve alteração na variável original. Logo, NÃO! Quando os parâmetros são passados por meio de valor, a variável original não é afetada.
        System.out.printf("\nValor de 'a' fora da função: %d", a);
        System.out.printf("\nValor de 'b' fora da função: %d", b);
        System.out.printf("\nValor de 'c' fora da função: %d", c);
    }
}
