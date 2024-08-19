package org.example;

public class Main {
    public static void main(String[] args) {
        Point2D pointA = new Point2D(1, 2);
        Point2D pointB = new Point2D(4, 6);
        Line line = new Line(pointA, pointB);

        System.out.println("Start Point: (" + line.getStart().getX() + ", " + line.getStart().getY() + ")");
        System.out.println("End Point: (" + line.getEnd().getX() + ", " + line.getEnd().getY() + ")");
        System.out.println("Length of the line: " + line.length());
        Point2D centerPoint = line.center();
        System.out.println("Center Point: (" + centerPoint.getX() + ", " + centerPoint.getY() + ")");
    }
}