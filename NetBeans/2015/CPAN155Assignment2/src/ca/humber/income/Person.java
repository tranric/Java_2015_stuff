package ca.humber.income;

abstract public class Person {
    private double pay, hours, income, total;

    public void setPay(double pay, double hours, double income){
        this.pay = pay;
        this.hours = hours;
        this.income = income;
    }
    
    public double getPay(){
        return pay; 
    }
    public double getHours(){
        return hours; 
    }
    public double getIncome(){
        return income; 
    }
    public double getTotal(){
        return total;
    }
    
    public void checkPay(double pay, double hours, double income){
        if (pay > 0){
            payment(pay, hours, income);
        }
    }
    abstract public void payment(double pay, double hours, double income);
}