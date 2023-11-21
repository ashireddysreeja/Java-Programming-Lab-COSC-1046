/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab1,Part1
 *Any and all work in this file is my own.
 */


package DataStructures;
public class TestList {
    public static void main(String[] args) {
        try {
           
            ADTList newList = new ADTList(8);
            newList.add("Milk", 0);
            System.out.println(newList);
            newList.add("Eggs", 1);
            System.out.println(newList);
            newList.add("Celery", 2);
            System.out.println(newList);
            newList.add("Bananas", 3);
            System.out.println(newList);
            newList.add("Apples", 4);
            System.out.println(newList);
            newList.add("Oranges", 5);
            System.out.println(newList);
            newList.add("Cookies", 6);
            System.out.println(newList);
            newList.add("Steak", 7);
            System.out.println(newList);
            newList.remove(newList.find("Celery"));
            System.out.println(newList);
            newList.remove(newList.find("Oranges"));
            System.out.println(newList);
            System.out.println("Before swap: " + newList);
            swap(newList, 1, 3);
            System.out.println("After swap: " + newList);

        } catch (ListException e) {
            System.out.println("List Exception: " + e.getMessage());
        }
    }

    public static void swap(ADTList list, int i, int j) {
        String temp = list.get(i);
        list.remove(i);
        list.add(temp, j);
    }
}


