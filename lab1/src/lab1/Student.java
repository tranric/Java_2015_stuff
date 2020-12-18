//Nickolaus Lunz N01027509
package lab1;
import java.util.ArrayList;
public class Student extends Person{
	private ArrayList<Course> courses = new ArrayList();
	private String major;
	public Student(int id, String name, String major){
		super(id, name);
		this.major = major;
	}
	public String getMajor(){
		return major;
	}
}