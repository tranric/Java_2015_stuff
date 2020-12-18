//Nickolaus Lunz N01027509
package lab1;
public class Person{
	private String name;
	private int id;
	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
}