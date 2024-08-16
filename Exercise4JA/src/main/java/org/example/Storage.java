package org.example;

import java.util.*;

class Storage {
    private Map<String, List<String>> storageMap;

    public Storage() {
        storageMap = new HashMap<>();
    }

    public void addToStorage(String key, String value) {
        storageMap.putIfAbsent(key, new ArrayList<>());
        storageMap.get(key).add(value);
    }

    public void printValues(String key) {
        List<String> values = storageMap.get(key);
        if (values != null) {
            System.out.println("Values under key '" + key + "': " + values);
        } else {
            System.out.println("No values found for key '" + key + "'.");
        }
    }

    public void findValues(String value) {
        List<String> keysWithValue = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : storageMap.entrySet()) {
            if (entry.getValue().contains(value)) {
                keysWithValue.add(entry.getKey());
            }
        }
        if (!keysWithValue.isEmpty()) {
            System.out.println("Keys with value '" + value + "': " + keysWithValue);
        } else {
            System.out.println("No keys found with value '" + value + "'.");
        }
    }
}

