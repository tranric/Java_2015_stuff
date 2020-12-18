package ca.humber.currency;
import java.util.Scanner;
public class ExchangeStation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double action = 0;
        String type = "";
        String conversion = "";
        System.out.println("PLEASE ENTER CANADIAN EXCHANGE RATE\nFOLLOWED BY AMERAICAN EXCHANGE RATE");
        while(true) {
            System.out.println("PLEASE ENTER AMMOUNT, ACTION (buy OR sell),\nAND CONVERSION TYPE (USD OR Euro):");
            conversion = scan.next();
            if (("end".equals(conversion)) || ("quite".equals(conversion)) || ("kill".equals(conversion))) {
                break; //The break will end the loop
            }else{
                conversion = scan.next();
                action = scan.nextDouble();
                type = scan.next();
            }
        }
    }
    
}
