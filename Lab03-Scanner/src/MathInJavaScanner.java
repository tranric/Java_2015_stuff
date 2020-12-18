import java.util.Scanner;
public class MathInJavaScanner {
	public static void main(String[] args) {
		int int1=0;
		int int2=0;
		System.out.print("ENTER FIRST VALUE HERE: ");
		Scanner scan = new Scanner(System.in);
		int1 = scan.nextInt();		
		System.out.print("ENTER SECOND VALUE HERE: ");
		//Scanner scan2 = new Scanner(System.in);
		int2 = scan.nextInt();	
		System.out.println("");
		System.out.println("ADDITION: "+int1+" + "+int2+" = " + (int1 + int2));
		System.out.println("SUBTRACTION: "+int1+" - "+int2+" = " + (int1 - int2));
		System.out.println("MULTIPLICATION: "+int1+" * "+int2+" = " + (int1 * int2));
		System.out.println("DIVISION: "+int1+" / "+int2+" = " + (int1 / int2));
		System.out.println("REMAINDER OPERATOR: "+int1+" % "+int2+" = " + (int1 % int2));
		System.out.println("UNARY OPERATOR: "+(-int2)+" = "+ (-int2));
		System.out.println("SHORHAND OPERATOR: int1 + "+(int2+2)+" = " + (int1+=5));
		System.out.println("INCREMENT OPERATOR: int1++ = "+ (int1++));
		System.out.println("");
		double dint1=0;
		double dint2=0;
		System.out.print("ENTER FIRST DOUBLE VALUE HERE: ");
		dint1 = scan.nextDouble();		
		System.out.print("ENTER SECOND DOUBLE VALUE HERE: ");
		dint2 = scan.nextDouble();	
		System.out.println("");
		System.out.println("DAVISION WITH DOUBLES: "+dint1+" / "+dint2+" = " + (dint1 / dint2));
		System.out.println("DOUBLE ROUNDED USING MATH: "+dint1+" / "+dint2+" = " + (Math.round(dint1 / dint2)));
		System.out.println("14 CUBED: "+dint1+" * "+dint1+" * "+dint1+" = " + (dint1 * dint1 * dint1));
		System.out.println("14 CUBED (Math.pow): " + (Math.pow(dint1,3)));
	}
}