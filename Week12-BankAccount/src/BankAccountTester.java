import BankAccountClasses.*;
public class BankAccountTester {

	public BankAccountTester(){
		//BankAccount myAccount = new BankAccount(4000);
		SavingsAccount savings = new SavingsAccount(5000 , 0.02);
		ChequingAccount chq = new ChequingAccount(400);
		savings.addInterest();
        System.out.println(savings.toString());
        System.out.println(chq.toString());
        chq.deposit(100);
        chq.withdraw(50);
        chq.withdraw(100);
        chq.withdraw(50);
        System.out.println(chq.toString());
        chq.deductFees();
        System.out.println(chq.toString());
	}
	public static void main(String[] args) {
		new BankAccountTester();

	}

}
