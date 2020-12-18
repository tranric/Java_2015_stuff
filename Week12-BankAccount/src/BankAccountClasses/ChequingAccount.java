package BankAccountClasses;

/*
A chequing account that charges transaction fees.
The deposit and withdraw methods inherited from
BankAccount are overridden
*/
public class ChequingAccount extends BankAccount{
	private static final int FREE_TRANSACTIONS = 3;
	private static final double TRANSACTION_FEE = 0.50;

	private int transactionCount;

	// Constructs a checking account with a given balance
	public ChequingAccount(double initialBalance) {
		// construct superclass
		super(initialBalance);
		// initialize transaction count
		transactionCount = 0;
	}

	//OVERRIDING - same name and same parameters
	//used instead of superclass method for 
	//chequing account objects
	@Override
	public void deposit(double amount) {
		transactionCount++;
		// now add amount to balance
		super.deposit(amount);
	}

	@Override
	public void withdraw(double amount) {
		transactionCount++;
		// now subtract amount from balance
		super.withdraw(amount);
		getBalance();
	}

	// Deducts the accumulated fees and resets
	// the transaction count.
	public void deductFees() {
		if (transactionCount > FREE_TRANSACTIONS) {
			double fee = TRANSACTION_FEE
					* (transactionCount - FREE_TRANSACTIONS);
			super.withdraw(fee);
		}
		transactionCount = 0;
	}
	
	@Override
	public String toString() {		
		return super.toString() + "\nTransaction Count: " + transactionCount;
	}
}
