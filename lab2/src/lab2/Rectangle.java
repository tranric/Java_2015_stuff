//Nickolaus Lunz N01027509
package lab2;
public class Rectangle extends Quadrillateral{
	public double perimeter, area;
	public String shareType;
	 Rectangle(double height, double width){
		 super(height, width);
	 }
	 public double getperimeter(){
		 return perimeter;
	 }
	 public double getArea(){
		 return area;
	 }
	 public String getShapeType(){
		 return shareType;
	 }
}