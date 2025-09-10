package edu.algoritmo.tema02;

// O exercício quer saber qual será o retorno da função após a chamada de 'RR(n, n-1)'
public class ex10 {

    private static int RR(int x, int y) {

        if (x == y || x == 0) {
            return 1;
        } else {
            return RR(x-1, y) + RR (x-1, y-1);
        }
    }

    public static void main(String[] args) {
        int n;

        n = 4;

        System.out.println(RR(n, n - 1));
    }
}

// Explicação:
// Temos 'RR(n, n - 1)' como primeira instância da função 'RR'. Sendo n = 4, a função será iniciada com os valores 4 (n), que será X, e por 3 (n-1), que será Y.
// A primeira parte da função passa os parâmetros recebidos (4 e 3) por um estrutura de condição. Se X (4) e Y (3) forem iguais -> OU <- X (4) for igual a 0, o valor retornado será 1.

// Seguindo essa logica, voltamos para a primeira instância da função: 'RR(4, 3)'
// RR(4,3) = RR(3,3) + RR(3,2) :: Por que?
// -> Como X e Y são diferentes, e X não vale 0, passamos para a segunda parte da estrutura de condição, que retorna: 'RR(x-1, y) + RR (x-1, y-1)'.
// Sendo assim, RR(4-1, 3) + RR(4-1, 3-1) :: Fazendo as subtrações, ficará:
// RR(3, 3) + RR(3, 2). Logo:
// RR(4,3) = RR(3,3) + RR(3,2)

// Aqui notamos que se trata de uma função recursiva, pois 'RR' está chamando a sí mesmo. Sendo assim, a função irá se repetir até o ela não se chamar novamente, ou a condição de parada for atendida.

// Seguindo com: 'RR(4,3) = RR(3,3) + RR(3,2)'
//                           |-> 1;    |-> RR(2,2) + RR(2,1)
// Como em 'RR(3,3)' X e Y são iguais, a função retorna 1 e então é encerrada. Sendo assim, RR(3,3) vale 1.
// Em RR(3,2) nenhuma das condição de parada é atendida -> X e Y não são iguais, e X não vale 0. Assim, passamos para a próxima parte da estrutura de condição, que nos retornará o valor: RR(3-1, 2) + RR(3-1, 2-1).
// -> RR(4,3) = 1 + RR(2,2) + RR(2,1)

// RR(4,3) = 1 + RR(2,2) + RR(2,1)
//                |-> 1;    |-> RR(1, 1) + RR(1, 0)
// Seguindo a mesma lógica usando anteriormente - como iremos fazer até o final:
// RR(2,2) é 1, pois X(2) e Y(2) são valores iguais, então a primeira condição de parada será atendida, o valor 1 será retornado e a função encerrada.
// RR(2,1) é RR(1, 1) + RR(1, 0), pois X e Y não são iguais, e X não vale zero. Então, seguindo para a próxima parte da estrutura de condição, o valor RR(2-1, 1) + RR(2-1, 1-1) será retornado.
// -> RR(4,3) = 1 + 1 + RR(1,1) + RR(1,0)

// RR(4,3) = 1 + 1 + RR(1,1) + RR(1,0)
//                    |-> 1;    |-> RR(0,0) + RR(0,-1)
// RR(1,1) -> X e Y iguais, logo retornará 1.
// RR(1,0) -> X e Y diferentes, e X não vale 0, logo retornará RR(1-1, 0) + RR(1-1, 0-1)
// -> RR(4,3) = 1 + 1 + 1 + RR(0,0) + RR(0,-1)

// RR(4,3) = 1 + 1 + 1 + RR(0,0) + RR(0,-1)
//                        |-> 1;    |-> 1;
// RR(0,0) -> X e Y são iguais, então a estrutura de condição retornará 1;
// RR(0,-1) -> X e Y são diferentes, mas X vale 0, logo a primeira condição também será atendida e o valor retornado será 1;

// Por fim, teremos:
// RR(4,3) = 1 + 1 + 1 + 1 + 1
// RR(4,3) = 5;

// =======================================

// Passo a passo sem explicação:
// RR(4,3) = RR(3,3) + RR(3, 2)
// RR(4,3) = 1 + RR(2,2) + RR(2,1)
// RR(4,3) = 1 + 1 + RR(1,1) + RR(1,0)
// RR(4,3) = 1 + 1 + 1 + RR(0,0) + RR(0,-1)
// RR(4,3) = 1 + 1 + 1 + 1 + 1
// RR(4,3) = 5;