import java.util.ArrayList;

public class Customer {

	//static variables
	//share across all instances of Customer
	
	static final String COMPANY = "CVS";
	
	static ArrayList<Customer> CUSTOMERS = new ArrayList<Customer>();
	
	static Counter COUNTER;
	
	String name;
	
	String geography;
	
	int ID;
	
	//constructor
	
	public Customer(String name, String geography) {
		this.name = name;
		this.geography = geography;
		
		//get unique ID from counter
		this.ID = Customer.COUNTER.getCount();
		
		Customer.COUNTER.increment();
		
		//adds this customer to list of all customers
		Customer.CUSTOMERS.add(this);
	}
	
	//methods
	
	public static void printAllCustomers() {
		System.out.println("All customers: ");
		
		for (Customer c : Customer.CUSTOMERS) {
			System.out.println(c);
		}
	}
	
	public boolean equals(Object obj) {
		
		//cast object to customer
		Customer otherCustomer = (Customer) obj;
		
		if((this.name.equals(otherCustomer.name) && this.geography.equals(otherCustomer.geography))){
			return true;
		}
		return false;
	}
	
	public String toString() {
		return this.ID + ": " + this.name + ", Company: " + Customer.COMPANY + ", Location: " + this.geography;
	}
	
	public static int findCustomer(Customer customer) {
		
		//set default index
		int index = -1;
		
		//iterate over customer list and locate given customer
		for (int i = 0; i < Customer.CUSTOMERS.size(); i++) {
			if (Customer.CUSTOMERS.get(i).equals(customer)) { //will call equals method in customer class
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	public static void removeCustomer(Customer customer) {
		
		//find the customer
		int removeIndex = Customer.findCustomer(customer);
		
		if(removeIndex >= 0) {
			Customer.CUSTOMERS.remove(removeIndex);
		}
	}
	
	
	public static void main(String[] args) {
		
		Customer.COUNTER = new Counter(1);
		
		//create customer
		Customer c1 = new Customer("chenyun", "Los Angeles");
		
		//print all customers
		Customer.printAllCustomers();
		
		//create customer
		Customer c2 = new Customer("huize", "NYC");
		
		Customer.printAllCustomers();

		//create customer
		Customer c3 = new Customer("jeffrey", "Australia");
		
		Customer.printAllCustomers();
		
		//remove customer
		Customer.removeCustomer(c1);
		
		Customer.printAllCustomers();
	}

}
