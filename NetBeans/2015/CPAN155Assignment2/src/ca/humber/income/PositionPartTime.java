package ca.humber.income;

public class PositionPartTime extends Person {
    double totalPayment;
    public void payment(double pay, double hours, double income) {
        if (pay > 0){
            pay *= hours;
            totalPayment+=pay;
        }
    }
    public double getTotal(){
        return totalPayment;
    }
}