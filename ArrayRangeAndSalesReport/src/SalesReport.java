import java.util.*;
public class SalesReport {
	private String[] names;
	private double[] sales;
	public void setNumberEmpoyees(int employees){
		sales=new double[employees];
		names=new String[sales.length];
	}	
	public void setNames(int array, String name){
		names[array]=name;
	}
	public void setSales(int array, double salenumber){
		sales[array]=salenumber;
	}
	public int getNumberEmpoyees(){
		return names.length;
	}
	public String getNames(){
		String name="";
		for(int i=0; i<names.length; i++){
			name=names[i];
		}
		return name;
	}
	public double getSales(){
		double salesTotal=0;
		for(int i=0; i<sales.length; i++){
			salesTotal=salesTotal+sales[i];
		}
		return salesTotal;
	}
	public String chart(int spot){
		String name=names[spot];
		double amount=sales[spot];
		return name+": "+String.format("%.1f", (amount/getSales())*100)+"%";
	
	}
}