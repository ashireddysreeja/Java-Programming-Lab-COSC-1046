/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab8
 *Any and all work in this file is my own.
 */



package DataStructures7;

import java.util.Scanner;

class ParenthesisCheckingTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        ArrayStack stack = new ArrayStack();

        try {
            // Check for balanced parentheses
            for (int i = 0; i < inputString.length(); i++) {
                char currentChar = inputString.charAt(i);

                if (currentChar == '(') {
                    stack.push(currentChar);
                } else if (currentChar == ')') {
                    if (stack.isEmpty()) {
                        throw new StackException("The string \"" + inputString + "\" has too many closing parentheses.");
                    } else {
                        stack.pop();
                    }
                }
            }

            // Check if stack is empty (balanced parentheses)
            if (stack.isEmpty()) {
                System.out.println("The string \"" + inputString + "\" has correct number of parentheses.");
            } else {
                throw new StackException("The string \"" + inputString + "\" has too many opening  parentheses.");
            }
        } catch (StackException e) {
            System.err.println(e.getMessage());
        }

        scanner.close();
    }
}