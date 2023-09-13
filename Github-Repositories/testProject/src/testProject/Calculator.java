package testProject;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first integer value:");
		int num1Int = input.nextInt();
		System.out.print("Enter the second integer value:");
		int num2Int = input.nextInt();
		System.out.println("Sum of the values:" + (num1Int + num2Int));
		System.out.println("Difference of the values:" + (num1Int - num2Int));
		System.out.println("Product of the values:" +(num1Int * num2Int));
		System.out.println("Quotient of the values:" + (num1Int/num2Int));
		System.out.print("Enter the first double value:");
		double num1Double = input.nextDouble();
		System.out.print("Enter the second double value:");
		double num2Double = input.nextDouble();
		System.out.println("Sum of the values:" + (num1Double + num2Double));
		System.out.println("Difference of the values:" + (num1Double - num2Double));
		System.out.println("Product of the values:" + (num1Double*num2Double));
		System.out.println("Quotient of the values:" + (num1Double / num2Double));
		input.close();
	}

}
