package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "economy");
        System.out.println(car.getEngine().getEngineType()); // prints "diesel"

        car.setType("luxury");
        System.out.println(car.getEngine().getEngineType()); // prints "electric"

        car.setType("sports");
        System.out.println(car.getEngine().getEngineType()); // prints "petrol"
    }
}