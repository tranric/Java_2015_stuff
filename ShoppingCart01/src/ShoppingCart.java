import java.util.Scanner;
public class ShoppingCart {
	private double taxRate;
	private double preTaxTotalPrice;
	private double totalPrice;
	
	public ShoppingCart(String item, int quantity, double price){
		taxRate=0.05;
		preTaxTotalPrice=0;
		totalPrice=0;
		preTaxTotalPrice+=quantity*price;
		totalPrice=(preTaxTotalPrice*taxRate)+preTaxTotalPrice;
	}
	public double getTaxRate(){
		return taxRate;
	}
	public void setTaxRate(double tax){
		taxRate=tax;
	}
	public void getInput(Scanner scanner){
		this.addItem(scanner.nextLine(), scanner.nextInt(),scanner.nextDouble());
	}
	public void addItem(String item, int quantity, double price){
		preTaxTotalPrice+=quantity*price;
	}
	public double getPreTaxTotalPrice(){
		return preTaxTotalPrice;
	}
	public double getTotalPrice(){
		return totalPrice;
	}
}