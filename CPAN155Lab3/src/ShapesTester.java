import java.util.Scanner;
public class ShapesTester{
    public static void main(String[]args){
        String shape = "";
        Scanner scan =  new Scanner(System.in);
        while (!(shape.equalsIgnoreCase("circle")) || !(shape.equalsIgnoreCase("square"))){
            System.out.print("PLEASE ENTER SHAPE: (circle or square): ");
            shape = scan.next();
        }
    }
}