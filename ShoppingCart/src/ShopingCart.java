import java.text.DecimalFormat;
import java.util.Scanner;
public class ShopingCart {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER NAME, QUANITY AND PRICE OF ITEM (WITHOUNT ANY SPECIAL)");
		ShoppignCartTester value = new ShoppignCartTester(scan.nextLine(),scan.nextInt(),scan.nextDouble());
		System.out.println("PRE-TAX TOTAL PRICE: $"+(value.getCost()));
		System.out.println("TAX RATE: 0.05");
		System.out.println("TOTAL PRICE: $"+((value.getCost()*0.05)+value.getCost()));
		
	}
}