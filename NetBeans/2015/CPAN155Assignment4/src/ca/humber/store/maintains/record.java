package ca.humber.store.maintains;
public class record {
	private int CustomerID, ProductID, SingleItemPrice, ItemsPurchased;	
        private String FirstName, LastName, ProductName;
	public record(){
		setFirstName("");
		setLastName("");
		setItemName("");
		setCustomerNumber(0);
		setItemNumber(0);
		setPrices(0);
		setAmount(0);
	}
	public record(String firstName, String lastName, String ItemName, int customerNumber, int itemNumber,int prices,int amount){
		setFirstName(firstName);
		setLastName(lastName);
		setItemName(ItemName);
		setCustomerNumber(customerNumber);
		setItemNumber(itemNumber);
		setPrices(prices);
		setAmount(amount);
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public String getItemName() {
		return ProductName;
	}
	public void setItemName(String itemName) {
		this.ProductName = itemName;
	}
	public int getCustomerNumber() {
		return CustomerID;
	}
	public void setCustomerNumber(int customerNumber) {
		this.CustomerID = customerNumber;
	}
	public int getItemNumber() {
		return ProductID;
	}
	public void setItemNumber(int itemNumber) {
		this.ProductID = itemNumber;
	}
	public int getPrices() {
		return SingleItemPrice;
	}
	public void setPrices(int prices) {
		this.SingleItemPrice = prices;
	}
	public int getAmount() {
		return ItemsPurchased;
	}
	public void setAmount(int amount) {
		this.ItemsPurchased = amount;
	}
}