package edu.algoritmo.teste_surpresa;

import java.util.Scanner;

public class ex003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando as variáveis e tornando elas existentes no programa.
        double x, minimo, maximo;
        int i, posmin, posmax;

        // Entrada de dado feita pelo usuário.
        System.out.println("Digite um número (ou 9999 para terminar): ");
        x = scanner.nextDouble();

        // Inicialização das variáveis (aqui definimos os seus valores)
        // O valor do minimo e do maximo é inicializado com o valor inserido pelo usuário, pois precisamos ter um ponto de partida para fazer a comparação futuramente.
        // i, posmin, posmax são inicializados porque eles precisam de um valor diferente de null para que não gere erro no programa. A escolha do "1" para isso é apenas uma convenção comum, principalmente quando estamos trabalhando com listas, arrays ou uma sequência de dados.
        minimo = x;
        maximo = x;
        i = 1;
        posmin = 1;
        posmax = 1;

        // Definimos a "FLAG" do programa. ‘FLAG’ é o parametro de parada. Quando o usuário digitar o valor "9999" o programa será encerrado.
        while(x != 9999) {

            // Supondo que o valor inserido inicialmente foi "5", aqui ele será verificado se "5" (valor de X, valor inserido pelo usuário) é maior que o valor de "maximo".
            // Na primeira vez, eles serão iguais, pois inicializamos a variável de maximo a atribuído o valor de X.
            // Supondo que na segunda vez que o ‘Loop’ rodar o valor inserido pelo usuário seja "10", então verificaremos se x (agora "10") é maior do que o valor de maximo (ainda "5").
            if (x > maximo) {
                // Se a condição for atendida (true) e o novo valor de X for maior que o antigo valor de "maximo", atribuiremos esse novo valor a maximo, e ele passará a valer "10"
                maximo = x;
                // Aqui salvamos o 'indice' do valor. Cada vez que o 'loop' roda, incrementamos o valor de i. Sendo assim, se o i foi inicializado como '1', foi incrementado em +1, o valor armazenado no 'posmax' será 2, já que '10' foi inserido na segunda vez que 'loop' rodou.
                posmax = i;

                // Aqui seguimos a mesma lógica, mas ao contrário. Vamos verificar se o valor de X é menor que o valor 'minimo' atribuido anteriormente. Nesse caso, seguindo os exemplos, ainda é '5', pois o valor inserido na segunda vez foi '10'.
                // Seguindo para a terceira vez que o 'loop' é executado, e supondo que o valor inserido agora foi '2', 'x' ('2') será sim menor que o valor de minimo ('5').
            } else if (x < minimo) {
                // Sendo assim, o novo valor de 'minimo' passará a ser '2'
                minimo = x;
                // e o posmin assumirá o valor '3'.
                posmin = i;
            }

            // Operador de incremento. Sempre adicionará +1 ao valor de 'i'.
            i++;
            // Pedido para que o usuário insira um novo valor. (Sim, isso poderia ser uma função fora da 'main' (não é possivel criar metodo dentro de outro metodo em JAVA.

            System.out.println("Digite outro número (ou 9999 para terminar): ");
            x = scanner.nextDouble();
        }

        // Output (saída) dos dados.
        System.out.println("Menor valor: " + minimo);
        System.out.println("Posição do menor valor: " + posmin);
        System.out.println("Maior valor: " + maximo);
        System.out.println("Posição do maior valor: " + posmax);
    }
}