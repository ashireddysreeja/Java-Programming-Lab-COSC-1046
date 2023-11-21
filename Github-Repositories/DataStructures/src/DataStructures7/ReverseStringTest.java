/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab8
 *Any and all work in this file is my own.
 */


package DataStructures7;

import java.util.Scanner;

public class ReverseStringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        ArrayStack stack = new ArrayStack();

        // Push each character onto the stack
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        // Pop and print each character from the stack
        System.out.print("Reversed string: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        scanner.close();
    }
}
