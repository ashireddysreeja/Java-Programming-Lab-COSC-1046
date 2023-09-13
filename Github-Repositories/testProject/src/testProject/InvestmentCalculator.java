package testProject;
import java.util.Scanner;

public class InvestmentCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please eneter the investment amount:");
		double investmentAmount = input.nextDouble();
		System.out.print("please enter the monthly interest rate;");
		double monthlyInterestRate = input.nextDouble();
		System.out.print("please eneter the number of years:");
		int numberOfYears = input.nextInt();
		double futureValue = investmentAmount*Math.pow(1+monthlyInterestRate,numberOfYears);
		System.out.printf("The future value of the investment is: $%.2f%n",futureValue);
		input.close();
	
		    

	}

}
