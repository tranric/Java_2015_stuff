import javax.swing.JOptionPane;
public class FractionTest {
public static void main(String[] args) {
	Fraction Fraction1 = new Fraction();
	Fraction1.inputNumerator();
	Fraction1.inputDenominator();
	String numberToadd = JOptionPane.showInputDialog("Please enter a number to add to your fraction:");
	JOptionPane.showMessageDialog(null,"The increased value is: "+String.format("%.2f",
	Fraction1.add(Double.parseDouble(numberToadd))));
	String muLtiply = JOptionPane.showInputDialog("Please enter a number to multiply to your fraction: ");
	JOptionPane.showMessageDialog(null,"The multiplied value is: "+String.format("%.2f",
	Fraction1.multiply(Double.parseDouble(muLtiply))));
	System.exit(0);
	}
}