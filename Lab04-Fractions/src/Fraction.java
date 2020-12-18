public class Fraction {
	//These are the values and what not
	private double numerator;
	private double denominator;
	
	public Fraction(double newNumerator, double newDenominator){
		numerator=newNumerator;
		denominator=newDenominator;
	}
	
	public double getNumerator(){
		return numerator;
	}
	public void setNumerator(double newNumerator){
		this.numerator = numerator;
	}
	public double getDenominator(){
		return denominator;
	}
	public void setDenominator(double newDenominator){
		this.denominator=denominator;
	}
}