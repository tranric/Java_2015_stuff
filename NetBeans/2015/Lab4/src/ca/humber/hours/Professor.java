package ca.humber.hours;

public class Professor extends Person {
    double totalHours;
    public void hours(double hours) {
        if (hours > 4 ){
            hours -= 2;
            totalHours+=hours;
        }
    }
}