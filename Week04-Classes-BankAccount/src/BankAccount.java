
public class BankAccount {
    // field (aka instance field , instance variable,
    // attribute or property)
	private double balance;

	//constructor
	public BankAccount(double newBalance) {
		balance = newBalance;
	}
	//overloaded constructor
	public BankAccount() {
		balance = 0.0;
	}
    //methods
    // getter (accessor)
	public double getBalance() {
		return balance;
	}
    // setter (mutator)
	public void setBalance(double balance) {
		this.balance = balance;
	}
    //service methods
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}
}
