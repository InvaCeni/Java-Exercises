package org.example;

public class Main {
    public static void main(String[] args) {
        Movable point = new MovablePoint(5, 10, 2, 3);
        point.moveUp();
        System.out.println(point);

        Movable circle = new MovableCircle(5, 10, 2, 3, 4);
        circle.moveRight();
        System.out.println(circle);
    }
}