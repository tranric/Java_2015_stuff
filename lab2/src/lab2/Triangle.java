//Nickolaus Lunz N01027509
package lab2;
public class Triangle extends Shape{
	private double height, baseWidth, side1Length, side2Length, perimeter, area;
	public String shapeType;
	Triangle (double height, double baseWidth, double side1Length, double side2Length){
		this.height = height;
		this.baseWidth = baseWidth;
		this.side1Length = side1Length;
		this.side2Length = side2Length;
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