/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab1,Part1
 *Any and all work in this file is my own.
 */


package DataStructures;
import java.util.Scanner;

public class FibonacciPattern {
    public static void main(String[] args) {
        // Get the value of n from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n = scanner.nextInt();
        scanner.close();

        // Calculate and print the nth Fibonacci number
        int fibonacci = fib(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci);

        // Print the up and down patterns
        System.out.println("Printing the up pattern:");
        printUp(n);
        System.out.println("\nPrinting the down pattern:");
        printDown(n);
    }

    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void printUp(int n) {
        if (n > 0) {
            printUp(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printDown(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            printDown(n - 1);
        }
    }
}