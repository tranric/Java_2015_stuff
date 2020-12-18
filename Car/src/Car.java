public class Car{
	private String makeOfCar;
	private double distanceDriven;
	private double fuelEfficiency;
	private int tankCapacity;
	private double AmountInTank;
	private double traveler;
	
	public void makeOfCar(String makeOfCar){	
		this.makeOfCar=makeOfCar;
		System.out.println("THE FIRST CAR IS CURRENTLY: "+makeOfCar);
	}
	public void setTankCapacity(int tankCapacity){
		this.tankCapacity=tankCapacity;
		System.out.println("THE TANK CAPACITY "+tankCapacity+" litres");
	}
	public void fuelefficiency(double fuelEfficiency){
		this.fuelEfficiency=fuelEfficiency;
		System.out.println("THE TANK GETS "+this.fuelEfficiency+" KILMENTERS TO THE LITRES");
	}
	public void setAmountInTank(double amountInTank) {
		AmountInTank=amountInTank;
		System.out.println("THE "+makeOfCar+" CURRENTLY HAS "+AmountInTank);
	}
	public void addFuel(double litres) {
		if (litres<tankCapacity){
			System.out.println("ADD FUEL TO THE "+makeOfCar);
			AmountInTank=litres;
		}
		else if (litres>=tankCapacity){
			System.out.println("MORE THEN THE MAX TANK VOLUME HAS BEEN ADDED TO THE "+makeOfCar+"\nTHE EXTRA GAS WILL BE WASTED ($"+((litres-tankCapacity)*1.104)+" HAS BEEN WASTED)");
			AmountInTank=tankCapacity;
		}
		System.out.println("THE VEHICLE HAS THE "+tankCapacity);
		System.out.println("THE CAR GETS "+fuelEfficiency+" KILOMETERS PER LITRE");
		System.out.println("THE VEHICLE CURRENTLY HAS " + AmountInTank+" IN IT'S TANK");
	}
	public void moveCar(double distance) {
		traveler=AmountInTank*fuelEfficiency;
		if(distance<traveler){
			System.out.println("THE "+makeOfCar+" "+distance+"K");
			distanceDriven=distance;
			AmountInTank=(traveler-distance)/fuelEfficiency;
		}
		else if (distance>=traveler){
			System.out.println("THE "+makeOfCar+" "+distance+"K, THE VEHICLE WON'T WORK");
			distanceDriven=traveler;
			AmountInTank=0;
		}
		System.out.println(makeOfCar+" HAS DRIVEN "+distanceDriven+" KILOMETERS");
		System.out.println("THE TANKCAPACITY IS "+tankCapacity+" LITRES");
		System.out.println("THE VEHICLE GETS "+fuelEfficiency+" KILOMETERS TO THE LITRE");
		System.out.println("IT CURRENTLY HAS "+AmountInTank+" LITRES LEFT IN IT'S TANK");
	}
	public String toString() {
		return "string";
	}
}