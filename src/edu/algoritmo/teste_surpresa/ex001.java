package edu.algoritmo.teste_surpresa;

import java.util.Scanner;

public class ex001 {


    public static void main(String[] args) {

        // Criação  das variáveis.
        int s_par, p_imp, numUsuario;
        final int FLAG;

        // Inicialização das variáveis.
        s_par = 0;
        p_imp = 1;
        numUsuario = 0;
        FLAG = 9999;

        // Scanner para input de dado em JAVA.
        Scanner read = new Scanner(System.in);

        // Loop que tem como condição de parada a inserção do valor '9999' por parte do usuário.
        while (numUsuario != FLAG) {

            // Aqui o usuário insere um valor, e ele será atribuido a variável 'numUsuario', que alterada sempre que o loop se repetir e um novo valor for inserido.
            System.out.println("Insira um número: ");
            numUsuario = read.nextInt();

            // Verifica se o valor inserido é diferente de 9999, para que ele não seja levado em consideração no processo de contagem de números impares.
            if (numUsuario != FLAG) {
                // Se for, verificaremos se o resto da divisão do número inserido é 0. Se for, significa que ele é par.
                if (numUsuario % 2 == 0) {
                    // Sendo ele par, somaremos ele a variável 's_par' que criamos para isso.
                    s_par += numUsuario;
                } else {
                    // Se não for par, ele consequentemente será ímpar. Assim, será calculado o produto e o valor armazenado no 'p_imp'
                    p_imp *= numUsuario;
                }
            }
        }

        // Output (saída) de dados no terminal.
        System.out.println("S_PAR: " + s_par);
        System.out.println("P_IMP: " + p_imp);
    }
}