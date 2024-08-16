package org.example;
import java.util.*;

public class Main {
    public static void printMapElements(Map<String, Integer> map) {
        int count = map.size();
        int i = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            if (i < count - 1) {
                System.out.print(",");
            } else {
                System.out.print(".");
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 18);
        map.put("Python", 1);
        map.put("PHP", 0);
        printMapElements(map);
    }
}