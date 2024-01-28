package functional_programming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
	
	public static void main(String[] args) {
		
		//Normal or Regular Function call
		int increment = increment(1);
		System.out.println(increment);
		
		//Functional Style call
		int increment2 = incrementByOneFunction.apply(1);
		System.out.println(increment2);
		int multiply = multiplyBy10Function.apply(increment2);
		System.out.println(multiply);
		
		//Two Function call simultaneously
		Function<Integer,Integer> addBy1AndThenMultiplyBy10 = 
				incrementByOneFunction.andThen(multiplyBy10Function);
		System.out.println(addBy1AndThenMultiplyBy10.apply(1));
		
		
		//BiFunction takes 2 argument and produce 1 result
		//Normal Function
		System.out.println(incrementByOneAndMultiply(4, 100));
		//BiFunction
		System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
		
		 
	}
	
	//Normal or Regular Function
	static int increment(int number) {
		return number + 1;
	}
	
	//Functional Style
	static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
	static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;
	
	
	//BiFunction :-
	//Functional Style
	static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
			(numberToIncrementByOne, numberToMultiplyBy) 
				-> (numberToIncrementByOne + 1) * numberToMultiplyBy;
				
	//Normal or Regular Function
	static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
		return (number + 1) * numToMultiplyBy;
	}
		
}


