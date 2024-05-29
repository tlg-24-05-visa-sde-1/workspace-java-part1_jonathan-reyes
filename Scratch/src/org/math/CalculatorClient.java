package org.math;

//import static org.math.Calculator.*;

class CalculatorClient {

    public static void main(String[] args) {

        double sum = Calculator.add(1, 4);

        System.out.println("sum is: " + sum);

        System.out.println("difference is: " + Calculator.subtract(1, 4));

        boolean result = Calculator.isEven(5);
        System.out.println(" result is: " + result);

        System.out.println();

        int winner = Calculator.randomInt(2, 5);

        System.out.println("print random number:" + winner);

        double averageExample = Calculator.average(5,10);
        System.out.println("average is : " + averageExample);
    }
}