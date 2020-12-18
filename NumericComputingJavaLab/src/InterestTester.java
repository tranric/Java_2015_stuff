//This project was made by Nickolaus Lunz
import java.text.DecimalFormat;
import java.util.Scanner;
public class InterestTester {
	public static void main(String[] args) {
		double dPrincipal;
		double dRate;
		double dPeriod;
		
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("PLEASE ENTER A PRINCIPAL: ");
		dPrincipal = scan.nextDouble();
		
		System.out.print("PLEASE ENTER A RATE VALUE: ");
		dRate = scan.nextDouble();
		
		System.out.print("PLEASE ENTER A PERIOD IN YEARS: ");
		dPeriod = scan.nextDouble();
		
		Interest in = new Interest(dPrincipal,dRate,dPeriod);
		System.out.println("\nTHE CURRENT INTREST VALUE IS "+df.format(in.getSimpleInterest())+"\nFUTURE VALUE: "+df.format(in.getFutureValue())+"\nPRESENT VALUE: "+df.format(in.getPresenValue(in.getFutureValue())));
	}
}