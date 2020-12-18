package ca.humber.hours;
import java.util.Scanner;

public class Employees {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new TA();
        people[1] = new Student();
        people[2] = new Professor();
        
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("PLEASE ENTER POSITION (TA, Professor, AND Student), OR TYPE end TO EXIT PROCESS: ");
            String position = scan.next();
            if ("end".equals(position)) {
                break;
            } else {
                System.out.print("\nPLEASE ENTER FIRST NAME: ");
                String firstName = scan.next();
                System.out.print("\nPLEASE ENTER LAST NAME: ");
                String lastName = scan.next();
                System.out.print("\nPLEASE ENTER NAME OF COURSE: ");
                String course = scan.next();
                System.out.print("\nPLEASE ENTER NUMBER OF HOURS: ");
                double totalHours = scan.nextDouble();
                if ("TA".equals(position)){
                    people[0].hours(totalHours);
                } else if ("Professor".equals(position)){
                    people[1].hours(totalHours);
                } else if ("Student".equals(position)){
                    people[2].hours(totalHours);
                }
            }
        }
    }
}