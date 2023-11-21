/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab7,Part3
 *Any and all work in this file is my own.
 */




package DataStructures7;
public class SingleSortedLinkedList {
    private SingleNode head;

    public boolean isEmpty() {
        return head == null;
    }
    public int size() {
        int count = 0;
        SingleNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public void insert(String item) {
        if (isEmpty() || item.compareTo(head.item) <= 0) {
            head = new SingleNode(item, head);
            return;
        }
        SingleNode current = head;
        while (current.next != null && item.compareTo(current.next.item) > 0) {
            current = current.next;
        }
        current.next = new SingleNode(item, current.next);
    }
    public String remove(int i) {
        if (isEmpty() || i < 0 || i >= size()) {
            throw new LinkedListException("Invalid index for removal");
        }
        if (i == 0) {
            String removedItem = head.item;
            head = head.next;
            return removedItem;
        }
        SingleNode current = head;
        for (int j = 0; j < i - 1; j++) {
            current = current.next;
        }
        String removedItem = current.next.item;
        current.next = current.next.next;
        return removedItem;
    }
    public void removeAll() {
        head = null;
    }
    public String get(int i) {
        if (isEmpty() || i < 0 || i >= size()) {
            throw new LinkedListException("Invalid index for retriving operation");
        }
        SingleNode current = head;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }
        return current.item;
    }
    public int find(String item) {
        int index = 0;
        SingleNode current = head;
        while (current != null) {
            if (current.item.equals(item)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        SingleNode current = head;
        while (current != null) {
            result.append(current.item).append(" -> ");
            current = current.next;
        }
        result.append("null");
        return result.toString();
    }
}