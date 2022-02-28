package com.company;

// What is the perfect number?
//A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
//Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and
// exclude the perfect number itself.
// Write a method named isPerfectNumber with one parameter of type int named number.
// If number is < 1, the method should return false.

public class Main {

    public static void main(String[] args) {
    }
    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        int sum = 0;
        for(int i=1; i <number; i++){
            if(number%i == 0){
                sum+=i;
            }
        }
        return sum == number;
    }
}
