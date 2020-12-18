
package lab7; 
import java.util.ArrayList; 
import java.util.Arrays;
public class StatFunc{ 
	/** 
	 * Computes and returns the mean of the numbers in the list. 
	 * If the input list is empty, returns 0.0. 
	 * If the list contains illegal values, the behavior is undefined 
	 * @param list - an ArrayList of double values 
	 * @return the mean of the values in the list 
	 */ 
	public static double mean (ArrayList<Double> list){ 
		/**
		double sum = 0;
		double average = 0;
		sum = sum + list.get(0);
		sum = sum + list.get(1);
		sum = sum + list.get(2);      
		average = sum / 3.0;
		return average;
		*/
		double sum = 0;
        double average = 0;
        for (double d : list)
            sum = sum + d;
        average = sum / list.size();
        return average;
	} 
    /** 
    * Computes and returns the median value of the numbers in the list. 
    * For number of elements, the exact median value is returned. 
    * For even number, the average of the middle two is returned. 
    * If the input list is empty, the returned mean is 0.0. 
    * If the list contains illegal values, the behavior is undefined. 
    * The element’s order in the input array may be changed by this method. 
    * @param arr 
    *             an array of double values 
    * @return the median of the values in the list 
    */ 
	public static double median (double[] arr){ 
		Arrays.sort(arr);
		if (arr.length == 0){
			return 0.0;    
		}else 
		if (arr.length % 2 ==0){
			double med = (arr[arr.length/2] + arr[arr.length/2-1])/2;
			return med;
		}else{
			double med = arr[arr.length/2];
			return med;
		}   
	}
	/** 
	 * Computes and returns the largest integer that divides (without remainder) both of the input integers (the greatest common divisor). 
	 * If either of the input integers is not positive, this method returns -1. 
	 * @param a 
	 *             any positive integer 
	 * @param b 
	 *             any positive integer 
	 * @return the greatest common divisor of a and b 
	 */ 
	public static int gcd (int a, int b){ 
	    LergestInt b1 = LergestInt.valueOf(a);
	    LergestInt b2 = LergestInt.valueOf(b);
	    LergestInt gcd = b1.gcd(b2);
	    return gcd.intValue();
	} 
	/** 
	 * Computes and returns the smallest integer that can be divided by (without remainder) both of the input integers (the least common multiple). 
	 * 
	 * If either of the input integers is not positive, this method returns -1. 
	 * If the least common multiple exceeds the maximum possible integer value, the behavior of this method is undefined. 
	 * 
	 * @param a 
	 *             any positive integer 
	 * @param b 
	 *             any positive integer 
	 * @return the least common multiple of a and b 
	 */ 
	public static int lcm (int a, int b){ 
		return 0; 
	} 
	/** 
	 * Given a number n, computes and returns the smallest prime number > n. 
	 * If the input integer is not positive, this method returns 2. 
	 * If the next prime number exceeds the maximum possible integer value, the behavior is undefined. 
	 * 
	 * @param n 
	 *             an integer 
	 * @return the smallest prime number larger than n 
	*/ 
	public static int nextPrime (int n){ 
		return 0; 
	} 
} 