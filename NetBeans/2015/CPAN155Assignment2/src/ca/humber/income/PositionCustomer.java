package ca.humber.income;

public class PositionCustomer extends Person {
    double totalIncome;
    public void payment(double pay, double hours, double income) {
        if (income > 0){
            totalIncome+=income;
        }
    }
    public double getTotal(){
        return totalIncome;
    }
}