package edu.algoritmo.teste_surpresa;

public class ex002 {

    public static void main(String[] args) {

        // Crianção das variáveis.
        String s1, s2;

        // No exemplo, o Array começa a ser contado a partir
        // do 1, enquanto aqui - e em muitas langs - começa
        // no 0. Com isso, foi adicionado o "N" no
        // início, como um elemento "Null" que valerá pelo 0.
        s1 = "NAXGPRVTQOZ";
        s2 = "NDLSOWIHMKS";

        // Loop como foi feito no exemplo. Poderia ter começado por padrão no 0 e evitado ter que colocar o 'N' no inicio das variáveis, mas a intenção é seguir o exemplo.
        // Aqui a variável de controle 'i' é inicializada em '1'. Ela é usada para dar sentido a condição de controle, que vem logo a seguir, e para rastrear quantas vezes o loop já se repetiu.
        // A condição seguinte impõe uma condição de parada para o 'loop', senão teriamos um 'loop' infinito que a memória RAM computador poderia não gostar nadinha dependendo do tamanho dela e dos recursos consumidos pela estrutura de repetição. A condição verifica se o valor de 'i' ainda é menor que ao tamanho da string 's1'.
        // + !! (s1.length()) é como pegamos o tamanho de um string na linguagem JAVA.
        // Por fim temos o operador de incrementação, que garante que o estado/valor da variável de controle 'i' seja mutável durante o processo, e não fique para sempre no '1' (caso contrário, também seriamos levados a um loop infinito)
        for (int i = 1; i < s1.length(); i++) {

            // Aqui é verificado se 'i' - que estamos como base para pegar a posição dos caracteres (char) dentro da String, é par.
            // % (mod) retorna o resto de uma divisão. Lógicamente, se o resto de uma divisão é 0, o numéro é par, e se for diferente de 0, o numéro é ímpar.
            // No exercício é pedido para fazer essa distinção, então pegaremos apenas os caracteres em posição para na string 's1'.
            if (i % 2 != 0) {
                System.out.println(s1.charAt(i));

            // E os em posição ímpar na string 's2'
            } else {
                // charAt é como acessamos a posição de um caractere em uma string na linguagem JAVA.
                System.out.println(s2.charAt(i));
            }
        }
    }
}
