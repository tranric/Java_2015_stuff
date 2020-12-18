//Nickolaus Lunz N01027509
package lab7;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
public class RockTheBoatDontRockTheBoatBaby {
	@Test
	public void testMean() {
		// Create an ArrayList for this test.
        ArrayList<Double> testList = new ArrayList<Double>();
        testList.add(1.0);
        testList.add(2.0);
        testList.add(3.0);
        testList.add(4.0);
        // This is the expected answer.
        double expectedAnswer = 2.5;
        // This is the expected precision.
        double expectedPrecision = 0.0000000001;
        // Call our method to see what it computes.
        double actualAnswer = StatFunc.mean(testList);
        // To complete the test, assert that the actual answer is equal to the expected answer
        //   (within +/- the expected precision).
        assertEquals(expectedAnswer, actualAnswer, expectedPrecision);
        // If the assert fails, the test fails.
        // If we get this far, the test passes.
	}
    @Test
    public void testMedianOdd(){
        double[] arg = {5.0, 1.0, 4.0};
        double expectedAnswer = 4.0;
        double expectedPrecision = 0.0000000001;
        double actualAnswer = StatFunc.median(arg);
        
       assertEquals(expectedAnswer, actualAnswer, expectedPrecision);
    }
    @Test
    public void testMedianEven(){
        double[] arg = {2.0, 9.0, 7.0, 5.0};
        double expectedAnswer = 6.0;
        double expectedPrecision = 0.0000000001;
        double actualAnswer = StatFunc.median(arg);
        
       assertEquals(expectedAnswer, actualAnswer, expectedPrecision);
    }
	@Test
	public void testGcd() {
		fail("Not yet implemented");
	}
	@Test
	public void testLcm() {
		fail("Not yet implemented");
	}
	@Test
	public void testNextPrime() {
		fail("Not yet implemented");
	}
}