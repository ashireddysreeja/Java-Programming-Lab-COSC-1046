/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab7,Part2
 *Any and all work in this file is my own.
 */





package DataStructures;
public class SingleSortedLinkedList {
    public static void main(String[] args) {
        SingleSortedLinkedList list = new SingleSortedLinkedList();

        // (1) Inserts 10 names in the list. Print the list after every insertion.
        for (int i = 0; i < 10; i++) {
            list.insert("Name" + i);
            System.out.println(list);
        }

        // (2) Removes any three random names from the list. Print the list after every removal.
        for (int i = 0; i < 3; i++) {
            list.remove(i);
            System.out.println(list);
        }

        // (3) Catches any exceptions thrown as we did in the last lab.
        try {
            list.remove(10); // Trying to remove an invalid index
        } catch (LinkedListException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
String[] names = {"Soumya", "Rakesh", "Shiva", "Pallavi", "Ira", "Akhila", "Kashvi", "Avi", "Vihaan", "Dharansh"};

        for (String name : names) {
            list.insert(name);
            System.out.println(list);
     }
   }