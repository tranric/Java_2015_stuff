//This is the Java Lab 2 projected developed by Nick Lunz
public class MathInJavaTest {
	public static void main(String[] args) {
		int int1=14;
		int int2=3;
		//These varibles are being doubled with the double function 
		double dint1=14;
		double dint2=3;
		
		System.out.print("ADDITION: "+int1+" + "+int2+" = ");//This will explain how the value 17 is obtained
		System.out.println(int1 + int2);
		
		System.out.print("SUBTRACTION: "+int1+" - "+int2+" = ");
		System.out.println(int1 - int2);
		
		System.out.print("MULTIPLICATION: "+int1+" * "+int2+" = ");
		System.out.println(int1 * int2);
		
		System.out.print("DIVISION: "+int1+" / "+int2+" = ");
		System.out.println(int1 / int2);
		
		System.out.print("REMAINDER OPERATOR: "+int1+" % "+int2+" = ");
		System.out.println(int1 % int2);
		
		System.out.print("UNARY OPERATOR: "+(-int2)+" = ");
		System.out.println(-int2);//This took me longer then it should have to change the value to a negative
		
		System.out.print("SHORHAND OPERATOR: int1 + "+(int2+2)+" = ");//Didn't want 5 to just be written to the text, so int2 which equals 3 has 2 added to it to equal 5.
		System.out.println(int1+=5);//+= means the value after the equals sign has been added to the value that comes before the addition sign
		
		System.out.print("INCREMENT OPERATOR: int1++ = ");
		System.out.println(int1++);
		
		//Now we'll be working with the double variables, weeee
		System.out.print("DAVISION WITH DOUBLES: "+dint1+" / "+dint2+" = ");
		System.out.println(dint1 / dint2);
		
		System.out.print("DOUBLE ROUNDED USING MATH: "+dint1+" / "+dint2+" = ");
		System.out.println(Math.round(dint1 / dint2));//The Math.round activates the round function, Game Maker 8's floor, ceil, and round do not apply in java
		
		System.out.print("14 CUBED: "+dint1+" * "+dint1+" * "+dint1+" = ");
		System.out.println(dint1 * dint1 * dint1);
		
		System.out.print("14 CUBED (Math.pow): ");
		System.out.println(Math.pow(dint1,3));
		//Ta-Dah basic java coding, mostly drawing lines using System.out.print, but with some math as well to make things worth wild
	}
}