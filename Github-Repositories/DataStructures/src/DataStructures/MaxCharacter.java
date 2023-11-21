/**
 *Author:ASHIREDDYGARI SREEJA 
 *Student ID:239457520
 *Lab1,Part1
 *Any and all work in this file is my own.
 */



package DataStructures;
import java.util.*; 
public class MaxCharacter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        char maxChar = maximumChar(input, '\0');
        System.out.println("The character with the highest ASCII value is: " + maxChar);
    }

    public static char maximumChar(String str, char max) {
       
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar > max) {
                max = currentChar;
            }
        }
        return max;
    }
}

