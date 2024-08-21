package org.example;

public class Calculator {
    public double divide(double numerator, double denominator) throws CannotDivideBy0Exception {
        if (denominator == 0) {
            throw new CannotDivideBy0Exception("Cannot divide by zero.");
        }
        return numerator / denominator;
    }
}