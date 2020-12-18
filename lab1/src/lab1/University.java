//Nickolaus Lunz N01027509
package lab1;
import java.util.ArrayList;
public class University{
	private ArrayList<Person> person = new ArrayList();
	private String name;
	private ArrayList<Course> course = new ArrayList();
	public University(String name){
		this.name = name;
	}
	public void addPerson(Person person){
		this.person.add(person);
	}
	public ArrayList<Person> getPeople(){
		return person;
	}
	public int getNumPerson(){
		return person.size();
	}
	public void addCourse (Course course){
		this.course.add(course);
	}
	public int getNumCourses(){
		return course.size();
	}
	public ArrayList<Course> getCourses(){
		return course;
	}
	public String getName(){
		return name;
	} 
}