package edu.geometry;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Overrides the abstract method area
    @Override
    public double area() {
        return (getLength() * getWidth());
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return ("Rectangle: " + "length=" + getLength() + ", width=" + getWidth());
    }
}
