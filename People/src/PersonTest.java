import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testPerson() {
		Person person1 = new Person("Ted", 22);
		Person person2 = new Person("ted", 22);
		
		assertEquals(person1.age, person2.age);
		
		assertNotEquals(person1, person2);
		
		Person person3 = new Person("Ted", 34);
		assertEquals(person1, person3);
		
		String test = null;
		assertThrows(NullPointerException.class, () -> {
		test.length();
		});
	}

}
