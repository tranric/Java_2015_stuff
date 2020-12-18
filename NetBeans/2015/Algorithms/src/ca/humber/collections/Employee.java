
package ca.humber.collections;

public class Employee implements Comparable<Employee> {
    private String firstName;
    private String lastName;
    private Integer yearHired;
    private String position;

    public Employee(String firstName, String lastName, int yearHired, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearHired = yearHired;
        this.position = position;
    }
    
    public int compareTo(Employee p) {
        if (lastName.equals(p.getLastName())) {
            return firstName.compareTo(p.getFirstName());
        }
        return lastName.compareTo(p.getLastName());
        
//        if (p.getLastName().equals(lastName)) {
//            return p.getFirstName().compareTo(firstName);
//        }        
//        return p.getLastName().compareTo(lastName);
//        
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public Integer getYearHired() {
        return yearHired;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    } 

    @Override
    public String toString() {
        return "Employee{" + "firstName=" + firstName + ", lastName=" + lastName + ", yearHired=" + yearHired + ", position=" + position + '}' + "\n";
    }

   
      
}