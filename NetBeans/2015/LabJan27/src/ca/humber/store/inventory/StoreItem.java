package ca.humber.store.inventory;

public class StoreItem {
    private String itemName;
    private double price;

    public StoreItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }
	
    public double getPrice() {
        return price;
    }
	
    public double getCost(String condition) {
        if ("sale".equals(condition)) {
            return price*0.5;
        } else {
            return price;
        }		
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }    
}