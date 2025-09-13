package edu.algoritmo.tema04.a;

public class ex06 {
    private static void q06a() {
        int x = 0;

        // Loop vai de 1 até 5;
        for(int i = 1; i <= 5; i++) {
            // Cada uma das 5 vezes que o primeiro loop rodar, ele irá iniciar uma segundo loop, como vemos abaixo.
            // Esse loop se repete 2 vezes. Uma quando j for 1, e outra quando j for 2.
            for(int j = 1; j <= 2; j++) {
                x += 1;
            }
            // Se a cada loop é adicionado 1 ao valor de X, e o loop se repete 2 vezes, a cada vez que o loop for acionado ele irá somar 2 ao valor de X no total.
            // Agora, se o primeiro loop se repete 5 vezes antes parar, significar que no final teremos 5 * 2, que dará 10.
        }

        System.out.println(x);
    }

    private static void q06b() {
        int x = 0;

        // Aqui, em parte temos a mesma lógica. O primeiro loop irá se repetir até i ser maior que 5, então será 5 vezes no total. E o outro loop irá se repetir duas vezes.
        for(int i = 1; i <= 5; i++) {
            // A diferença é que ao invés de somar sempre +1 ao valor de X, será somado J.
            // Logo, na primeira vez que o segundo loop for acionado, ira somar +1 ao valor de X, pois j inicialmente vale 1. Na segunda e última vez que ele rodar, será adicionado +2, pois o valor de j é incrementado a cada volta que o loop dá.
            for(int j = 1; j <= 2; j++) {
                x += j;
            }
            // No total, o loop interior irá somar +3 a cada volta que o loop principal (o que vai de 1 até 5) rodar. Assim, teremos ao final: 3 * 5, que é 15
        }

        System.out.println(x);
    }

    private static void q06c() {
        int x = 0;

        // Novamente, seguimos a mesma lógica de loopagem das questões anteriores. O Loop de fora rodará 5 vezes, e o de dentro rodará 2 vezez.
        for(int i = 1; i <= 5; i++) {
            // Nesse caso, a diferença é que é o valor de i que está sendo atribuido a X.
            // Logo, nas primeiras 2 vezes que o loop rodar, i valerá 1.
            // Na segunda, 2. E então, 3, 4 e 5.

            for(int j = 1; j <= 2; j++) {
                x += i;
            }

            // Ao final teremos: (1 + 1) + (2 + 2) + (3 + 3) + (4 + 4) + (5 + 5)
            // 2 + 4 + 6 + 8 + 10 = 30;
        }

        System.out.println(x);
    }

    private static void q06d() {
        int x = 0;

        // O primeiro loop aqui também rodará apenas 5 vezes, mas o segundo agora tem uma condição de parada diferente. Ele rodará até que j seja maior que i.
        for(int i = 1; i <= 5; i++) {
            // Sendo assim, na primeira volta do primeiro loop, i vale 1. O segundo loop irá se repetir apenas 1 vez, somando +1 ao valor de X.
            // Na segunda vez que o primeiro loop rodar, i já vale 2. Assim, será adicionado +2 ao valor de X. +1 na primeira vez que o loop rodar, e +1 na segunda.
            // A lógica se mantém até que o primeiro loop se encerre.
            for(int j = 1; j <= i; j++) {
                x += 1;
            }
            // Ao final tempos: (1) + (1 + 1) + (1 + 1 + 1) + (1 + 1 + 1 + 1) + (1 + 1 + 1 + 1 + 1)
            // 1 + 2 + 3 + 4 + 5 = 15
        }

        System.out.println(x);
    }

    private static void q06e() {
        int x = 0;

        // O primeiro loop irá, novamente, rodar 5 vezes antes de parar. O segundo segue o mesmo padrão da questão anterior.
        for(int i = 1; i <= 5; i++) {
            // A diferença está na soma feita durante a execução do segundo loop. Ao invés de somar +1 a X, ele soma o valor de j.
            for(int j = 1; j <= i; j++) {
                x += j;
            }
            // Ao final teremos: (1) + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5)
            // 1 + 3 + 6 + 10 + 15 = 35
        }

        System.out.println(x);
    }

