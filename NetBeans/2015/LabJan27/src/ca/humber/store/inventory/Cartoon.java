package ca.humber.store.inventory;

public class Cartoon extends StoreItem {
    public Cartoon(String itemName, double price) {
        super(itemName, price);
    }

    public double getCost(String condition) {
        return super.getPrice() * Integer.parseInt(condition);
    }	

}