import java.util.Scanner;


public class ChangeMaker {

	public static void main(String[] args) {
		    //create object for Change class
		    Change change = new Change();
		    
		    //create Scanner class object
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the amount to calculate change");
	        
	        //sets number taken as input from user to money
	        change.setMoney(scanner.nextDouble());
	        change.calculateChange();
	        
	        /*
	         * will call toString method of Change class here to print calculated change
	         * toString() is called implicitly if we display an object
	         */
	       
	        System.out.println(change);
	}

}
