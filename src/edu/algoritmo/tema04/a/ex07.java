package edu.algoritmo.tema04.a;

public class ex07 {

    private static void q07a() {
        String s1, s2;
        int j;

        s1 = "INFORMÁTICA";
        s2 = "ÇÃO";
        j = 0;

        for(int i = 0; i <= s1.length()-1; i++) {
            if(i <= 6) {
                System.out.print(s1.charAt(i));
            } else {
                System.out.print(s2.charAt(j));
                j += 1;
            }
        }
    }

    private static void q07b() {
        String s;

        s = "BCRWAOSTIEL";

        for(int i = 0; i <= s.length() - 1; i++) {
            if (i % 2 == 0) {
                System.out.print(s.charAt(i));
            } else {
                System.out.print("-");
            }
        }
    }


    public static void main(String[] args) {
        q07b();
    }
}
