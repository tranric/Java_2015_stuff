package ca.humber.workplace.staff;

public class Employee {
	private static int numberEmployees = 0;
	private static double baseSalary = 40000;
	private int employeeID;
	private double salary;
	private boolean achievements;
	
	public Employee(){
		employeeID = ++numberEmployees;
		salary = baseSalary;
		achievements = false;
	}
	
	public void setAchievements(boolean achievements){
		this.achievements = achievements;
	}
	
	public boolean getAchievements(){
		return achievements;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public int getEmployeeID(){
		return employeeID;
	}
}