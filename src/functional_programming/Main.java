package functional_programming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		
		List<Person> people = List.of(
				new Person("Alex", Gender.MALE),
				new Person("Maria", Gender.FEMALE),
				new Person("Aisha", Gender.FEMALE),
				new Person("Alex", Gender.MALE),
				new Person("Alice", Gender.FEMALE)
		);
		
		
		System.out.println("Imperative approach:-");
		//Imperative approach	
		List<Person> females = new ArrayList<>();
		
		for(Person person : people) {
			if(Gender.FEMALE.equals(person.gender)) {
				females.add(person);
			}
		}
		
		for(Person female : females) {
			System.out.println(female);
		}
		
		
		System.out.println("Declarative approach:-");
		//Declarative approach
		List<Person> females2 = people.stream()
			.filter(person -> Gender.FEMALE.equals(person.gender))
			.collect(Collectors.toList());
		females2.forEach(System.out::println);
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
		MALE, FEMALE
	}

}
