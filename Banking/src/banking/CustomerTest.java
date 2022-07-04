package banking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {
	//declare customer for testing
	Customer customer;
	

	@BeforeEach
	void setUp() throws Exception {
		//initialize customer here
		this.customer = new Customer("Brandon");
	}

	@Test
	void testSetAddress() {
		
		//confirm the initial value of address is null
		assertNull(this.customer.getAddress());
		
		//set address for customer
		this.customer.setAddress("Brooklyn, NY");
		
		
		assertEquals("Brooklyn, NY", this.customer.getAddress());
		
		//reset
		this.customer.setAddress("Cranston, RI");
		
		assertEquals("Cranston, RI", this.customer.getAddress());
		
		
	}

}
