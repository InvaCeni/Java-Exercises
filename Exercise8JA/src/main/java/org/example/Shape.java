package org.example;
abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    protected String getColor() {
        return color;
    }

    protected boolean isFilled() {
        return filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
