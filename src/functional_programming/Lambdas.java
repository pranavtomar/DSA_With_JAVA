package functional_programming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

	public static void main(String[] args) {
		
		Integer number = null;
		int counter = 0;
		
		Function<String, String> upperCaseName = name -> name.toUpperCase();
		Function<String, String> upperCaseName2 = String::toUpperCase;
		
		Function<String, String> upperCaseName3 = name -> {
			if(name.isBlank()) throw new IllegalArgumentException("");
			return name.toUpperCase();
		};
		
		
		String upperCasedName = upperCaseName.apply("Alex");
		System.out.println(upperCasedName);
		
		String upperCasedName2 = upperCaseName2.apply("Alok");
		System.out.println(upperCasedName2);
		
		String upperCasedName3 = upperCaseName3.apply("Arun");
		System.out.println(upperCasedName3);
		
		String upperCasedName4 = upperCaseName4.apply("Advik", 20);
		System.out.println(upperCasedName4);
	}
	
	static BiFunction<String, Integer, String> upperCaseName4 = (name, age) -> {
		if(name.isBlank()) throw new IllegalArgumentException("");
		System.out.println(age);
		return name.toUpperCase();
	};

	

}
