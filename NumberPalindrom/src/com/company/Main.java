package com.company;

// Write a method called isPalindrome with one int parameter called number.
// It should return true if the number is a palindrome number otherwise it should return false.
// Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number.

public class Main {

    public static void main(String[] args) {

    }
    public static boolean isPalindrome(int number) {
        if(number < 0){
            number *= -1;
        }
        int copy = number;
        int lastDigit = 0;
        int reversed = 0;
        while(0 < number){
            lastDigit += number % 10;
            lastDigit *= 10;
            number /= 10;
            reversed = lastDigit / 10;
        }if(reversed == copy){
            return true;
        }
        return false;
    }
}
