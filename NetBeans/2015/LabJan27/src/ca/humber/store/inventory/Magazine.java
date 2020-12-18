package ca.humber.store.inventory;


public class Magazine extends StoreItem {
    public Magazine(String itemName, double price) {
        super(itemName, price);
    }
	
    public double getCost(String condition) {
        if ("monthly".equals(condition)) {
            return super.getPrice()*4; 
        } else {
            return super.getPrice()*52;
        }
    }    
}