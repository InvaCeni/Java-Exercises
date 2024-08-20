package org.example;

public class Main {
    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(10);
        System.out.println("Original radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());

        circle.resize(20); // Resize the circle by 20%
    }
}