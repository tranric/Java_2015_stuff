import java.util.Random;
import javax.swing.JOptionPane;
public class IfStatement {
	public static void main(String[]args){
		int lotteryNum=0;
		int guess = Integer.parseInt(JOptionPane.showInputDialog("PLEASE ENTER A NUMBER BETWEEN 1 AND 10"));
		if (guess>10 || guess<1){
			JOptionPane.showMessageDialog(null, "OI! I SAID BETWEEN 1 AND 10, NOT "+guess+"! NOW YOU DON'T GET TO PLAY!");
		}else{
			int difference = Math.abs(lotteryNum - guess);
			switch(difference){
			case 0:
				JOptionPane.showMessageDialog(null,"YOU WIN $500!");
				break;
			case 1:
				JOptionPane.showMessageDialog(null,"YOU WIN $250!");
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"YOU WIN $50!");
				break;
			default:
				JOptionPane.showMessageDialog(null,"YOU LOST LOSER!");
			}
		}
	}
}
