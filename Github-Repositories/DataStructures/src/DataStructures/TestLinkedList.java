/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab1,Part1
 *Any and all work in this file is my own.
 */





package DataStructures;
public class TestLinkedList {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        // Insert items into the list
        String[] items = {"Milk", "Eggs", "Celery", "Bananas", "Apples", "Oranges", "Cookies", "Steak"};
        for (String item : items) {
            try {
                list.add(item, list.size());
                System.out.println("List after insertion of " + item + ": " + list.toString());
            } catch (ListException e) {
                System.out.println("Exception occurred: " + e.getMessage());
            }
        }

        // Remove Celery and Oranges from the list
        try {
            int celeryIndex = list.find("Celery");
            list.remove(celeryIndex);
            System.out.println("List after removing Celery: " + list.toString());

            int orangesIndex = list.find("Oranges");
            list.remove(orangesIndex);
            System.out.println("List after removing Oranges: " + list.toString());
        } catch (ListException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}