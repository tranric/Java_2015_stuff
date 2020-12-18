//Nickolaus Lunz N01027509
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
    	int i;
    	double input;
		Scanner scan = new Scanner(System.in);
		SimpleInterest inter = new SimpleInterest();
		System.out.println("1 FOR YEARS, 2 FOR MONTHS, AND 3 FOR DAYS: ");
		i = scan.nextInt();
		while(!(i < 4 && i > 0)){
			System.out.println("1 FOR YEARS, 2 FOR MONTHS, AND 3 FOR DAYS: ");
			i = scan.nextInt();
		}
		System.out.println("ENTER TERM LENGTH: ");
		input = scan.nextDouble();
		if (i == 1){
			inter.setPeriodYears(input);
		}
		if (i == 2){
			inter.setPeriodMonths(input);
		}
		if (i == 3){
			inter.setPeriodDays(input);
		}
		System.out.println("PRINCIPAL: ");
		input = scan.nextDouble();
		inter.setPrincipal(input);
		System.out.println("INTEREST RATE: ");
		input = scan.nextDouble();
		inter.setRate(input);
		System.out.println("THE SIMPLE INTEREST IS: " + inter.getSimpleInterest());
		System.out.println("THE PRESENT VALUE IS: " + inter.getPresentValue());
		System.out.println("THE FUTURE VALUE IS: " + inter.getFutureValue());
    }
}