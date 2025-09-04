package edu.algoritmo.tema01;

// Essa questão diz que um usuário implementou uma rotina de um programa, denominado Fatorial, e passou para essa rotina um parâmetro com o valor 6, mas deseja receber, após a execução da rotina, nesse mesmo parâmetro, o valor 6! (seis fatorial). Para isso, a passagem de parâmetro deverá ser por...?
// A reposta correta é 'referência'. Sempre que o valor original da variável for afetado durante a execução, significa que a passagem de parâmetro ocorreu por referência.
// Com isso claro, entramos em uma particularidade do Java. Diferente da linguagem 'C', não é possivel passar valores primitivos (int, double, boolean, etc) por referência. Valores primitivos, em Java, são sempre passados por valor.

public class ex04 {

    private static void calcularFatorial(int [] numero) {

        // Mas isso não significa que não existe uma forma de contornar esse problema. Podemos simular a passagem por referência em Java.

        // Esse if irá verificar se o valor que ocupa o primeiro indice do array 'numero' não é negativo. Não é possivel calcular fatorial de número negativo.
        if (numero[0] < 0) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
            // Sem esse return, o código não seria interrompido nesse 'if' e o for (logo abaixo) rodaria com um número negativo.
            return;
        }

        // Passando pela primeira verificação, chegaremos enfim ao calculo fatorial.

        // Aqui criamos uma variável 'resultado' para armazenar o cálculo.
        long resultado = 1;
        // Variável de controle começando em '1'. Depois temos uma condição que implica que o loop irá se repetir enquanto 'i' for menor ou igual ao valor armazenado no primeiro indice do array 'numero'.
        // Supondo que numero[0] é '2'.
        // O i começa como '1', então o loop irá rodar, porque i é menor que numero[0] (2) e a condição é atendida.
        // O bloco de código atribui a 'resultado' a multiplicação de 'resultado' e 'i' (resultado (1) = resultado (1) * i (1). [1 * 1 = 1]. Resultado ainda será 1.
        // Na próxima vez que o loop rodar, 'i' já não valerá mais '1' e sim '2', pois seu valor foi incrementado durante a primeira execução do loop (i++).
        // Valendo 2, a condição para a execução ainda é atendida, pois numero[0] vale 2, então i é igual ao valor.
        // No bloco teremos resultado(1) = resultado(1) * i(2). [1 * 2 = 2]. Resultado agora é 2.
        // Com o 'i' incrementado em +1, passando a valer 3, a condição não será mais atendida (3 > numero[0] - que vale 2)e o loop não irá executar novamente.
        for (int i = 1; i <= numero[0]; i++) {
            resultado *= i;
        }

        // Aqui é onde simulamos a passagem por parâmetro. Passagem por parâmetro consiste que o valor original da variável seja alterada durante a execução, e aqui nos forçamos essa alteração, atribuido ao valor do primeiro indice do array 'numero' (numero[0]) o valor do resultado. O (int) é como fazendo 'casting' em Java.
        numero[0] = (int) resultado;
    }

    // Execução das funções.
    public static void main(String[] args) {
        //Criação do Array/Lista.
        int[] valor = {6};

        // Aqui imprimimos o primeiro valor armazenado no array criado acima. (6)
        System.out.println("Valor original: " + valor[0]);

        // Executamos a função 'calcularFatorial' onde ocorrer a alteração forçada do valor original do primeiro indice do Array.
        calcularFatorial(valor);

        // Por fim, imprimimos o valor depois da execução da função e confirmamos a mudança do valor.
        System.out.println("Valor após o cálculo do fatorial: " + valor[0]);
    }
}
