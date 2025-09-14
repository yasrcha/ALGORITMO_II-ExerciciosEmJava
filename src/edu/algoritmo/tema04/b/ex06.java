package edu.algoritmo.tema04.b;

import java.util.ArrayList;

public class ex06 {

    private static void q06a() {
        ArrayList<Integer> S = new ArrayList<>();

        for(int i = 0; i < 5; i++) {

            if(S.size() <= i) {
                S.add(0);
            } else {
                S.set(i, 0);
            }

            for(int j = 0; j < 2; j++) {
                int actualValue = S.get(i);
                S.set(i, actualValue + 1);
            }
        }

        System.out.println(S);
    }

    private static void q06b() {
        ArrayList<Integer> S = new ArrayList<>();

        for(int i = 0; i < 5; i++) {

            if(S.size() <= i) {
                S.add(0);
            } else {
                S.set(i, 0);
            }

            for(int j = 1; j <= 2; j++) {
                int actualValue = S.get(i);
                S.set(i, actualValue + j);
            }
        }

        System.out.println(S);
    }

    private static void q06c() {
        ArrayList<Integer> S = new ArrayList<>();
        S.add(0);
        for(int i = 1; i <= 5; i++) {

            if(S.size() <= i) {
                S.add(0);
            } else {
                S.set(i, 0);
            }

            for(int j = 1; j <= 2; j++) {
                int actualValue = S.get(i);
                S.set(i, actualValue + i);
            }
        }

        System.out.println(S);
    }

    private static void q06d() {
        ArrayList<Integer> S = new ArrayList<>();
        S.add(0);
        for(int i = 1; i <= 5; i++) {

            if(S.size() <= i) {
                S.add(0);
            } else {
                S.set(i, 0);
            }

            for(int j = 1; j <= i; j++) {
                int actualValue = S.get(i);
                S.set(i, actualValue + 1);
            }
        }

        System.out.println(S);
    }

    private static void q06e() {
        ArrayList<Integer> S = new ArrayList<>();
        S.add(0);
        for(int i = 1; i <= 5; i++) {

            if(S.size() <= i) {
                S.add(0);
            } else {
                S.set(i, 0);
            }

            for(int j = 1; j <= i; j++) {
                int actualValue = S.get(i);
                S.set(i, actualValue + j);
            }
        }

        System.out.println(S);
    }

    private static void q06f() {
        ArrayList<Integer> S = new ArrayList<>();
        S.add(0);
        for(int i = 1; i <= 5; i++) {

            if(S.size() <= i) {
                S.add(0);
            } else {
                S.set(i, 0);
            }

            for(int j = 1; j <= i; j++) {
                int actualValue = S.get(i);
                S.set(i, actualValue + i);
            }
        }

        System.out.println(S);
    }

    private static void q06g() {
        ArrayList<Integer> S = new ArrayList<>();
        S.add(0);
        for(int i = 1; i <= 5; i++) {

            if(S.size() <= i) {
                S.add(0);
            } else {
                S.set(i, 0);
            }

            for(int j = 1; j <= i; j++) {
                int actualValue = S.get(i);
                S.set(i, actualValue + j + j);
            }
        }

        System.out.println(S);
    }

    private static void q06h() {
        ArrayList<Integer> S = new ArrayList<>();
        S.add(0);
        for(int i = 1; i <= 5; i++) {

            if(S.size() <= i) {
                S.add(0);
            } else {
                S.set(i, 0);
            }

            for(int j = 1; j <= i; j++) {
                int actualValue = S.get(i);
                S.set(i, actualValue + i + i);
            }
        }

        System.out.println(S);
    }

    public static void main(String[] args) {
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
