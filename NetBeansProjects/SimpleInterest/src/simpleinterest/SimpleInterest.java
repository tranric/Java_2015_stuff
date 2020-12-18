
package simpleinterest;
import java.util.Scanner;
public class SimpleInterest {
    
    private double principal, rate, periodYears;

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getPeriodYears() {
        return periodYears;
    }

    public void setPeriodYears(double periodYears) {
        this.periodYears = periodYears;
    }
    
    public void setPeriodMonths(double periodMonths) {
        periodYears = periodMonths/12;
    }
        
    public void setPeriodDays(double periodDays) {
        periodYears = periodDays/365;
    }
    
    public double getSimpleInterest(){
        return (getPrincipal()*getRate()*getPeriodYears());
    }
    
    public double getFutureValue(){
       return getPrincipal()*(1+(getRate()*getPeriodYears()));
    }
    public double getPresentValue(double futureValue){
        return (getFutureValue()/(1+(getRate()*getPeriodYears())));
    }

    public static void main(String[] args) {
         /*Scanner sc = new Scanner(System.in);
         System.out.println("Choose the type of period (1, 2, or 3). \n1.Years.\n2.Months.\n3.Days.\n");
         int Period = sc.nextInt();
         while (Period != 1 && Period != 2 && Period != 3 ){
         System.out.println("Invalid choice. \nChoose the type of period (1, 2, or 3). \n1.Years.\n2.Months.\n3.Days.\n");
         Period = sc.nextInt();  
         }
        System.out.println("Please Put in the principle.");
        double setPrincipal = sc.nextDouble();
        setPrincipal(setPrincipal);*/
        
    }
    
}
