package ca.humber.hours;

abstract public class Person {
    private double hours;

    public void setHours(double hours){
        this.hours = hours;
    }
    
    public double getHours(){
        return hours;
    }
    
    public void checkHours(double hours){
        if (hours > hours){
            hours(hours);
        }
    }
    abstract public void hours(double hours);
}