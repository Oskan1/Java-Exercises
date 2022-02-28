package com.company;

// Schreiben Sie ein Java-Programm “Logarithmus”, welches zwei int Zahlen x und b als Programm-Parameter
// nimmt und die größte int Zahl n berechnet, so dass b^n ≤ x gilt. Geben Sie n auf der Konsole aus. 
// Sie können davon ausgehen, dass b > 1 und x ≥ 1 gilt.

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

}
