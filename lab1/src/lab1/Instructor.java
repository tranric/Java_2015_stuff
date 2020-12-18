//Nickolaus Lunz N01027509
package lab1;
public class Instructor extends Person{
	private Course courses;
	public Instructor(int id, String name){
		super(id, name);
	}
	public void setCourse(Course course){
		this.courses = course;
	}
	public Course getCource(){
		return courses;
	}
}