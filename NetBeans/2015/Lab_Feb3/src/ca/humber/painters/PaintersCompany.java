/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.humber.painters;

import ca.humber.painters.shapes.Square;
import ca.humber.painters.shapes.Circle;
import ca.humber.painters.shapes.Shape;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class PaintersCompany {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double totalRed = 0;
        double totalGreen = 0;
        double totalBlue = 0;    
        
        Shape shape;
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String shapeType = scanner.next();
            if ("end".equals(shapeType)) {
                break;
            } else {
                double size = scanner.nextDouble();
                String color = scanner.next();
                if ("Circle".equals(shapeType)) {
                    shape = new Circle(size, color);
                } else {
                    shape = new Square(size, color);
                }
                switch (shape.getColor()) {
                    case "red":
                        totalRed += shape.getArea();                              
                        break;
                    case "green":
                        totalGreen += shape.getArea();                       
                        break;                            
                    case "blue":
                        totalBlue += shape.getArea();
                        break;
                    default:
                        break;
                }                
            }
        }
        
        System.out.println("Total area of Red is " + totalRed);
        System.out.println("Total area of Green is " + totalGreen);
        System.out.println("Total area of Blue is " + totalBlue);
    }
    
}