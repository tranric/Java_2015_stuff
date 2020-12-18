package ca.humber.database;
public class record {
	private int Balance, AccountNumber;	
        private String HoldsOnAccount;
	public record(){
                setBalance(0);
		setAccountNumber(0);
		setHoldsOnAccount("");
	}
	public record(int balance, int accountNumber, String holdsOnAccount){
                setBalance(Balance);
		setAccountNumber(accountNumber);
		setHoldsOnAccount(holdsOnAccount);
	}
	public String getHoldsOnAccount() {
		return HoldsOnAccount;
	}
	public void setHoldsOnAccount(String holdsOnAccount) {
		this.HoldsOnAccount = holdsOnAccount;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		this.Balance = balance;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.AccountNumber = accountNumber;
	}
}