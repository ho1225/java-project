package banking;

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank accounts
 * @author sean.s.ho
 *
 */
public class Bank {

	public static void main(String[] args) {
		
		//create new instance of Bank class
		Bank bank = new Bank();
		
		//calls the run method in the bank class
		bank.run();
	}
	
	/**
	 * Runs the program by initializing, bank accounts and customers.
	 */
	public void run() {
		System.out.println("Welcome to the Bank! What is your name?");
		
		//create scanner to get user input
		Scanner scanner = new Scanner(System.in);
		
		//get the next token (word), which is the customer's name
		String name = scanner.next();
		
		System.out.println("Hello " + name + "! We are creating checking and savings accounts for you.");
		
		//create customer with given name
		Customer customer = new Customer(name);
		
		//get address
		System.out.println("What is your address?");
		
		//get the next token (word), which is customer's address
		String address = scanner.next();
		
		//set the customer's address
		customer.setAddress(address);
		
		//create a checking account for customer
		BankAccount checkingAccount = new BankAccount("checking", customer);
		
		//create a saving account for customer
		BankAccount savingsAccount = new BankAccount("savings", customer);
		
		//gets and prints the customer info associated with the checking account
		System.out.println();
		System.out.println("Customer info: ");
		System.out.println(checkingAccount.getCustomerInfo());
		
		//get and prints the account info associated with the checking account
		System.out.println("Checking account:  ");
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println("Saving account:  ");
		System.out.println(savingsAccount.getAccountInfo());
		
		//deposits
		
		//into checking
		System.out.println(); //blank line
		System.out.println("Amount to deposit into checking account?");
		double amount = scanner.nextDouble();
		checkingAccount.deposit(amount);
		
		//into savings
		System.out.println(); //blank line
		System.out.println("Amount to deposit into savings account?");
		amount = scanner.nextDouble();
		savingsAccount.deposit(amount);
		
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		//withdraw
		
		//from checking
		System.out.println(); //blank line
		System.out.println("Amount to withdraw from checking account?");
		amount = scanner.nextDouble();
		try {
			checkingAccount.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	
		//from savings
		System.out.println(); //blank line
		System.out.println("Amount to withdraw from savings account?");
		amount = scanner.nextDouble();
		try {
			savingsAccount.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		scanner.close();
	}

}
