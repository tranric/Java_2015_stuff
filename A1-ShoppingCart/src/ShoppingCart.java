import java.util.Scanner;


public class ShoppingCart {

	public static void main(String[] args) {
		Shop cart = new Shop();
        cart.setTaxRate(.05);	//set tax rate to 5%
        Scanner scanner = new Scanner(System.in);
        
        //call getInput three times to take input thrice
        cart.getInput(scanner);
        cart.getInput(scanner);
        cart.getInput(scanner);
        
        System.out.println("Pre-tax total price: $" +cart.getPreTaxTotalPrice());
        System.out.println("\nTax rate: " + cart.getTaxRate());
        System.out.println("Total price: $" +cart.printTotalPrice());

	}

}
