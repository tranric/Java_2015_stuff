//Nickolaus Lunz N01027509
package lab2;
public class Square extends Rectangle{
	public String shapeType;
	public Square(double size){
		super (size,size);
	}
	public String getShapeType(){
		return shapeType;
	}
}