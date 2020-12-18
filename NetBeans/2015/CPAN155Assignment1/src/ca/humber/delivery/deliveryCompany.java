package ca.humber.delivery;
import ca.humber.delivery.transport.DeliveryMethods;
import ca.humber.delivery.transport.Air;
import ca.humber.delivery.transport.Ground;
import java.util.Scanner;

public class deliveryCompany {
    public static void main(String[] args) {
        double delivery = 0;
        Scanner scan = new Scanner(System.in);
        DeliveryMethods vehicle = null; 
        //type will be which kind of transportation we shall be using.
        
        while(true) {
            System.out.println("PLEASE ENTER A FORM OF DELIVERY (air or ground), OR TYPE END TO EXIT PROCESS: ");
            String vehicleType = scan.next();
            if (("end".equals(vehicleType)) || ("quite".equals(vehicleType)) || ("kill".equals(vehicleType))) {
                break; //The break will end the loop
            }else if ("alpha_red_delta".equals(vehicleType)){
                    System.out.println("CODE ALPHA RED DELTA HAS BEEN ACTIVATED\n");
                }else {
                System.out.print("PLEASE ENTER X AND Y LOCATION: ");
                double coordX = scan.nextDouble();
                double coordY = scan.nextDouble();
                if (("air".equals(vehicleType)) || ("Air".equals(vehicleType))) {
                    vehicle = new Air(coordX, coordY);
                } else if (("ground".equals(vehicleType)) || ("Ground".equals(vehicleType))) {
                    vehicle = new Ground(coordX, coordY);
                } else {
                    System.out.println("\n\nERROR, INCORRECT DELIVERY METHOD GIVEN\n");
                }
                    delivery += vehicle.getDelivery();
            }
        }
        
        System.out.println("\nTOTAL DELIVERY TRAVLED IS " + String.format("%.2f", delivery) + "\n\n");
    }
}