package org.example;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape("red", true);
        System.out.println(shape);

        Circle circle = new Circle("blue", false, 5.5);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle("green", true, 4.0, 7.0);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        Square square = new Square("yellow", true, 3.0);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}