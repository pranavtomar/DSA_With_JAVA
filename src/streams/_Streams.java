package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class _Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = List.of(
				new Person("Alex", Gender.MALE),
				new Person("Maria", Gender.FEMALE),
				new Person("Aisha", Gender.FEMALE),
				new Person("Alex", Gender.MALE),
				new Person("Alice", Gender.PREFER_NOT_TO_SAY),
				new Person("Bob", Gender.PREFER_NOT_TO_SAY)
		);
		
//		Function<Person, String> personStringFunction = person -> person.name;
//		ToIntFunction<String> length = String::length;
//		IntConsumer println = System.out::println;
//		
//		people.stream()
//		.map(personStringFunction)
//		.mapToInt(length)
//		.forEach(println);
//		
//		Set<Gender> genders = people.stream()
//			.map(person -> person.gender)
//			.collect(Collectors.toSet());
//		
//		System.out.println(genders);
		
		
		Predicate<Person> personPredicate = person -> Gender.PREFER_NOT_TO_SAY.equals(person.gender);
		
		boolean containsOnlyFemales = people.stream()
			.noneMatch(personPredicate);
		boolean containsOnlyFemales2 = people.stream()
				.allMatch(personPredicate);
		boolean containsOnlyFemales3 = people.stream()
				.anyMatch(personPredicate);
		
		System.out.println(containsOnlyFemales);
		System.out.println(containsOnlyFemales2);
		System.out.println(containsOnlyFemales3);
		
	}
	
	static class Person{	//Subclass of Main class
		
		private final String name; //Instance variable
		private final Gender gender; //Instance variable
		
		Person(String name, Gender gender){	//constructor
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}
		
	}
	
	enum Gender{
		MALE, FEMALE, PREFER_NOT_TO_SAY
	}

}
