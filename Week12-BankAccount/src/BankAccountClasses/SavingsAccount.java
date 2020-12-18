package BankAccountClasses;

import java.util.Scanner;

/* An account that earns interest at a specified rate.   
 * New fields and methods are added to those inherited   
 * from BankAccount.*/
public class SavingsAccount extends BankAccount {
	private static final double FRACTION_TO_PCT = 100;
	private double interestRate; // stored as a fraction (5% = 0.05)

	// Constructs a bank account with a zero balance and
	// given interest rate.
	// Interest rate argument is in percent.
	public SavingsAccount(double rate) {
		setInterestRate(rate);
	}

	// Constructs a savings account with a given
	// balance and interest rate
	public SavingsAccount(double initialBalance, double rate) {
		super(initialBalance);
		setInterestRate(rate);
	}

	// sets interest rate to value passed as argument.
	// argument is in percent
	public void setInterestRate(double rate) {
		interestRate = rate / FRACTION_TO_PCT;
	}
	
	//OVERLOADING - same name, different parameters
	//both versions can be used
	// sets interest rate to value entered.
	// argument is in percent
	public void setInterestRate(Scanner scanner) {
		double rate = scanner.nextDouble();
		interestRate = rate / FRACTION_TO_PCT;
	} 

	// gets interest rate, in percent.
	public double getInterestRate() {
		return interestRate * FRACTION_TO_PCT;
	}

	// Adds the earned interest to the account balance.
	public void addInterest() {
		double interest = getBalance() * interestRate;
		deposit(interest);
	}
	
	@Override
	public String toString() {		
		return super.toString() + "\nInterest Rate: " + getInterestRate();
	}

}
