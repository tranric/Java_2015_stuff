import java.util.Scanner;
	public class SavingsAccount extends BankAccount {
		private static final double fraction = 100;
		private double interestRate;

		public SavingsAccount(double rate) {
			setInterestRate(rate);
		}

		public SavingsAccount(double initialBalance, double rate) {
			super(initialBalance);
			setInterestRate(rate);
		}

		public void setInterestRate(double rate) {
			interestRate = rate / fraction;
		}
		
		public void setInterestRate(Scanner scanner) {
			double rate = scanner.nextDouble();
			interestRate = rate / fraction;
		} 

		public double getInterestRate() {
			return interestRate * fraction;
		}

		public void addInterest() {
			double interest = getBalance() * interestRate;
			deposit(interest);
		}
		
		@Override
		public String toString() {		
			return super.toString() + "\nINTREST RATER: " + getInterestRate();
		}
	}