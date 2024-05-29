package org.math;

//import static java.lang.Math.*;

/*
 * This is an all static class, i.e. one with nothing but static methods
 * These methods are called from clients as Calculator.add(), Calculator.subtract(), etc.
 */
class Calculator {

    /* Returns the average of the supplied integer */
    public static double average(int first, int... values){ // by adding int first it forces the client to give you at least 1 int
        double sum = ((double)first);
        for(int value : values){
            sum = (sum +((double)value)); //can also be written sum+=value;
        }
        return (sum / ((double)values.length + 1.0));
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    //Indicates if the supplied integer is even or not
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    //Returns a random integer between 1 and 16 (inclusive)
    public static int randomInt() {
        return randomInt(1, 16);     //delegate to "min-max" version
    }

    //Convenience Method to Returns a random integer between 1 and max
    public static int randomInt(int max) {
        return randomInt(1, max);    //delegate to "min-max" version
    }

    //returns a random integer between min and max (inclusive)
    public static int randomInt(int min, int max) {
        int result = 0;

        double rand = Math.random();            //0.0000 to 0.9999
        double scaled = (rand * (max - min + 1)) + min; // 5.000 to 20.999999
        result = (int) scaled;        //explicit downcast from double to int

        return result;
    }

}