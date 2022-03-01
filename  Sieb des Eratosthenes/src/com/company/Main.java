package com.company;
// aufgabe 2) blatt 3

public class Main {

    public static void main(String[] args) {
        Eras("12");
    }
    public static void Eras(String eingabe){
        int n = Integer.parseInt(eingabe);
        boolean[] isPrime = new boolean[n+1];

        for(int i=0; i < isPrime.length; i++){
            isPrime[i] = true;
        }
        for(int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = i; i*j < n+1; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
        for(int i = 2; i < n+1; i++){
            if(isPrime[i]){
                System.out.println(i + " ");
            }
        }
    }
}