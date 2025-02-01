package WalmartDSA;

import java.util.*;

public class OrderedHashmapwithSet {
    public static void main(String[] args) {
        // Initialize the HashMap with Sets
        Map<String, LinkedHashSet<Integer>> map = new HashMap<>();

        // Add values to the map
        addInMap(map, "Key1", 10);
        addInMap(map, "Key1", 20);
        addInMap(map, "Key1", 10); // Duplicate value, won't be added to the set
        addInMap(map, "Key2", 30);

        // Print each key and its corresponding set of values
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }

    // Helper method to add values to the map
    public static void addInMap(Map<String, LinkedHashSet<Integer>> map, String key, int value) {
        map.putIfAbsent(key, new LinkedHashSet<>()); // Initialize a new HashSet if the key doesn't exist
        map.get(key).add(value); // Add the value to the corresponding set
    }
}
