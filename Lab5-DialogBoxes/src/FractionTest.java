import javax.swing.JOptionPane;
public class FractionTest {
public static void main(String[] args) {
		Fraction fraction = new Fraction();
		double num;
		fraction.setNumerator(Integer.parseInt(JOptionPane.showInputDialog(null, "PLEASE ENTER NUMERATOR", "NUMERATOR", JOptionPane.QUESTION_MESSAGE)));
		fraction.setDenominator(Integer.parseInt(JOptionPane.showInputDialog(null, "PLEASE ENTER DENOMINATOR", "DENOMINATOR", JOptionPane.QUESTION_MESSAGE)));
		JOptionPane.showMessageDialog(null, "THE CURRENT NUMERATOR IS: "+fraction.getNumerator()+"\nTHE CURRENT DENOMINATOR: "+fraction.getDenominator(), "FRACTION",
		JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "THE DECIMAL OF THE CURRENT FRACTION IS: "+fraction.getDecimal(), "DECIMAL", JOptionPane.INFORMATION_MESSAGE);
		num=fraction.add(Integer.parseInt(JOptionPane.showInputDialog(null, "PLEASE ENTER A NUMBER TO BE ADDED TO THE FRACTION: ", "ADD", JOptionPane.QUESTION_MESSAGE)));
		JOptionPane.showMessageDialog(null, "THE INCREASE VALUE IS CURRENTLY: "+(fraction.getDecimal()+num), "ADDED", JOptionPane.INFORMATION_MESSAGE);
		num=fraction.multiply(Integer.parseInt(JOptionPane.showInputDialog(null, "PLEASE ENTER A VALUE TO BE MULTIPLY BY THE CURRENT FRACTION: ", "MULTIPLY", JOptionPane.QUESTION_MESSAGE)));
		JOptionPane.showMessageDialog(null, "THE CURRENT MULTIPLIED VALUE IS: "+(fraction.getDecimal()*num), "MULTIPLIED", JOptionPane.INFORMATION_MESSAGE);
	}
}