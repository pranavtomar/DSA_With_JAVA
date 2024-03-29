package combinatorpattern;

import java.time.LocalDate;
import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(
				"Alice",
				"alice@gmail.com",
				"+0898787879878",
				LocalDate.of(2000, 1, 1)
		);
		
//		CustomerValidatorService validatorService = new CustomerValidatorService();
//		validatorService.isValid(customer);
		
//		System.out.println(new CustomerValidatorService().isValid(customer));
		
//		Using combinator pattern
		ValidationResult result = isEmailValid()
			.and(isPhoneNumberValid())
			.and(isAnAdult())
			.apply(customer);
		
		System.out.println(result);
		
		if(result != ValidationResult.SUCCESS) {
			throw new IllegalStateException(result.name());
		}
		
	}

}
