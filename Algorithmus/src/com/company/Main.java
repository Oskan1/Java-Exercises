package com.company;

public class Main {

    public static void main(String [] args) {
        newAlgo(104, 3);

        int x = Integer.parseInt(args [0]);
        int b = Integer.parseInt(args [1]);

        int n = 0;
        int p = 1;
        while (p <= x) {
            n = n + 1;
            p = p * b;
        }
        System.out.println(n - 1);

    }
    public static void newAlgo(int x, int b){
        int n = 0;
        int p = 1;
        while (p <= x) {
            n += 1;
            p *= b;
        }
        System.out.println(n - 1);
    }

}
