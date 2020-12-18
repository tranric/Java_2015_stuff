package BankAccountClasses;

public class BankAccount {
	//static interestRate removed in this version
	
	private double  balance;
	private static int howManyObjects;

	// constructor
	public BankAccount(double newBalance) {
		setBalance(newBalance);
		howManyObjects++;
	}

	// overloaded constructor
	public BankAccount() {
		setBalance(0.0);
		howManyObjects++;
	}

	public static int getNumOfObjects() {
		return howManyObjects;
	}

	// methods
	// getter (accessor)
	public double getBalance() {
		return balance;
	}

	// setter (mutator)
	public void setBalance(double balance) {
		// make sure balance is not negative
		if (balance >= 0) {
			this.balance = balance;
		}
	}

	// service methods
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	// Transfers amount out of this account into other account.
	public BankAccount transfer(BankAccount other, double amount) {
		other.deposit(amount);
		// other.balance += amount;
		this.withdraw(amount);
		// balance -= amount;
		return new BankAccount(balance);
	}

	//override Object's class toString()
	public String toString() {
		return "Balance in account: " + String.format("%.2f", balance);
	}
}
