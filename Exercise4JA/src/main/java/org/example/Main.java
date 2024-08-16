package org.example;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("fruits", "apple");
        storage.addToStorage("fruits", "banana");
        storage.addToStorage("vegetables", "carrot");
        storage.addToStorage("fruits", "apple");

        storage.printValues("fruits");
        storage.printValues("vegetables");
        storage.findValues("apple");
        storage.findValues("orange");
    }
}

