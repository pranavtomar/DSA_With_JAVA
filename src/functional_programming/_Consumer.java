package functional_programming;

import java.util.function.Consumer;
import java.util.function.BiConsumer;

public class _Consumer {

	public static void main(String[] args) {
		//Normal Java Function Call
		Customer maria = new Customer("Maria", "99999");
		greetCustomer(maria);
		// or
		greetCustomer(new Customer("Maria", "99999"));
		
		//Normal Java BiConsumer Function Call
		greetCustomerV2(maria, false);

		
		// Consumer Functional interface
		greetCustomerConsumer.accept(maria);
		// BiConsumer Functional interface
		greetCustomerConsumerV2.accept(maria, false);
		
	}
	
	//BiConsumer Function
	static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) -> 
	System.out.println("Hello " + customer.customerName + 
			", thanks for registering phone number: " 
			+ (showPhoneNumber ? customer.customerPhoneNumber : "*****"));
	
	//Normal BiConsumer Function
	static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
		System.out.println("Hello " + customer.customerName + 
				", thanks for registering phone number: " 
				+ (showPhoneNumber ? customer.customerPhoneNumber : "*****"));
	}
	
	//Consumer Function
	static Consumer<Customer> greetCustomerConsumer = customer -> 
		System.out.println("Hello " + customer.customerName + 
				", thanks for registering phone number: " + 
				customer.customerPhoneNumber);
	
	//Normal Function
	static void greetCustomer(Customer customer) {
		System.out.println("Hello " + customer.customerName + 
				", thanks for registering phone number: " + 
				customer.customerPhoneNumber);
	}
	
	static class Customer{
		private final String customerName;
		private final String customerPhoneNumber;
		
		Customer(String customerName, String customerPhoneNumber){
			this.customerName = customerName;
			this.customerPhoneNumber = customerPhoneNumber;
		}
		
	}

}
