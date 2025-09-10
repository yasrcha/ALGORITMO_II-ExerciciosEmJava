package edu.algoritmo.tema02;


// O código abaixo é usado para calcular o fatorial de números. Assinale a alternativa CORRETA sobre esse código:

// a - Esté é um exemplo de procedimento. [Falso, procedimentos não retornam valor]
// b - O comando return pode ser tirado do código e a função terá o mesmo efeito. [Falso, função precisam retornar um valor.]
// c - Exemplo clássico de recursividade. [Verdadeiro, fatorial é um exemplo clássico de recursividade] - [Calcular o fatórial consiste em em um sequência de multiplicações entre um número natural e todos os seus antecessores inteiros e positivos até 1. Logo, repetimos a mesma função e apenas diminuimos 1 do valor anterior.]
// d - Não é possível chamar a função fatorial dentro dela mesma. [Falso. É possível chamar uma função dentro de outra.]
// e - O resultado da função sempre retornará um valor elevado a ele mesmo (valor**valor). [Falso. A função vai retornar a multiplicação do parâmetro 'n' pelo número antecedente a ele.]

// Explicação da função:
public class ex01 {

    // Vamos assumir que o valor passado como parâmetro é '3'. Ou seja, n = 3.
    public static int fatorial(int n) {
        // A função irá verificar se 3 é menor (<) ou igual (=) a 1. Se for, a função será encerrada e retornará o valor '1'. Não sendo, como é o nosso caso atualmente, prosseguiremos para o 'else'.
        if (n <= 1) {
            return 1;
        } else {
            // Aqui, a função irá retornar um cálculo. Esse cálculo se baseia na multiplicação de 3 - o nosso 'n' - pela a própria função.
            // Essa função será executada ainda dentro da função anterior, adotando um comportamento semelhante ao de um 'loop'.
            // Por que? Porque a função irá se repetir e todo o processo irá acontecer mais uma vez. A diferença é que na segunda vez que a função é chamada, o parâmetro passado é diferente. Dessa vez, o parâmetro é 'n - 1'.
            // Como ela foi chamada ainda durante a primeira execução, 'n' ainda vale 3. Sendo assim, o parâmetro passado consiste em '3 - 1' que é 2.
            return n * fatorial(n - 1);
        }
        // Todo o processo descrito anteriormente: verificação de condiçaõ if, passagem para o 'else' etc, irá se repetir, mas dessa vez usando '2' como base. Isso irá acontecer até o número ser 1.
        // Por que? Porque, sendo n = 1, a primeira condição 'if' não será atendida e a função se encerrará depois de retornar o valor '1'.
        // No fim, juntados as vezes que a função se repetiu, teremos a seguinte estrutura de cálculo:
        // 3 * (3 - 1) * (2 - 1) OU 3 * 2 * 1. O resultado de ambas será 6.
    }

    public static void main(String[] args) {
        // Para confirmar o resultado, execute o código abaixo.
        System.out.print(fatorial(3));
    }
}