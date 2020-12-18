//Nickolaus Lunz N01027509
package lab4;
public class Login {
	FileLog adapt = new FileLog();
	public Login(){
		if(adapt.LogMessage("txt")){
			System.out.println("text");
		}
	}
}