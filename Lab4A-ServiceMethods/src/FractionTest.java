import java.text.DecimalFormat;

public class FractionTest {
private double principal;
private double rate;
private double period_years;

	public FractionTest( double principalValue, double rateValue, double periodyearsvalue){
		setPrincipal(principalValue);
		setRate(rateValue);
		setPeriodYears(periodyearsvalue);
	} 
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		FractionTest simpleinterest1 = new FractionTest(10000,5,5);
		System.out.println("The simple inerest of  is "+df.format(simpleinterest1.getSimpleInterest()));
		System.out.println(df.format(simpleinterest1.getFutureValue()));
		System.out.println(df.format(simpleinterest1.getPresenValue(simpleinterest1.getFutureValue())));
	}
	public double getPrincipal(){
		return principal;
	}
	public double getRate(){
		return rate;
	}
	public double getperiodYears(){
		return period_years;
	}
	public void setPrincipal(double principalValue){
		principal=principalValue;
	}
	public void setRate(double rateValue){
		rate = rateValue/100;
	}
	public void setPeriodYears(double periodYears){
		period_years = periodYears;
	}
	public void setperiodMonths(double months){
		period_years=months/12;
	}
	public void setperiodDays(double days){
		period_years=days/365;
	}
	public double getSimpleInterest(){
		principal = principal*(1+(rate*period_years));
		return principal;
	}
 	public double getFutureValue(){
 		principal = principal*(1+(Math.pow(rate,period_years)));
 		return principal;
	}
	public double getPresenValue(double futureValue){
  
		principal = futureValue / (1+(rate*period_years));
		return principal;
  
	}
 
}