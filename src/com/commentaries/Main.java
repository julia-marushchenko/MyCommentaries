//Java program to demonstrate java commentaries
package com.commentaries;

/**
 * <h1>Find average of three numbers!</h1>
 * Main class consists method to calculate average of four doubles and prints
 * the aoutput to console.
 *
 * @author Julia Marushchenko
 * @version 1.0
 * @since 2025-04-27
 */
public class Main {

    /**
     * This method is used to find average of four numbers
     * @param numA This is the first parameter of findAverage method
     * @param numB This is the second parameter of findAverage method
     * @param numC This is the third parameter of findAverage method
     * @param numD This is the fourth parameter of findAverage method
     * @return
     */
    public double findAverage(double numA, double numB, double numC, double numD){
        return (numA + numB + numC + numD)/4;
    }



    /**
     * This is the main method which make use of findAverage method.
     * @param args Unused
     * @return Nothing
     */
    public static void main(String[] args) {

        Main obj = new Main();
        double number = obj.findAverage(2.2, 3.3, 4.1, 5.4);
        System.out.println(number);
    }
}
