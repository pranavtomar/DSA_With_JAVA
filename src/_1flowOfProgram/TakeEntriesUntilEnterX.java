package _1flowOfProgram;

import java.util.Scanner;

public class TakeEntriesUntilEnterX {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int sum = 0;
		while(true) {
			String input = sc.next();
			if(input.equalsIgnoreCase("x")) {
				break;
			}
			try {
				int num = Integer.parseInt(input);
				sum += num;
				System.out.print("Enter a number:");
			}catch(NumberFormatException e) {
				System.out.println("Please enter x for sum and exit the program.");	
			}
		}
		System.out.println("Sum of given Number : "+sum);
	}

}
