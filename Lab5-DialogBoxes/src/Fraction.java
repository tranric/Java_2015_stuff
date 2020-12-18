public class Fraction {
private double numerator, denominator;

	public Fraction() {
		numerator=1;
		denominator=1;
	}
	public Fraction(double numerator, double denominator) {
		numerator=1;
		denominator=1;
	}
	public double getNumerator() {
		return numerator;
	}
	public void setNumerator(double newNum) {
		if (newNum>=1) {
			numerator=newNum;
		}
	}
	public double getDenominator() {
		return denominator;
	}
	public void setDenominator(double newDen) {
		if (newDen>=1) {
			denominator=newDen;
		}
	}
	public double getDecimal() {
		return numerator/denominator;
	}
	public double add(double numberToAdd) {
		return numberToAdd;
	}
	public double multiply(double numberToMultiply) {
		return numberToMultiply;
	}
}
