//Nickolaus Lunz N01027509
package lab2;
public class Circle extends Shape{
	public double perimeter, area;
	public String shapeType;
	private double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	public double getArea(){
		return area;
	}
	public double getPerimeter(){
		return perimeter;
	}
	public String getShapeType(){
		return shapeType;
	}
}