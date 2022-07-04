package banking;

/**
 * Represents a customer of a bank.
 * @author sean.s.ho
 *
 */
public class Customer {

	/**
	 * Name of customer
	 */
	String name;
	
	/**
	 * Address of customer
	 */
	String address;
	
	//constructor
	
	/**
	 * Create a customer with a giver name.
	 * @param name of customer
	 */
	public Customer(String name) {
		//set instance var name to given name
		this.name = name;	
	}
	
	//methods
	/**
	 * set the address of customer to be given address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * return customer's name
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * return customer's address
	 * @return
	 */
	public String getAddress() {
		return this.address;
	}
}
