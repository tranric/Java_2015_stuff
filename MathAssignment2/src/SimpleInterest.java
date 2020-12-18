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
        //s = (p * r * t)
    	return (getPrincipal()*getRate()*getPeriodYears());
    }
    public double getFutureValue(){
        //fv = p(1 + r * t)
    	return getPrincipal()*(1+(getRate()*getPeriodYears()));
    }
    public double getPresentValue(){
        //p = (fv / (1 + r * t)
    	 return (getFutureValue()/(1+(getRate()*getPeriodYears())));
    }
}