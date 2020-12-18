import java.util.Scanner;
public class ChangeMakerTester {
	public static void main(String[] args) {
		System.out.print("ENTER THE AMOUNT OF MONEY HERE: ");
		Scanner scan = new Scanner(System.in);
		ChangeMaker value = new ChangeMaker(scan.nextDouble());
		System.out.print("$"+value.getMoney()+value.toString());
	}
}