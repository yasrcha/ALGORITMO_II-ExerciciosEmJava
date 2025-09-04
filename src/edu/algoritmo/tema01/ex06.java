package edu.algoritmo.tema01;

// Assina-le a alternativa CORRETA sobre modularização:
// 1 - O procedimento sempre retorna um valor ao programa. [Falso, procedimentos não retornam valores.]
// 2 - A função retorna um valor ao programa. [Verdadeiro, funções retornam apenas um valor ao programa.]
// 3 - As variáveis definidas no escopo de cada função são acessíveis em todo o programa. [Falso, elas são acessíveis apenas dentro do escopo da função em que foi criada.]
// 4 - As variáveis locais são declaradas no escopo do programa inteiro. [Falso, as variáveis declaradas no escopo do programa inteiro são chamadas de variáveis globais.]
// 5 - A passagem de parâmetros para um subprograma pode ser somente por valor. [Falso, existe também a passagem por referência.]


public class ex06 {
    static int a = 10;

    private static void escopoFuncao() {
        int b = 2;
        System.out.println(b);
    }

    public static void main(String[] args) {
        System.out.println(a);
        // System.out.println(b);
    }
}

// Rode o programa, e perceba que acontecerá um erro, pois o 'main' não tem acesso a variável 'b' e não consegue imprimir ela no terminal. Se apagarmos a linha '21', veremos queo programa rodará sem problemas, e que a variável 'a' será impressa sem problemas, pois ela existe no escopo da 'class' e isso faz com que ela exista no escopo dos métodos que estão dentro dessa 'class'