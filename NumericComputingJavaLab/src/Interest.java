public class Interest {
	private double principal;
	private double rate;
	private double period;
	
	public Interest(double principal, double rate, double period){
		setPrincipal(principal);
		setRate(rate);
		setPeriodYears(period);
	}
	public void setPrincipal(double principalValue){
		principal=principalValue;
	}
	public void setRate(double rateValue){
		rate=rateValue/100;
	}
	public void setPeriodYears(double periodYears){
		period=periodYears;
	}
	public void setPeriodMonths(double months){
		period=months/12;
	}
	public void setperiodDays(double days){
		period=days/365;
	}
	public double getSimpleInterest(){
		principal = principal*(1+(rate*period));
		return principal;
	}
	public double getFutureValue(){
 		principal = principal*(1+(Math.pow(rate,period)));
 		return principal;
	}
	public double getPresenValue( double futureValue){
		principal=futureValue/(1+(rate*period));
		return principal;
	}
}