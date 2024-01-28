package _1flowOfProgram;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Year:");
		int year = sc.nextInt();
		
		if((year % 400 == 0 || year % 100 != 0) && (year % 4 == 0)) {
			System.out.println(year +" is Leap year");
		}else {
			System.out.println(year +" is not Leap year");
		}

	}

}
