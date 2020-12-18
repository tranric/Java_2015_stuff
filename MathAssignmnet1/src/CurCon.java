public class CurCon {
	public double amount;
	private double eur = 1.3351;
	private double cad = 0.7639;
	private double gbp = 1.5415;
	private double usd = 1;
	private int curIn, curOut;
	
	public CurCon(){}
	
	public void setCurIn(int x){
		curIn = x;
	}
	public void setCurOut(int x){
		curOut = x;
	}
	public double getAmount(){
		return amount;
	}
	public int getCurIn(){
		return curIn;
	}
	public int getCurOut(){
		return curOut;
	}
	public void setAmount(double setAmount){
		if (curIn == 1){
			if (curOut == 2){amount = ((setAmount/eur)*cad);}
			if (curOut == 3){amount = ((setAmount/eur)*gbp);}
			if (curOut == 4){amount = ((setAmount/eur));}
		}
		if (curIn == 2){
			if (curOut == 1){amount = ((setAmount*cad)/eur);}
			if (curOut == 3){amount = ((setAmount*cad)/gbp);}
			if (curOut == 4){amount = ((setAmount*cad));}
		}
		if (curIn == 3){
			if (curOut == 1){amount = ((setAmount/gbp)*eur);}
			if (curOut == 2){amount = ((setAmount/gbp)*cad);}
			if (curOut == 4){amount = ((setAmount/gbp));}
		}
	}
}