    private static void q06f() {
        int x = 0;

        // O primeiro loop irá ser repetir 5 vezes. O segundo irá se repetir, a cada loop do primeiro, o número de vezes equivalente a i.
        for(int i = 1; i <= 5; i++) {
            // No primeira volta do primeiro loop, i vale 1, logo o segundo loop irá se repetir apenas uma vez. Na segunda execução do primeiro loop, i vale 2, então o segundo loop irá se repetir 2 vezes, e assim por diante.
            for(int j = 1; j <= i; j++) {
                x += i;
            }
            // Como é somado a X o valor de i, ao final teremos: (1) + (2 + 2) + (3 + 3 + 3) + (4 + 4 + 4 + 4) + (5 + 5 + 5 + 5 + 5)
            // 1 + 4 + 9 + 16 + 25 = 55
        }

        System.out.println(x);
    }

    private static void q06g() {
        int x = 0;

        // O primeiro loop irá ser repetir 5 vezes. O segundo irá se repetir, a cada loop do primeiro, o número de vezes equivalente a i.
        for(int i = 1; i <= 5; i++) {
            // Na primeira volta i vale 1, na segunda 2, na terceira 3 e assim até atingir 5.
            for(int j = 1; j <= i; j++) {
                x += j + i;
            }
            // 1: j + i = 1 + 1 (2) | 2 = 2
            // 2: (j + i = 1 + 2 (3)) + (j + i = 2 + 2 (4)) | 2 + 4 = 7
            // 3: (j + i = 1 + 3 (4)) + (j + i = 2 + 3 (5)) + (j + i = 3 + 3 (6)) | 4 + 5 + 6 = 15
            // 4: (j + i = 1 + 4 (5)) + (j + i = 2 + 4 (6)) + (j + i = 3 + 4 (7)) + (j + i = 4 + 4 (8)) | 5 + 6 + 7 + 8 = 26
            // 5: (j + i = 1 + 5 (6)) + (j + i = 2 + 5 (7)) + (j + i = 3 + 5 (8)) + (j + i = 4 + 5 (9)) + (j + i = 5 + 5 (10)) | 6 + 7 + 8 + 9 + 10 = 40
            // 2 + 6 + 15 + 26 + 40 = 90
        }

        System.out.println(x);
    }

    private static void q06h() {
        int x = 0;

        // O primeiro loop terá 5 ciclos. O segundo loop terá a quantidade de ciclos que valer i. Se i for 1, o segundo loop irá se repetir 1 vez, se valer 2, duas vezes e etc.
        for(int i = 1; i <= 5; i++) {
            // Primeiro ciclo i = 1, então o loop abaixo irá se repetir apenas uma vez, atribuindo a x o valor de j * i.
            for(int j = 1; j <= i; j++) {
                x += j * i;
            }
            // Ao final, teremos.
            // 1 - (j(1) * i(1)) = 1 (1)
            // 2 - (j(1) * i(2)) + (j(2) * i(2)) = 2 + 4 (6)
            // 3 - (j(1) * i(3)) + (j(2) * i(3)) + (j(3) * i(3))) = 3 + 6 + 9 (18)
            // 4 - (j(1) * i(4)) + (j(2) * i(4)) + (j(3) * i(4) + (j(4) * i(4))) = 4 + 8 + 12 + 16 = 40
            // 5 - (j(1) * i(5)) + (j(2) * i(5)) + (j(3) * i(5) + (j(4) * i(5)) + (j(5) * i(5))) = 5 + 10 + 15 + 20 + 25 = 75
            // 1 + 6 + 18 + 40 + 75 = 140
        }

        System.out.println(x);
    }

    public static void main(String[] args) {

        // Para confirmar as respostas, rode o código.
        q06a();
        q06b();
        q06c();
        q06d();
        q06e();
        q06f();
        q06g();
        q06h();
    }
}
