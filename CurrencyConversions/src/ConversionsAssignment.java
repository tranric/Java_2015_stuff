import java.util.Scanner;
import java.text.*;

public class ConversionsAssignment {
	public static void main(String[] args){
		float valuerate_euros = 0;
		float valuerate_dollars = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("WHEN ENTERING VALUES, PLEASE REFRAIN FROM USING CHARACTERS SUCH AS !@#$%.");
		System.out.println("");
		System.out.print("ENTER EURO AMMOUNT HERE: ");
		valuerate_euros = scan.nextFloat();
		System.out.println("");
		System.out.println("The value €" + valuerate_euros + ", is euqal to    $"  + Math.round((valuerate_euros * 1.3351)* 100.0)/100.0 + " US Dollars");
		System.out.println("The value €" + valuerate_euros + ", is euqal to    $"  + Math.round((valuerate_euros * 1.37087997)* 100.0)/100.0 + " Canadian Dollars");	
		System.out.println("The value €" + valuerate_euros + ", is euqal to    £"  + Math.round((valuerate_euros * 0.89513912)* 100.0)/100.0 + " British Pounds");
		System.out.println("");
		System.out.print("ENTER AMERICAN DOLLAR AMMOUNT HERE: ");
		valuerate_dollars = scan.nextFloat();
		System.out.println("");
		System.out.println("The value $" + valuerate_dollars + ", is euqal to    £"  + Math.round((valuerate_dollars / 1.4915)* 100.0)/100.0 + " British Pounds");
		System.out.println("The value $" + valuerate_dollars + ", is euqal to    €"  + Math.round((valuerate_dollars / 1.3351)* 100.0)/100.0 + " Euros");	
		System.out.println("The value $" + valuerate_dollars + ", is euqal to    $"  + Math.round((valuerate_dollars / 0.9739)* 100.0)/100.0 + " Canadian Dollars");
	}
}