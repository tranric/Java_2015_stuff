package ca.humber.monitoring.detector;
import ca.humber.monitoring.detector.BeepingDetector;
import ca.humber.monitoring.detector.FireDetector;
import ca.humber.monitoring.detector.WarningDetector;

public class MonitoringSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FireDetector[] detectors = new FireDetector[2];
        detectors[0] = new WarningDetector();
        detectors[1] = new BeepingDetector();
        
        detectors[0].setTemperatureThreashold(60);
        detectors[1].setTemperatureThreashold(90);
        
        monitor(detectors, 25);
        monitor(detectors, 70);
        monitor(detectors, 100);
    }
    
    private static void monitor(FireDetector[] detectors, double temperature) {
        System.out.println("Monitoring temperature of " + temperature + " celcius");
        for (FireDetector d : detectors) {
            d.checkTemperature(temperature);
        }
    }
}