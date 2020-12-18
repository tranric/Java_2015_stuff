package ca.humber.shipping;
public class  distanceTravled {
    private double x = 0, y = 0;
    private double deliveryX, deliveryY;
    
    public distanceTravled(double deliveryX, double deliveryY){
        this.deliveryX = deliveryX;
        this.deliveryY = deliveryY;
    }
    
    public double getDelivery() {
        return ((deliveryX - x) + (deliveryY - y));
    }   
}