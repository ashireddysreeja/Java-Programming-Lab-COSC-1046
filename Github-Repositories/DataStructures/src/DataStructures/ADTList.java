/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab1,Part1
 *Any and all work in this file is my own.
 */


package DataStructures;
public class ADTList {
    private String[] items;
    private int size;

    public ADTList(int capacity) {
        if (capacity <= 0) {
            throw new ListException("Invalid capacity. Need to be positive number.");
        }
        items = new String[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(String item, int i) {
        if (i < 0 || i > size) {
            throw new ListException("Invalid index to add to list.");
        }

        if (size == items.length) {
            throw new ListException("List is full. Cannot add items.");
        }

        for (int j = size; j > i; j--) {
            items[j] = items[j - 1];
        }

        items[i] = item;
        size++;
    }

    public String remove(int i) {
        if (i < 0 || i >= size) {
            throw new ListException("Invalid index for remove operation.");
        }

        String removedItem = items[i];

        for (int j = i; j < size - 1; j++) {
            items[j] = items[j + 1];
        }

        size--;
        return removedItem;
    }

    public void removeAll() {
        items = new String[items.length];
        size = 0;
    }

    public String get(int i) {
        if (i < 0 || i >= size) {
            throw new ListException("Invalid index for get operation.");
        }
        return items[i];
    }

    public int find(String item) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size - 1; i++) {
            result.append(items[i]).append(", ");
        }
        if (size > 0) {
            result.append(items[size - 1]);
        }
        return result.toString();
    }
}


