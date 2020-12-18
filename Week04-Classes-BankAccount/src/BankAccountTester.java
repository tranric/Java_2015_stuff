
public class BankAccountTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare reference variables to refer to BankAccount objects
		BankAccount account1;
		BankAccount account2;

		/*
		 * Create circle objects by calling the constructor, and assign the
		 * resulting objects to variables, so that we can refer to them later in
		 * our program.
		 */
		account1 = new BankAccount(10000.0);
		account2 = new BankAccount(500.0);

		// Call (invoke) methods to print information about the accounts.
		// Calling a method is also referred to as sending a message to an
		// object.
		System.out.println("account1 has balance " + account1.getBalance());				
		System.out.println("account2 has balance " + account2.getBalance());

		// Call (invoke) method to change the balance of both accounts.
		account1.deposit(1000.0);
		account2.withdraw(100.0);

		// Again call (invoke) methods to print information about the
		// accounts. Note that balances are different this time.
		System.out.println("account1 has balance " + account1.getBalance());				
		System.out.println("account2 has balance " + account2.getBalance());
	}

}
