package ca.humber.stores;

import java.util.Scanner;

import ca.humber.store.inventory.Cartoon;
import ca.humber.store.inventory.Magazine;
import ca.humber.store.inventory.StoreItem;

public class Store{

    public static void main(String[] args) {
        StoreItem[] inventory = new StoreItem[10];

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            String name = scanner.next();
            double price;
            if (scanner.hasNextDouble()) { // It's a store item
                price = scanner.nextDouble();
                inventory[i] = new StoreItem(name, price);
            } else {
                if("issue".equals(scanner.next())) { // It's a cartoon
                    price = scanner.nextDouble();
                    inventory[i] = new Cartoon(name, price); 
                } else { // It's a magazine
                    price = scanner.nextDouble();
                    inventory[i] = new Magazine(name, price);
                }
            }		
        }

        double totalCost = 0;
        while (true) {
            String newName = scanner.next();
            if ("total".equals(newName)) {
                break;
            } else { // look for the item in the inventory
                for (StoreItem st : inventory) {
                    if (st.getItemName().equals(newName)) {
                        String condition = scanner.next();
                        totalCost += st.getCost(condition);
                        break;
                    }
                }
            }			
        }
		
        System.out.println("Total cost is " + totalCost);
        scanner.close();
    }

}