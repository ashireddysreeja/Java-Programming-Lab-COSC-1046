/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab8
 *Any and all work in this file is my own.
 */


package DataStructures7;
class CustomStack {
    private char[] stackArray;
    private int top;

    public CustomStack(int capacity) throws StackException {
        if (capacity <= 0) {
            throw new StackException("Capacity must be a positive integer");
        }
        stackArray = new char[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char item) throws StackException {
        if (top == stackArray.length - 1) {
            throw new StackException("Stack Overflow");
        }
        stackArray[++top] = item;
    }

    public char pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack Underflow");
        }
        return stackArray[top--];
    }

    public void popAll() {
        top = -1;
    }

    public char peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        return stackArray[top];
    }
}

class StackException extends Exception {
    public StackException(String message) {
        super(message);
    }
}