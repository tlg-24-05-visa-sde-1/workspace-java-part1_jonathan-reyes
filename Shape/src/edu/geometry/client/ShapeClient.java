package edu.geometry.client;

/*
ShapeClient should create a few shapes, add them into an array, and then get the area of each one.
You should also compute the total area of all the shapes combined.
*/

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.Triangle;

class ShapeClient {

    public static void main(String[] args) {
        Shape[] areaShapes = new Shape[6];

        //Initializing the array with shapes
        areaShapes[0] = new Circle(5);
        areaShapes[1] = new Rectangle(12, 5);
        areaShapes[2] = new Triangle(3, 6,90);
        areaShapes[3] = new Circle(8);
        areaShapes[4] = new Triangle(4, 7,45);
        areaShapes[5] = new Rectangle(6, 8);

        //printing out to the screen the test cases with the respective areas
        for (int i = 0; i < areaShapes.length; i++) {
            System.out.println(areaShapes[i].toString() + ". Calculated area is : " + areaShapes[i].area());
        }

    }
}