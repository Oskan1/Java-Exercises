package com.company;

// Write a method called inputThenPrintSumAndAverage that does not have any parameters.
// The method needs to keep reading int numbers from the keyboard.
// When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
//XX represents the sum of all entered numbers of type int.
//YY represents the calculated average of all numbers of type long.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        while(scanner.hasNextInt()){
            int userInput = scanner.nextInt();
            sum += userInput;
            counter++;
            if(!scanner.hasNextInt()){
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/counter));
    }
}
