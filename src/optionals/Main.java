package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		Object value = Optional.ofNullable("Hello")
			.orElseGet(() -> "default value");
		
		Object value2 = Optional.ofNullable("Hello")
				.orElseThrow(() -> new IllegalStateException("exception"));
		
		Supplier<IllegalStateException> exception = ()
				-> new IllegalStateException("exception");
		Object value3 = Optional.ofNullable("Hello")
				.orElseThrow(exception);
		
		System.out.println(value);
		System.out.println(value2);
		System.out.println(value3);
		
		Optional.ofNullable("john@gmail.com")
				.ifPresent(System.out::println);
		
		Optional.ofNullable("john@gmail.com")
			.ifPresent(email -> System.out.println("Sending email to " + email));
		
		Optional.ofNullable(null)
			.ifPresentOrElse(
					email -> System.out.println("Sending email to " + email),
					() -> System.out.println("Cannot send email"));
		
		
	}

}
