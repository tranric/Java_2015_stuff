/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.humber.painters.shapes;

/**
 *
 * @author Otter
 */
public class Circle implements Shape {
    private double radius;
    private String color;
    
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public double getArea(){
        return 3.14 * radius * radius;
    }
    
    public String getColor() {
        return color;
    }
}