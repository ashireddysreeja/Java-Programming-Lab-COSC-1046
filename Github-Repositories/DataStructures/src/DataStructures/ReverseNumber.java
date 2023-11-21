/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab1,Part1
 *Any and all work in this file is my own.
 */



package DataStructures;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int reversedNumber = reverse(number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverse(int number) {
       
        if (Math.abs(number) < 10) {
            return number;
        }

      
        int lastDigit = number % 10;

       
        int remainingDigitsReversed = reverse(number / 10);

       
        int reversedNumber = lastDigit * (int) Math.pow(10, (int) Math.log10(Math.abs(remainingDigitsReversed)) + 1) + remainingDigitsReversed;

      
        if (number < 0) {
            reversedNumber *= -1;
        }

        return reversedNumber;
    }
}

