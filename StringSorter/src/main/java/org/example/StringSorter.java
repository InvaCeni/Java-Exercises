package org.example;
import java.util.Collections;
import java.util.List;

public class StringSorter {
    public static List<String> sortStringsInReverseAlphabeticalOrder(List<String> stringList) {
        Collections.sort(stringList, (s1, s2) -> s2.compareToIgnoreCase(s1));
        return stringList;
    }
}