package ca.humber.delivery.transport;
import ca.humber.delivery.transport.DeliveryMethods;

public class Ground implements DeliveryMethods {
    private double x = 0, y = 0;
    private double deliveryX, deliveryY;
    
    public Ground(double deliveryX, double deliveryY){
        this.deliveryX = deliveryX;
        this.deliveryY = deliveryY;
    }
    
    public double getDelivery() {
        return ((deliveryX - x) + (deliveryY - y));
    }
}