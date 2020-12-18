import java.util.Scanner;
public class FractionTest {
	public static void main(String[] args) {
		System.out.println("PLEASE ENTER A NUMERATOR, FOLLOWED BY A DENOMINATOR AFTER ENTER KEY HAS BEEN PRESSED: ");
		Scanner scan = new Scanner(System.in);
		Fraction fraction = new Fraction(scan.nextDouble(),scan.nextDouble());
		System.out.println("THE NUMERATOR VALUE IS CURRENTLY: "+fraction.getNumerator());
		System.out.println("THE DENOMINATOR VALUE IS CURRENTLY: "+fraction.getDenominator());
	}
}