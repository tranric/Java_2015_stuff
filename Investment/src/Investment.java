public class Investment{
	private double dPrincipal;
	private double dRate;
	private int iTerm;

	public Investment(double principal, double rate, int term){
		dPrincipal=principal;
		dRate=rate;
		iTerm=term;
	}
	
	public String getPrincipal(){
		return String.format("%.2f", dPrincipal);
	}

	public double getRate(){
		return dRate;
	}

	public int getTerm(){
		return iTerm;
	}
	public void loan(){
		dPrincipal*=(dRate+1);
	}
}