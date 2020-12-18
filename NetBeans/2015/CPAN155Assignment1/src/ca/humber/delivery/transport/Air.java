package ca.humber.delivery.transport;
import ca.humber.delivery.transport.DeliveryMethods;
import java.lang.Math;

public class Air implements DeliveryMethods {
    private double x = 0, y = 0;
    private double deliveryX, deliveryY;
    
    public Air(double deliveryX, double deliveryY){
        this.deliveryX = deliveryX;
        this.deliveryY = deliveryY;
    }
    
    public double getDelivery() {
        return Math.sqrt(((deliveryX - x)*(deliveryX - x)) + ((deliveryY - y)*(deliveryY - y)));
    }
}