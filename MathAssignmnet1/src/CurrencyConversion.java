//Nickolaus Lunz N01027509
import java.util.Scanner;
public class CurrencyConversion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CurCon conv = new CurCon();
		System.out.println("ENTER 1 FOR EURO, 2 FOR CANADIAN, 3 FOR BRITISH POUND, AND 4 FOR US. \nINPUT CURRENCY: ");
		conv.setCurIn(scan.nextInt());
		System.out.println("OUTPUT CURRENCY:");
		conv.setCurOut(scan.nextInt());
		System.out.println("ENTER THE AMOUNT");
		conv.setAmount(scan.nextDouble());
		System.out.println(String.format("%.2f",conv.getAmount()));
	}
}