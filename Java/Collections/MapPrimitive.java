package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPrimitive {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

    
        hashMap.put("vk", 18);
        hashMap.put("cr", 7);
        hashMap.put("lm", 10);

        System.out.println("HashMap entries:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Creating a TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();


        treeMap.put("vk", 18);
        treeMap.put("cr", 7);
        treeMap.put("lm", 10);


        System.out.println("\nTreeMap entries (sorted by key):");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Creating a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();


        linkedHashMap.put("vk", 18);
        linkedHashMap.put("cr", 7);
        linkedHashMap.put("lm", 10);

   
        System.out.println("\nLinkedHashMap entries (insertion order maintained):");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
