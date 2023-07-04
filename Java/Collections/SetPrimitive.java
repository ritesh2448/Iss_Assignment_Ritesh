package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPrimitive {
    public static void main(String[] args) {
        // HashSet Example
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("vk");
        hashSet.add("rs");
        hashSet.add("msd");
        hashSet.add("rs"); // Duplicate element is ignored
        
        System.out.println("HashSet elements:");
        for (String element : hashSet) {
            System.out.println(element);
        }

        // TreeSet Example
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(56);
        treeSet.add(469);
        treeSet.add(69);
        treeSet.add(56);

        System.out.println("\nTreeSet elements:");
        for (Integer element : treeSet) {
            System.out.println(element);
        }

        // LinkedHashSet Example
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();

  
        linkedHashSet.add('R');
        linkedHashSet.add('J');
        linkedHashSet.add('P');
        linkedHashSet.add('J'); 

       
        System.out.println("\nLinkedHashSet elements:");
        for (Character element : linkedHashSet) {
            System.out.println(element);
        }
    }
}

