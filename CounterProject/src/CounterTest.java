import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

	
	Counter counter; //declare Counter for testing
	
	@BeforeEach
	void setUp() throws Exception {
		this.counter = new Counter(); //initialize counter before every test method
	}

	@Test
	void testIncrement() {
		//first time
		assertTrue(this.counter.increment() == 1);
		//second time
		assertTrue(this.counter.increment() == 2);
		//third
		this.counter.increment();
		//calling increment a third time should not return a count of 2
		assertFalse(this.counter.getCount() == 2, "should not return 2 after calling increment a third time.");
		//expect 3 when calling getCount
		assertEquals(3, this.counter.getCount());
		// fourth time
		assertNotEquals(3, this.counter.increment());
	}

	@Test
	void testDecrement() {
		
		//calling decrement the first time should return -1
		assertEquals(-1, this.counter.decrement());
		
		assertTrue(this.counter.decrement() == -2);
		
		this.counter.decrement();
		
		assertFalse(this.counter.getCount() == -2, "not -2");
		
		assertTrue(this.counter.getCount() == -3);
		
		
	}

}
;