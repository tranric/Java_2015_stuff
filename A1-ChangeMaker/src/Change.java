
public class Change {
	
	//attributes of the class
	private double money;
    private int numberOfQuarters;
    private int numberOfDimes;
    private int numberOfNickels;
    private int numberOfPennies;

    /*
     * default constructor of the class
     * sets default values for the attributes 
     */
    public Change() {
        money = 0;
        numberOfQuarters = 0;
        numberOfDimes = 0;
        numberOfNickels = 0;
        numberOfPennies = 0;
    }
    
    /*
     * getter for money
     * returns the value for money
     */
    public double getMoney() {
        return money;
    }

    /*
     * setter for money
     * sets money to newMoney passed as parameter
     */
    public void setMoney(double newMoney) {
        money = newMoney;
    }

    /*
     * method for calculating change
     */
    public void calculateChange() {
        int remainder =(int)Math.round(money * 100);
        numberOfQuarters = remainder / 25;
        remainder = remainder % 25;
        numberOfDimes = remainder / 10;
        remainder = remainder % 10;
        numberOfNickels = remainder / 5;
        numberOfPennies = remainder % 5;
        //numberOfPennies = remainder;
    }
    
    /*
     * Overridden method 
     * it overrides toString() method (definition) of Object class
     * returns a string in desired format
     * + is used for concatenation
     */

    public String toString() {
        String s = money + " equals "
                + numberOfQuarters + " quarter(s), "
                + numberOfDimes + " dime(s), "
                + numberOfNickels + " nickel(s), and "
                + numberOfPennies + " pennie(s)";
        return s;
    }
}
