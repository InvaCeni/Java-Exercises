package org.example;
import java.util.*;

public class StringSorter {
    public static List<String> sortStringsInReverseAlphabeticalOrder(List<String> stringList) {
        List<String> sortedList = new ArrayList<>(stringList);
        Collections.sort(sortedList, String.CASE_INSENSITIVE_ORDER.reversed());
        return sortedList;
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hello", "world", "AbC", "XyZ");
        List<String> sortedList = sortStringsInReverseAlphabeticalOrder(stringList);
        System.out.println(sortedList); // [XyZ, world, Hello, AbC]
    }
}