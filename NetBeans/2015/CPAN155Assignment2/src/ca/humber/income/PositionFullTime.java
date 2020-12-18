package ca.humber.income;

public class PositionFullTime extends Person {
    double totalPayment;
    public void payment(double pay, double hours, double income) {
        if (pay > 0){
            pay /= 52;
            totalPayment+=pay;
        }
    }
    public double getTotal(){
        return totalPayment;
    }
}