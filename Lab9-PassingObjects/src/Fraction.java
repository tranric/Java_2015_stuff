import javax.swing.JOptionPane;
public class Fraction {
	private double numerator, denominator;
	public Fraction() {
		setNumerator(0);
		setDenominator(0);
	}
	public double getNumerator(){
		return numerator;
	}
	public void setNumerator(double newNum){
		numerator=newNum;
	}
	public void inputNumerator(){
		String newNum=JOptionPane.showInputDialog("PLEASE ENTER A NUMERATOR");
		setNumerator(Double.parseDouble(newNum));
	}
	public void inputDenominator(){
		String newDen=JOptionPane.showInputDialog("PLEASE ENTER A DENOMINATOR");
		 while (Double.parseDouble(newDen)<=0){
			newDen = JOptionPane.showInputDialog(null,"PLEASE ENTER A DENOMINATOR ABOVE THE VALUE ZERO");
		}
		setDenominator(Double.parseDouble(newDen));		
	} 
	public double getDenominator(){
		return denominator;
	}
	public void setDenominator(double newDen){
		denominator=newDen;
	}
	public double getDecimal(){
		return numerator/denominator;
	}
	public double add(double numberToAdd){
		return numberToAdd+(numerator/denominator);
	}
	public double multiply(double numberToMultiply){
		return numberToMultiply*(numerator/denominator);
	}
}