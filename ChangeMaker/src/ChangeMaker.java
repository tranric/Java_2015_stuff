import java.util.Scanner;
public class ChangeMaker {
	private double money;
	private int numberOfQuarters;
	private int numberOfDimes;
	private int numberOfNickles;
	private int numberOfPennies;	
	public ChangeMaker(double inputMoney){
		money=inputMoney;
		inputMoney/=0.25;
		numberOfQuarters=(int)inputMoney;
		inputMoney=(money-numberOfQuarters*0.25);
		inputMoney/=0.1;
		numberOfDimes=(int)inputMoney;
		inputMoney=(money-((numberOfQuarters*0.25)+(numberOfDimes*0.1)));
		inputMoney/=0.05;
		numberOfNickles=(int)inputMoney;
		inputMoney=(money-((numberOfQuarters*0.25)+(numberOfDimes*0.1)+(numberOfNickles*0.05)));
		inputMoney/=0.01;
		numberOfPennies=(int)inputMoney;
	}
	public double getMoney(){
		return money;
	}
	public String toString(){
		String str = (" EQUALS "+Integer.toString(numberOfQuarters)+" QUARTER(S), "+Integer.toString(numberOfDimes)+" DIME(S), "+Integer.toString(numberOfNickles)+" NICKLE(S), and "+Integer.toString(numberOfPennies)+" PENNIE(S)");
		return str;
	}
}