import javax.swing.JOptionPane;

public class CarTester{
	public static void main(String[] args) {
		Car car1=new Car();
		Car car2=new Car();
		System.out.println("PLEASE CREATE TWO CARS TO BE CREATED\n");
		System.out.println("THE FIRST VEHICLE: ");
		car1.makeOfCar(JOptionPane.showInputDialog("CAR 1","HONDA"));
		car1.fuelefficiency(10);
		car1.setTankCapacity(50);
		car1.setAmountInTank(0);
		System.out.println("\nTHE SCEOND VEHICLES: ");
		car2.makeOfCar(JOptionPane.showInputDialog("CAR 2","NISSAN"));
		car2.fuelefficiency(10);
		car2.setTankCapacity(75);
		car2.setAmountInTank(0);
		System.out.println("\nTHE FIRST VEHICLE: ");
		car1.addFuel(40);
		System.out.println("\nTHE SCEOND VEHICLES: ");
		car2.addFuel(100);
		System.out.println("\nTHE FIRST VEHICLE: ");
		car1.moveCar(40);
		System.out.println("\nTHE SCEOND VEHICLES: ");
		car2.moveCar(800);
	}
}