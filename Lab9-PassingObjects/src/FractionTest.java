import javax.swing.JOptionPane;
public class FractionTest {
public static void main(String[] args) {
	double newdenominator, numerator1, numerator2;
	Fraction Fraction1 = new Fraction();
	Fraction Fraction2 = new Fraction();
	Fraction1.inputNumerator();
	Fraction1.inputDenominator();
	Fraction2.inputNumerator();
	Fraction2.inputDenominator();
	Fraction1.getNumerator();
	newdenominator=Fraction1.getDenominator()*Fraction2.getDenominator();
	numerator1=(Fraction1.getNumerator()*Fraction2.getDenominator())+(Fraction2.getNumerator() * Fraction1.getDenominator());
	numerator2=Fraction1.getNumerator()*Fraction2.getNumerator();
	JOptionPane.showMessageDialog(null,"THE CURRENT INCREASE DECIMAL IS: "+numerator1+" / "+newdenominator+"\nTHE INCREASED DECIMAL IS: "+(numerator1/newdenominator));
	JOptionPane.showMessageDialog(null,"THE CURRENT MULTIPLIED DECIMAL IS: "+numerator2+" / "+newdenominator+"\nTHE MULTIPLIED DECIMAL IS: "+(numerator2/newdenominator));
	}
}
