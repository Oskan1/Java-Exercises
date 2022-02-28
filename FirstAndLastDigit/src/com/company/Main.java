package com.company;

// Write a method named sumFirstAndLastDigit with one parameter of type int called number.
// The method needs to find the first and the last digit of the parameter number passed to the method and
// return the sum of the first and the last digit of that number.
//If the number is negative then the method needs to return -1 to indicate an invalid value.

public class Main {

    public static void main(String[] args) {

    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return  -1;
        }
        else if(number <=9){
            return 2*number;
        }
        int copy = number;
        int lastDigit = 0;
        int reversed = 0;
        while(0 < number){
            lastDigit += number % 10;
            lastDigit *= 10;
            number /= 10;
            reversed = lastDigit / 10;
            if(number <=9){
                return number + (copy%10);
            }
        }
        return reversed;
    }
}
