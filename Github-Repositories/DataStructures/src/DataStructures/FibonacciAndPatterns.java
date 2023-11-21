/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab1,Part1
 *Any and all work in this file is my own.
 */



package DataStructures;
import java.util.Scanner;

public class FibonacciAndPatterns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int fibonacciResult = fib(n);
        System.out.println("Fibonacci of " + n + " is: " + fibonacciResult);

        System.out.println("Printing Up Pattern:");
        printUp(n, 1);

        System.out.println("Printing Down Pattern:");
        printDown(n, 1);
    }

    public static int fib(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void printUp(int n, int current) {
        if (n <= 0) {
            return;
        }

        printUp(n - 1, current + 1);
        for (int i = 0; i < current; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printDown(int n, int current) {
        if (n <= 0) {
            return;
        }

        for (int i = 0; i < current; i++) {
            System.out.print("*");
        }
        System.out.println();
        printDown(n - 1, current + 1);
    }
}