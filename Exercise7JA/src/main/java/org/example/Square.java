package org.example;
public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(String color, boolean isFilled, double side) {
        super(color, isFilled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square with side=" + getSide() + " which is a subclass of " + super.toString();
    }
}