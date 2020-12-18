package ca.humber.monitoring.detector;

abstract public class FireDetector{
    private double temperatureThreashold;
    
    public void setTemperatureThreashold(double temperatureThreashold){
        this.temperatureThreashold = temperatureThreashold;
    }
    
    public double getTemperatureThreashold(){
        return temperatureThreashold;
    }
    
    public void checkTemperature(double temperature){
        if (temperature > temperatureThreashold){
            alarm();
        }
    }
    abstract public void alarm();
}
