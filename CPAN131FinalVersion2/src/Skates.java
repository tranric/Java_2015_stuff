public class Skates{
	private String manufacture;
	private String model;
	private String frame;

	public Skates(String manufacture, String model, String frame){
		setManufacture(manufacture);
		setModel(model);
		setFrame(frame);
	}
	public void setManufacture(String manufacture){
		this.manufacture=manufacture;
	}
	public void setModel(String model){
		this.model=model;
	}
	public void setFrame(String frame){
		this.frame=frame;
	}
	public String toString(){
		String details = "SKATE MANUFACTURED BY "+manufacture+" MODEL "+model+"\nWITH FRAME "+frame;
		return details;
	}
}