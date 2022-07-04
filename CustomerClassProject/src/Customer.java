
public class Customer {
	
	
	String name;
	
	//constructor
	
	public Customer(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
	
	public static void main(String[] args) {
		Customer c = new Customer("Brandon");
		System.out.println("c = " + c);
	}
}
