import java.util.Random;

import javax.swing.JOptionPane;


public class CoinFlip {
	private int numTimes;
    private Random random;

    public CoinFlip() {
		numTimes = 2;
		random = new Random();
	}
    
	public int getNumTimes() {
		return numTimes;
	}

	public void setNumTimes(int numTimes) {
		this.numTimes = numTimes;
	}

	public void getTimes() {
		while (numTimes <= 1 || numTimes >= 10){
	        numTimes = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"
	                + " between 1 and 10"));
	    }
	}

	public void flip() {
		int heads = 0;
	    int tails = 0;
		int face = 0;
		int flips = 0;
		
		while (flips < numTimes)
        {
            face = random.nextInt(2);
            if (face == 0)
                heads++;
            else
                tails++;
        }
        System.out.println("Total number of flips: " + numTimes + "   Heads: "
                + heads + "  Tails: " + tails);
	}	
}
