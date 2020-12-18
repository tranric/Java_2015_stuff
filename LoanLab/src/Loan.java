public class Loan {
	private double loanAmount;
	private double rate;
	private double monthlyInstallment;
	private double intPaid;
	private double loanPaid;
	private double totalPaid;
	private double totalRate;
	private double totalLoan;

	public Loan(double loanAmountValue, double rateValue, double monthlyInstallmentValue){
		loanAmount=loanAmountValue;
		rate=rateValue;
		monthlyInstallment=monthlyInstallmentValue;
	}
	public double getLoanAmount(){
		return loanAmount;
	}
	public double getRate(){
		return rate/100;
	}
	public double getMonthlyInstallment(){
		if (monthlyInstallment>loanAmount) {
			rate=(getLoanAmount()*(getRate()/12));	
			monthlyInstallment=(loanAmount)+rate;
		}
		return monthlyInstallment;
	}
	public void setLoanAmount(double loanAmountValue){
		loanAmountValue=loanAmount;
	}
	public void setRate(double rateValue){
		rate=rateValue/100;
	}
	public void setMonthlyInstallment(double monthlyInstallmentValue){
		monthlyInstallment=monthlyInstallmentValue;
	}
	public void printLoanRepaymentSchedule(){
		System.out.println(
				"|PAYMENT NUMBER|BALANCE BEFORE PAYMENT|AMMOUNT PAID|INTREST PAID|PRINCIPLE REPAID|BALANCE AFTER PAYMENT|\n"
			  + "|--------------|----------------------|------------|------------|----------------|---------------------|"
			);
		for(int i=1; getLoanAmount()>0; i++){
			intPaid=(getLoanAmount()*(getRate()/12));
			loanPaid=getMonthlyInstallment()-intPaid;

			System.out.print("|  "+i+"           ");
			if (i==1){
				System.out.print("|  "+String.format("%2.2f",getLoanAmount())+"             ");
			}else{
				System.out.print("|  "+String.format("%2.2f",getLoanAmount())+"             ");
			}
			loanAmount=loanAmount-loanPaid;
			totalPaid+=monthlyInstallment;
			totalRate+=intPaid;
			totalLoan+=loanPaid;
			if (intPaid<1){intPaid+=1;}
			System.out.print("|  "+String.format("%2.2f",getMonthlyInstallment())+"    ");
			System.out.print("|  "+String.format("%2.2f",intPaid)+"    ");
			System.out.print("|  "+String.format("%2.2f",loanPaid)+"        ");
			if (getLoanAmount()<0){loanAmount=0;}
			System.out.println("|  "+String.format("%2.2f",getLoanAmount())+"            |");
			
		}
		
		System.out.print("\nTOTLAS                                   "+String.format("%2.2f",totalPaid));
		System.out.print("   |  "+String.format("%2.2f",totalRate));
		System.out.print("     | "+String.format("%2.2f",totalLoan));
	}

}