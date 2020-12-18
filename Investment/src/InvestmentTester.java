public class InvestmentTester{
	public static void main(String[] args) {
		double ammount=1000.00;
		double intrest=0.045;
		int time = 5;
		Investment invest = new Investment(ammount, intrest, time);
		System.out.println("THE PRINCIPAL VALUE IS: "+invest.getPrincipal()+"\nTHE ANNUAL INTREST RATE IS: "+(invest.getRate()*100)+"%\nTHE TERM IS FOR "+invest.getTerm()+" YEARS\n");
		System.out.println("YEARS VALUE OF INVESTMENT\n-----|-------------------");
		for(int years=0; years<=invest.getTerm(); years++){
			if (years!=0){
				invest.loan();
			}
			System.out.println(" "+years+"   |  "+invest.getPrincipal());
		}
	}
}