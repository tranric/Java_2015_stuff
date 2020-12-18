import java.util.*;
import javax.swing.JOptionPane;
public class SalesReportTester{
	public static void main(String[] args){
		SalesReport sales = new SalesReport();
		sales.setNumberEmpoyees(Integer.parseInt(JOptionPane.showInputDialog(null, "PLEASE ENTER THE NUMBER OF EMPLOYEES", "NUMBER OF EMPLOYEES", JOptionPane.QUESTION_MESSAGE)));
		for(int i=0; i<sales.getNumberEmpoyees(); i++){
			sales.setNames(i, JOptionPane.showInputDialog(null, "PLEASE ENTER NAME OF EMPLOYEE", "EMPLOYEE NAME", JOptionPane.QUESTION_MESSAGE));
			sales.setSales(i, Integer.parseInt(JOptionPane.showInputDialog(null, "PLEASE ENTER SALES", "SALES", JOptionPane.QUESTION_MESSAGE)));
		}
	System.out.println("THE CURRENT TOTLE OF SALES ARE: $" + String.format("%.2f", sales.getSales())+"\nTHE PERCENT OF SALES");
		for(int n = 0; n < sales.getNumberEmpoyees(); n++){
			System.out.println(sales.chart(n));
		}
	}
}