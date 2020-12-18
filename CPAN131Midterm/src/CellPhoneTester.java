import java.util.Scanner;
import java.math.*;
public class CellPhoneTester {
	public static void main(String[] args) {
		String userName="Stan Body";
		double freeTime=60;
		double timeUsed;
		CellPhonePlan phonePlan = new CellPhonePlan(userName, freeTime);
		Scanner scan = new Scanner(System.in);
		for(int counter=0; counter<=4; counter++){
			System.out.print("PLEASE ENTER PHONECALL IN SECONDS: ");
			phonePlan.addCall(scan.nextDouble());
		}
		System.out.println("PLAN HOLDER "+phonePlan.getUserName()+" HAS A TOTAL OF "+phonePlan.getFreeMinutes()+" IN HIS/HER CONTRACT.\n"+phonePlan.getUsedMinutes()+" MINUTES HAVE BEEN USED, WITH A CURRENT BILL OF $"+phonePlan.getBill()+".");
	}
}