package DataStructures7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Custom exception for stack operations
class StackException extends RuntimeException {
    public StackException(String message) {
        super(message);
    }
}

// ArrayStack class
class ArrayStack {
    private List<Character> stackList;

    public ArrayStack() {
        stackList = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public void push(char item) {
        stackList.add(item);
    }

    public char pop() {
        if (isEmpty()) {
            throw new StackException("Stack underflow. Cannot pop from an empty stack.");
        }
        int lastIndex = stackList.size() - 1;
        char poppedItem = stackList.get(lastIndex);
        stackList.remove(lastIndex);
        return poppedItem;
    }

    public void popAll() {
        stackList.clear();
    }

    public char peek() {
        if (isEmpty()) {
            throw new StackException("Cannot peek into an empty stack.");
        }
        return stackList.get(stackList.size() - 1);
    }
}
