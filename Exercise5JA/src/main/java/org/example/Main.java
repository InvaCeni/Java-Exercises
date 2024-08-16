package org.example;
public class Main {
    
    public static void main(String[] args) {
        SDAHashSet<String> hashSet = new SDAHashSet<>();
        hashSet.add("Hello");
        hashSet.add("World");
        System.out.println("Size: " + hashSet.size());
        System.out.println("Contains 'Hello': " + hashSet.contains("Hello"));
        hashSet.remove("Hello");
        System.out.println("Contains 'Hello' after removal: " + hashSet.contains("Hello"));
        hashSet.clear();
        System.out.println("Size after clear: " + hashSet.size());
    }
}