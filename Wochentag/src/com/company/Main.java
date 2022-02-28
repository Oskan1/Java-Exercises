package com.company;

// Schreiben Sie ein Programm “Wochentag”, welches den Wochentag für ein bestimmtes Datum ausgibt.

public class Main {

    public static void main(String[] args) {
        int tag = Integer. parseInt(args [0]);
        int monat = Integer.parseInt(args [1]);
        int jahr = Integer.parseInt (args [2]);

        int q = tag;
        int m = monat;
        if (m < 3) {
            m = m + 12;
            jahr = jahr - 1;
        }
        int K = jahr % 100;
        int J = jahr / 100;
        int h = Math.floorMod(q + (13 * (m + 1) / 5) + K + K / 4 + J / 4 + 5 * J, 7);
        switch (h) {
            case 0:
                System.out.println("Samstag");
                break;
            case 1:
                System.out.println("Sonntag");
                break;
            case 2:
                System.out.println("Montag");
                break;
            case 3:
                System.out.println(" Dienstag");
                break;
            case 4:
                System.out.println(" Mittwoch");
                break;
            case 5:
                System.out.println(" Donnerstag ");
                break;
            case 6:
                System.out.println("Freitag");
                break;
        }
    }

}

