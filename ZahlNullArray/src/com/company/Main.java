package com.company;

// Schreiben Sie eine Prozedur allHaveZero, welche ein Array von int-Arrays nimmt und prüft, ob alle
// Arrays die Zahl 0 enthalten

public class Main {

    public static void main(String[] args) {
	    
    }
    public static boolean containsZero (int[] ar) {
        for(int j=0; j<ar.length; j++) {
            if (ar[j] == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean allHaveZero (int[][] arrays) {
        for(int i=0; i<arrays.length; i++) {
            if (! containsZero (arrays[i])) {
                return false;
            }
        }
        return true;
    }

}
