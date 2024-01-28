package _2basicJavaPrograms;
import java.util.Scanner;

public class CheckEvenAndOdd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		
		if((num & 1) == 1){
			System.out.println("odd");
		}else {
			System.out.println("even");
		}
		
	}

}
