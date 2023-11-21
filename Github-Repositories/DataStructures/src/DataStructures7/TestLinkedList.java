/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab7,Part4
 *Any and all work in this file is my own.
 */



package DataStructures7;
public class TestLinkedList {
    public static void main(String[] args) {
        SingleSortedLinkedList newList = new SingleSortedLinkedList();
        for (int i = 0; i < 10; i++) {
            String name = "Anushka" + i;
            newList.insert(name);
            System.out.println("After insertion: " + newList);
        }
        for (int i = 0; i < 3; i++) {
            try {
                newList.remove(i);
                System.out.println("After removal: " + newList);
            } catch (LinkedListException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
        try {  
            newList.removeAll();
            newList.remove(0); 
        } catch (LinkedListException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
