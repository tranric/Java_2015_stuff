
package ca.humber.sets;

import java.io.IOException;

public class Articles {

    public static void main(String[] args) {
        SetGenerator hockey = new SetGenerator();
        SetGenerator javaCPP = new SetGenerator();
        SetGenerator java = new SetGenerator();
        
        try {
            hockey.generate("NHL.txt");
            java.generate("Java.txt");
            javaCPP.generate("JavaCPP.txt");                  
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        
        System.out.println("NHL.txt and JavaCPP.txt have " + 100*hockey.compare(javaCPP.getSet()) + "% similarity");
        System.out.println("NHL.txt and Java.txt have " + 100*hockey.compare(java.getSet()) + "% similarity");
        System.out.println("Java.txt and JavaCPP.txt have " + 100*java.compare(javaCPP.getSet()) + "% similarity");
    }
}