package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            Shape circle = new Circle(5);
            System.out.println("Circle Area: " + circle.getArea());
            System.out.println("Circle Perimeter: " + circle.getPerimeter());

            Shape rectangle = new Rectangle(4, 6);
            System.out.println("Rectangle Area: " + rectangle.getArea());
            System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        }
    }
