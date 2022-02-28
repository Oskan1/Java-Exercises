package com.company;

// Write a method named printSquareStar with one parameter of type int named number.
// If number is < 5, the method should print "Invalid Value".
// The method should print diagonals to generate a rectangular pattern composed of stars (*).

// For each row or column, stars are printed based on four conditions (Read them carefully):
// * In the first or last row
// * In the first or last column
// * When the row number equals the column number
// * When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)

public class Main {

    public static void main(String[] args) {
	    printSquareStar(13);
    }
    public static void printSquareStar(int number){
        if(number < 5) System.out.println("Invalid Value");
        else{
            for (int row = 0; row <number; row++){
                for (int column=0; column<number; column++){
                    if(row==0 || row==number-1 || column==0 || column==number-1
                            || column==row || column==number-1-row) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}


