//Nickolaus Lunz N01027509
package lab1;
public class Course {
	String name;
	int number;
	public Course(int number, String name){
		this.name = name;
		this.number = number;
	}
	public String getName(){
		return name;
	}
	public int getNumber(){
		return number;
	}
}