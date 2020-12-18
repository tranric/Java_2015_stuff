/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.humber.painters.shapes;

import ca.humber.painters.shapes.Shape;

/**
 *
 * @author Otter
 */
public class Square implements Shape {
    private double length;
    private String color;
    
    public Square(double length, String color) {
        this.length = length;
        this.color = color;
    }
    
    public double getArea() {
        return length * length;
    }
    
    public String getColor() {
        return color;
    }
}