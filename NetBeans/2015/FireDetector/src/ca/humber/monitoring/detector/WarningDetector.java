package ca.humber.monitoring.detector;


public class WarningDetector extends FireDetector {
    public void alarm() {
        System.out.println("Current temperature exceeds " + super.getTemperatureThreashold());
    }
}