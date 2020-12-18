import java.util.Scanner;
public class Vehicle {
	private int corX =0, corY =0;
	private String transportType = "";
	
	public Vehicle(String transportType, int corX, int corY){
		this.transportType = transportType;
		this.corX = corX;
		this.corY = corY;
	}
	public String getVehicle(String transportType){
		return transportType;
	}
	
	public void setVehicle(){
		Scanner scan = new Scanner(System.in);
		
		while (transportType != "ground" || transportType != "air"){
			System.out.print("PLEASE ENTER TRANSPORTATION METHOD (air/ground): ");
			getVehicle(scan.next());
		}
	}
}