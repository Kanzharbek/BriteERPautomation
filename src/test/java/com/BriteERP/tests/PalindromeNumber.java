package com.BriteERP.tests;

public class PalindromeNumber {

    public static void main(String[] args) {

        int lastDigit,sum=0,a;
        int inputNumber=1210; //It is the number  to be checked for palindrome

        a=inputNumber;

        // Code to reverse a number
        while(a>0) {
            System.out.println("Input Number "+a);
            lastDigit=a%10; //getting remainder
            System.out.println("Last Digit "+lastDigit);
            System.out.println("Digit "+lastDigit+ " was added to sum "+(sum*10));
            sum=(sum*10)+lastDigit;
            a=a/10;

        }

        // if given number equal to sum than number is palindrome otherwise not palindrome
        if(sum==inputNumber)
            System.out.println("Number is palindrome ");
        else
            System.out.println("Number is not palindrome");

    }

}
/*
 * Java method to check if number is palindrome or not
 */
/* public static boolean isPalindrome(int number) {
    int palindrome = number; // copied number into variable
    int reverse = 0;
    while (palindrome != 0) {
        int remainder = palindrome % 10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome / 10;
    }
    // if original and reverse of number is equal means
    // number is palindrome in Java
    if (number == reverse) {
        return true;
    }
    return false;
}
*/

