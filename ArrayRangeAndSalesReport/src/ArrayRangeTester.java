import javax.swing.JOptionPane;
public class ArrayRangeTester {
    public static void main(String[]args){
        int arrayLength=0;
        while(arrayLength<=0 || arrayLength>=51){
            arrayLength=Integer.parseInt(JOptionPane.showInputDialog(null, "PLEASE ENTER A LENGTH FOR THE ARRAY", "ARRAY  LENGTH", JOptionPane.QUESTION_MESSAGE));
        }
        int[] Range=new int[arrayLength];
        for (int i=0; i<Range.length; i++){
            Range[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "PLEASE ENTER A VALUE TO BE ADDED TO THE ARRAY", "ARRAY  VALUE", JOptionPane.QUESTION_MESSAGE));
            while(Range[i]<=0 || Range[i]>=51){
                i--;
            }
        }
        for (int i=0; i<Range.length; i++)System.out.println("SECTION "+(i+1)+": "+Range[i]);
        System.out.println("THE RANGE OF THE ARRAY IS "+ArrayRange.range(Range));
    }
}
