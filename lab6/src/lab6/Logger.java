//Nickolaus Lunz N01027509
package lab6;
public class Logger {
	public static void main(String [] args) {
		System.out.println(new Abstraction(new FileLogger()).Operation());
		System.out.println(new Abstraction(new ConsoleLogger()).Operation());
	}
}
class Abstraction {
	Bridge bridge;
	public Abstraction (Bridge implementation) {
		bridge = implementation;
	}
	public String Operation() {
		return "Log" + "---" + bridge.OperationImp();
	}
}
interface Bridge {
    String OperationImp();
}