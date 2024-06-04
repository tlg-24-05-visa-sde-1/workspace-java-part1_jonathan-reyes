package edu.geometry;

public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double angle;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle = angle;
    }

    //Overrides the abstract method area
    @Override
    public double area(){
        return 0.5*(getSide1()*getSide2()*Math.sin(Math.toRadians(getAngle())));
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getAngle() {
        return angle;
    }

    @Override
    public String toString() {
        return "Triangle: " + "side1=" + getSide1() + ", side2=" + getSide2() + ", angle=" + getAngle();
    }
}