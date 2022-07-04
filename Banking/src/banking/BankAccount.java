package banking;
/**
 * Represents a checking/savings bank account for a customer.
 * @author sean.s.ho
 *
 */
public class BankAccount {

	//instance vars
	
	/**
	 * Type of account (checking/savings)
	 */
	String accountType;
	
	/**
	 * Balance for bank account
	 */
	double balance;
	
	/**
	 * Customer for this account
	 */
	Customer customer;
	
	/**
	 * Fixed amount for quick withdrawals
	 */
	double fastCashAmount;
	//constructor
	/**
	 * Creates a bank account of given type for given customer.
	 * @param accountType
	 * @param customer
	 */
	public BankAccount(String accountType, Customer customer) {
		this.accountType = accountType;
		this.customer = customer;
		
		this.fastCashAmount = 60;
	}
	
	//methods
	
	/**
	 * Deposits the given amount
	 * @param amount to add to balance
	 */
	public void deposit(double amount) {
		if(amount > this.balance) {
			this.balance += amount;	
		}
	}
	
	/**
	 * Withdraw the given amount from balance.
	 * @param amount to withdraw
	 * @throws Exception if given amount is larger than available balance
	 */
	public void withdraw(double amount) throws Exception {
		if(amount > this.balance) {
			throw new Exception("Amount is greater than available balance.");
		}
		this.balance -= amount;
	}
	
	public void fastWithdraw() throws Exception {
		this.withdraw(this.fastCashAmount);
	}
	
	public void setFastCashAmount(double amount) {
		if(amount > 0) {
			this.fastCashAmount = amount;
		}
	}
	
	/**
	 * Returns account type and balance for this bank account.
	 * @return	string with all the info
	 */
	public String getAccountInfo() {
		return this.accountType+ ": " + this.balance;
	}
	
	/**
	 * Returns the customer name and address for this bank account.
	 * @return string with all the info
	 */
	public String getCustomerInfo() {
		return this.customer.getName() + " from " + this.customer.getAddress();
	}
	
}
