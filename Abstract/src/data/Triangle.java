/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author NGUYEN DUC VIET
 */
public abstract class Triangle {
    protected String name;
    protected String color;

    public Triangle(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Triangle{" + "name=" + name + ", color=" + color + '}';
    }
    
    public abstract double getArea();
    
    public abstract double getPerimiter();
}
