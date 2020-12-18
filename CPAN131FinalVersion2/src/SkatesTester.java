import java.util.Scanner;

import javax.swing.JOptionPane;
public class SkatesTester{
	public static void main(String[] args){
		int lengthOfArray=0;
		Skates skate[] = new Skates[lengthOfArray];
		Scanner scan = new Scanner(System.in);
		while (lengthOfArray<5){
			System.out.print("PLEASE ENTER A VALUE HIGHER THEN 4: ");
			lengthOfArray = scan.nextInt();
			if (lengthOfArray<5){
				System.out.println("THE VALUE "+lengthOfArray+" WAS NOT ALLOWED.");
			}
		}
		if (lengthOfArray>4){
			System.out.println("");
			for (int i=0; i<lengthOfArray; i++){
				String manufacture=JOptionPane.showInputDialog("PLEASE ENTER NAME OF MAUNFACTURER FOR SKATE NUMBER "+(i+1));
				String model=JOptionPane.showInputDialog("PLEASE ENTER MODEL OF FOR SKATE NUMBER "+(i+1));
				String frame=JOptionPane.showInputDialog("PLEASE ENTER THE FRAME TYPE FOR SKATE NUMBER "+(i+1));
				skate[i] = new Skates(manufacture, model, frame);
			}
		}
		System.out.println(skate.toString());
	}
}