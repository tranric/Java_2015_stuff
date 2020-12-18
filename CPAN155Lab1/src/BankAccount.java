public class BankAccount {
	private double  balance;
	private static int numberOfObjects;

	public BankAccount(double newBalance) {
		setBalance(newBalance);
		numberOfObjects++;
	}

	public BankAccount() {
		setBalance(0.0);
		numberOfObjects++;
	}

	public static int getNumOfObjects() {
		return numberOfObjects;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		}
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public BankAccount transfer(BankAccount other, double amount) {
		other.deposit(amount);
		this.withdraw(amount);
		return new BankAccount(balance);
	}

	public String toString() {
		return "CURRENT BALANCE OF THE ACCOUNT: " + String.format("%.2f", balance);
	}
}