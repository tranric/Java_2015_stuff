public class Dog {
   public static void main(String[] args) {
     TempClass temp = new TempClass(2);
   }
}
public class TempClass {
   private int i;
   public TempClass(int j) {
     int i = j; 
   }
}