package ca.humber.income;
import java.util.Scanner;

public class Payrolls {
    public static void main(String[] args) {
     Person[] people = new Person[3];
        people[0] = new PositionCustomer();
        people[1] = new PositionPartTime();
        people[2] = new PositionFullTime();
        double totalCustomer = 0;
        double totalPartTime = 0;
        double totalFullTime = 0;
        
        Scanner scan = new Scanner(System.in);
        while (true) {
            double totalPayment = 0, totalHours = 0, totalIncome = 0;
            String employmentType = "Part-time";
            System.out.println("PLEASE ENTER POSITION (Customer OR Employee), OR TYPE end TO EXIT PROCESS: \t");
            String position = scan.next();
            if ("end".equals(position)) {
                break;
            } else {
                System.out.println("PLEASE ENTER LAST NAME: \t");
                String name = scan.next();
                if ("Employee".equals(position)){
                    System.out.println("PLEASE ENTER FORM OF EMPLOYMENT (Full-time OR Part-time): \t");
                    employmentType = scan.next();
                    if ("Part-time".equals(employmentType)){
                        totalPayment =-1;
                        System.out.println("PLEASE ENTER HOURLY PAYMENT RATE: \t");
                        totalPayment = scan.nextDouble();
                        if (totalPayment != -1){
                            System.out.println("PLEASE ENTER TOTAL HOURS WORKED: \t");
                            totalHours = scan.nextDouble();
                        }
                    }else
                    if ("Full-time".equals(employmentType)){
                        System.out.println("PLEASE ENTER WEEKLY SALAY PAYMENT RATE: \t");
                        totalPayment = scan.nextDouble();
                    }
                }else
                if ("Customer".equals(position)){
                    System.out.println("PLEASE ENTER AMOUNT SPENT: \t");
                    totalIncome = scan.nextDouble();
                }
                if ("Customer".equals(position)){
                    people[0].payment(0,0,totalIncome);
                } else if (("Employee".equals(position)) && ("Part-time".equals(employmentType))){
                    people[1].payment(totalPayment,totalHours,0);
                } else if (("Employee".equals(position)) && ("Full-time".equals(employmentType))){
                    people[2].payment(totalPayment,0,0);
                }
            }
        }
        totalCustomer = people[0].getTotal();
        totalPartTime = people[1].getTotal();
        totalFullTime = people[2].getTotal();
        System.out.println("THE TOTAL INCOME FROM CUSTOMERS COMES TO: " + totalCustomer);
        System.out.println("THE TOTAL PAMENT FOR THE PART-TIME EMPLOYEES COMES TO: " + totalPartTime);
        System.out.println("THE TOTAL SALARY FOR THE FULL-TIME EMPLOYEES COMES TO: " + totalFullTime);
    }
}