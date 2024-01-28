package _1flowOfProgram;

import java.util.Scanner;

public class TableOfNumbers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = in.nextInt();
		for(int i = 1; i < 11; i++) {
			System.out.println(num + "*" + i + "=" + (num*i));
		}
		
	}

}
