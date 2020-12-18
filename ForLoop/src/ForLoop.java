import java.util.Scanner;
public class ForLoop {
	public static void main(String[] args){
		String names="";
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER 5 NAMES");
		for(int counter=0; counter<=4; counter++){
			names+=scan.next()+"\n";
		}
		System.out.println("\nTHE NAMES ARE: \n"+names);	
	}
}