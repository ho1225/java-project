
public class Person {

	//instance variable
	
	String name;
	
	int age;
	
	/**
	 * create a person
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object something) {
		
		//cast given object to Person
		Person otherPerson = (Person) something;
		
		//return true if names of two people are the same
		return this.name.equals(otherPerson.name);
	}
}
