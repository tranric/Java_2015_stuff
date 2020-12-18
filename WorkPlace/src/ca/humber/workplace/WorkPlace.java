package ca.humber.workplace;
import ca.humber.workplace.staff.Employee;

public class WorkPlace {
	
	public static void main(String[] args){
		Employee[] employees = hire(5);
		
		employees[0].setAchievements(true);
		employees[1].setAchievements(true);
		employees[4].setAchievements(true);
		
		annualReview(employees);
		
		employees[2].setAchievements(true);
		employees[3].setAchievements(true);
		
		annualReview(employees);
	}
	
	public static Employee[] hire (int number){
		Employee[] employees = new Employee[number];
		for (int i=0; i<number; i++){
			employees[i] = new Employee();
			System.out.println("HIRED EMPLOYEE NUMBER " + employees[i].getEmployeeID());
		}
		return employees;
	}
	public static void annualReview(Employee[] employees){
		for (int i=0; i<employees.length; i++){
			if (employees[i].getAchievements()){
				employees[i].setSalary(employees[i].getSalary()*1.1);
			}
			System.out.println("EMPLOYEE NUMBER "+employees[i].getEmployeeID()+" SALARY OF "+employees[i].getSalary());
		}
	}
}