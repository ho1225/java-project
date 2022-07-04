package banking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	//declare object
	Customer customer;
	BankAccount myCheckingAccount;
	BankAccount mySavingAccount;
	@BeforeEach
	void setUp() throws Exception {
		this.customer = new Customer("Brandon");
		this.myCheckingAccount = new BankAccount("checking", this.customer);
		this.mySavingAccount = new BankAccount("saving", this.customer);
	}

	@Test
	void testDeposit() {
		
		this.myCheckingAccount.deposit(100);
		
		assertEquals(100, this.myCheckingAccount.balance);
		
		this.myCheckingAccount.deposit(-100);
		assertEquals(100, this.myCheckingAccount.balance);
		
		this.myCheckingAccount.deposit(0);
		assertEquals(100, this.myCheckingAccount.balance);
	}

	@Test
	void testWithdraw() {
		this.mySavingAccount.deposit(100);
		assertEquals(100, this.mySavingAccount.balance);
		
		try {
			this.mySavingAccount.withdraw(80);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(20, this.mySavingAccount.balance);
		
		assertThrows(Exception.class, () -> {
			this.mySavingAccount.withdraw(21);
		});
		
		assertEquals(20, this.mySavingAccount.balance);
		
		assertDoesNotThrow(() -> {
			this.mySavingAccount.withdraw(19);
		});
		
		assertEquals(1, this.mySavingAccount.balance);
	}

	@Test
	void testFastWithdraw() {
		this.myCheckingAccount.deposit(100);
		
		try {
			this.myCheckingAccount.fastWithdraw();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(40, this.myCheckingAccount.balance);
		
		//reset the fast cash amount
		
		this.myCheckingAccount.setFastCashAmount(20);
		
	}

}
