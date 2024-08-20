package org.example;

class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        double newRadius = getRadius() * (1 - percent / 100.0);
        // Assuming we have a way to set the radius in the Circle class
        // This could be done through a setter method or by modifying the constructor
        // For this example, we will just print the new radius
        System.out.println("New radius after resizing: " + newRadius);
    }
}
