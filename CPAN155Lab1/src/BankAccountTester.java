public class BankAccountTester {
	public BankAccountTester(){
		SavingsAccount savings = new SavingsAccount(50,0.4);
		ChequingAccount chq = new ChequingAccount(50);
		savings.addInterest();
	    System.out.println(savings.toString());
	    System.out.println(chq.toString());
	    chq.deposit(100);
	    chq.withdraw(20);
	    chq.withdraw(75);
	    chq.withdraw(10);
	    System.out.println(chq.toString());
	    chq.deductFees();
	    System.out.println(chq.toString());
	}
	public static void main(String[] args) {
	new BankAccountTester();
	}
}