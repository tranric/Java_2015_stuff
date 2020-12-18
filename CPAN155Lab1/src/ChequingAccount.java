public class ChequingAccount extends BankAccount{
	private static final int freeTrans = 4;
	private static final double transCost = 0.2;
	private int transCount;
	public ChequingAccount(double initialBalance) {
		super(initialBalance);
		transCount = 1;
		}
		@Override
		public void deposit(double amount) {
			transCount++;
			super.deposit(amount);
		}
		@Override
		public void withdraw(double amount) {
			transCount++;
			super.withdraw(amount);
			getBalance();
		}
		
		public void deductFees() {
			if (transCount > freeTrans) {
				double fee = transCost * (transCount - freeTrans);
				super.withdraw(fee);
			}
			transCount = 0;
		}
		
		@Override
		public String toString() {		
			return super.toString() + "\nTRANSACTION COUNT: " + transCount;
		}
}