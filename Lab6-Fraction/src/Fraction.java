import javax.swing.JOptionPane;
public class Fraction {
	private double numerator, denominator;
	public Fraction() {
		setNumerator(1);
		setDenominator(1);
	}
	public double getNumerator() {
		return numerator;
	}
	public void setNumerator(double newNum) {
		numerator = newNum;
	}
	public void inputNumerator(){
		String newnum = JOptionPane.showInputDialog("PLEASE ENTER A NUMERATOR");
		setNumerator(Double.parseDouble(newnum));
		JOptionPane.showMessageDialog(null, "THE CURRENT NUMERATOR IS: " + getNumerator());	
	}
	public void inputDenominator(){
		String newden = JOptionPane.showInputDialog("LEASE ENTER A DENOMINATOR");
		setDenominator(Double.parseDouble(newden));
		if (Double.parseDouble(newden) <= 0) {
			newden = JOptionPane.showInputDialog(null,"THE VALUE EANTERED "+Double.parseDouble(newden)+" ISN'T USABLE. PLEASE ENTER ANOTHER VALUE.");
			setDenominator(Double.parseDouble(newden));	
		}	
		JOptionPane.showMessageDialog(null,"THE CURRENT DENOMINATOR IS: " + getDenominator());
		JOptionPane.showMessageDialog(null,"THE DECIMAL VERSON OF THE DENOMINATOR IS: "+ String.format("%.2f", getDecimal()));
	}
	public double getDenominator() {
		return denominator;
	}
	public void setDenominator(double newDen) {
		denominator=newDen;
	}
	public double getDecimal() {
		return numerator/denominator;
	}
	public double add(double numberToAdd) {
		return numberToAdd+getDecimal();
	}
	public double multiply(double numberToMultiply) {
		return numberToMultiply*(numerator/denominator);
	}
}