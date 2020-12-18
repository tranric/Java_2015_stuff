import java.util.Scanner;

public class ShoppignCartTester {
	String name = "";
	private double quanity, price, cost;
//These actions are taking place every time the class is being activated or something like that. Anyway,quanity and price are changed by the new inputs. Here we also have the total cost of the items. 
	public ShoppignCartTester(String newStrig, int newQuanity, double newPrice){
		quanity=newQuanity;
		price=newPrice;
		cost+=(quanity*price);
		String.format("%.2f",cost);
	}
	
	public void getInput (Scanner scan){
		
	}
	
	public int getQuanity(){
		return quanity;
	}
	public void setQuanity(int newQuanity){
		this.quanity = quanity;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double newPrice){
		this.price = price;
	}
	public double getCost(){
		return cost;
	}
}