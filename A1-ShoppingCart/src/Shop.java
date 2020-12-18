import java.util.Scanner;


public class Shop {
	//attributes
	private double taxRate;
    private double preTaxTotalPrice;
    private double totalPrice;

    //default constructor - constructors have same name as that of class
    public Shop() {
        taxRate = 0;
        preTaxTotalPrice = 0;
        totalPrice = 0;
    }

    //getter
    public double getTaxRate() {
        return taxRate;
    }

    //setter
    //setter is required only for taxRate as other two attributes are calculated values.
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    /*
     * method for taking user input
     * takes Scanner class reference variable as parameter
     * no need to create object for Scanner in this class
     */
    public void getInput(Scanner scanner) {
        System.out.println("Enter name,quantity and price of item");
//        String itemName = scanner.next();
//        int quantity = scanner.nextInt();
//        double price = scanner.nextDouble();
//        addItem(itemName, quantity, price);
        /*
         * calls addItem method passing three arguments taken as input from user
         */
        addItem(scanner.next(), scanner.nextInt(), scanner.nextDouble());
    }

    public String getPreTaxTotalPrice() {
        return String.format("%.2f", preTaxTotalPrice);
        
    }

    public String printTotalPrice() {
        return String.format("%.2f", totalPrice);
    }

    /*
     * calculates total price before and after taxes 
     */
    public void addItem(String item, int quantity, double price) {
        preTaxTotalPrice += quantity * price;
        totalPrice = preTaxTotalPrice * (1 + taxRate);
    }
}
