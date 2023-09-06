package flowOfProgram;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		
		float firstNumber = sc.nextFloat();
		float secondNumber = sc .nextFloat();
		
		float sumOfNumbers = firstNumber + secondNumber;
		
		System.out.println("Sum of Numbers is : "+sumOfNumbers);
	}

}
