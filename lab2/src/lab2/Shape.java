//Nickolaus Lunz N01027509
package lab2;
public class Shape {
	private int numshape, id;
	private double area, perimeter;
	private String shapeType;
	public int getNumShapes(){
		return numshape;
	}
	public int getId(){
		return id;
	}
	public int compareTo(Shape shape){
		return shape.getNumShapes();
	}
	//public String ToSring(){
		//	
	//}
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