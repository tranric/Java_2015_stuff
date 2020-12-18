public class LoanTester {
	public static void main(String[] args) {
		Loan loan = new Loan(1600, 9, 300);
		loan.printLoanRepaymentSchedule();
	}
}