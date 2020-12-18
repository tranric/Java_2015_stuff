public class CellPhonePlan {
	private String sName;
	private double dFreeMinutes;
	private double dUsedMinutes;
	private final double D_CHARGE_PER_MIN = 5.0;
	private double dBill;
	
	public CellPhonePlan(String name, double freeMinutes){
		sName=name;
		dFreeMinutes=freeMinutes;
	}
	public String getUserName(){
		return sName;
	}
	public double getFreeMinutes(){
		return dFreeMinutes;
	}
	public double getUsedMinutes(){
		return dUsedMinutes;
	}
	public double getBill(){
		if (dUsedMinutes>dFreeMinutes){
			//This will get the bill, but the free minutes will be removed from the cost
			dBill=(dUsedMinutes-dFreeMinutes)*D_CHARGE_PER_MIN;
		}else if (dUsedMinutes<dFreeMinutes){
			//As long as the minutes used are less then the free minutes, the owner will not need to pay any fees
			dBill=0;
			if (dUsedMinutes<0){
				//This is a fail safe, if the value becomes a negative, the program will set the value zero
				dUsedMinutes=0;
			}
		}
		return dBill;
	}
	public void setUsedMinutes(double minutes){
		minutes=dUsedMinutes;
	}
	public void addCall(double seconds){
		dUsedMinutes+=seconds/60;
	}
}