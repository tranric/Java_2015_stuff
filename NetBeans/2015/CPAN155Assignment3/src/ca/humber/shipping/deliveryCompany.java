package ca.humber.shipping;
import java.util.Scanner;

public class deliveryCompany {
    public static void main(String[] args) {
        double delivery = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("PLEASE ENTER X AND Y LOCATION\nTYPE END TO EXIT PROCESS: ");
        while(true) {
            String vehicleType = scan.next();
            if (("end".equals(vehicleType)) || ("quite".equals(vehicleType)) || ("kill".equals(vehicleType))) {
                double coordX = scan.nextDouble();
                double coordY = scan.nextDouble();
                distanceTravled(coordX,coordY);
                System.out.println("\n\nAN ERREOR HAS OCCURED\n");
            }
        }
        System.out.println("TOTAL DISTANCES TRAVELED: "+distanceTravled.getDelivery());
    }   
}