package edu.algoritmo.tema04.a;

//  Elabore um algoritmo que leia dois vetores numéricos X e Y e gere o vetor Z, de mesma dimensão, cujo conteúdo será o maior valor de cada posição de X e de Y. Assim, por exemplo, se X[1] = 2 e Y[1] = 4, Z[1] será 4 (o maior valor).
import java.util.ArrayList;
import java.util.List;

public class ex03 {

    // Função que gera arrays com números aleatórios. Como dessa vez eu precisaria que o vetor X e Y fossem formados por números diferentes um do outro, foi necessário isolar a funcionalidade em uma função para usá-la individulamente em cada Array.
    private static List<Integer> randomArrayGeneration(ArrayList<Integer> vectorMain) {
        for(int i = 0; i < 10; i++) {
            double randomNumber = Math.random() * 100;
            vectorMain.add((int)randomNumber);
        }
        return vectorMain;
    }

    public static void main(String[] args) {

        // Criação dos 3 Arrays. X e Y, e o Z.
        ArrayList<Integer> vectorX = new ArrayList<>();
        ArrayList<Integer> vectorY = new ArrayList<>();
        ArrayList<Integer> vectorZ = new ArrayList<>();

        // Usados as duas funções nos vetores X e Y para gerar os Arrays com números aleatórios.
        randomArrayGeneration(vectorX);
        randomArrayGeneration(vectorY);

        // Loop que vai verificar qual o maior valor em cada posição, e adicionar ele ao vectorZ.
        for(int i = 0; i < vectorX.size(); i++) {
            if(vectorX.get(i) > vectorY.get(i)) {
                vectorZ.add(vectorX.get(i));
            } else {
                vectorZ.add(vectorY.get(i));
            }
        }

        // Output do resultado final (vectorZ) e dos outros dois Arrays (X e Y) apenas para verificar se funcionou corretamente.
        System.out.println(vectorX);
        System.out.println(vectorY);
        System.out.println(vectorZ);
    }
}
