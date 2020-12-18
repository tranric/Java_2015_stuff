import java.text.DecimalFormat;
import java.util.Scanner;
public class ShoppingCartTester{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER NAME, QUANITY AND PRICE OF ITEM (WITHOUNT ANY SPECIAL)");
		ShoppingCart value = new ShoppingCart(scan.nextLine(),scan.nextInt(),scan.nextDouble());
		System.out.println("PRE-TAX TOTAL PRICE: $"+value.getPreTaxTotalPrice());
		System.out.println("TAX RATE: 0.05");
		System.out.println("TOTAL PRICE: $"+value.getTotalPrice());
		
	}
}