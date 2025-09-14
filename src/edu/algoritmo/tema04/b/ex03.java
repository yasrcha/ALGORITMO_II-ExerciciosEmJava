package edu.algoritmo.tema04.b;

import java.util.ArrayList;
import java.util.Scanner;

public class ex03 {

    private static boolean eVogal(char x){
        x = Character.toUpperCase(x);

        return switch (x) {
            case 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaVogal;
        ArrayList<Integer> indiceList = new ArrayList<>();
        String s;

        somaVogal = 0;

        System.out.println("Insira uma palavra:");
        System.out.print(">>> ");
        s = scanner.nextLine();

        for(int i = 0; i < s.length(); i++) {

            if(eVogal(s.charAt(i))) {
                somaVogal++;
                indiceList.add(i+1);
            }

        }

        System.out.printf("Tem %d vogais, nas posições: ", somaVogal);
        System.out.print(indiceList.toString().replaceAll("[^a-zA-Z0-9,]", ""));
    }
}
