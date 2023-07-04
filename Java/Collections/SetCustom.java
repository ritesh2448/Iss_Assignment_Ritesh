package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetCustom {
    public static void main(String[] args) {
        // HashSet Example with Custom Object (Student)
        HashSet<Student> hashSet = new HashSet<>();


        hashSet.add(new Student(1, "vk"));
        hashSet.add(new Student(2, "rj"));
        hashSet.add(new Student(3, "sn"));
        hashSet.add(new Student(2, "rj")); 

   
        System.out.println("HashSet elements (Student objects):");
        for (Student student : hashSet) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
        }

        // TreeSet Example with Custom Object (Student)
        TreeSet<Student> treeSet = new TreeSet<>();

      
        treeSet.add(new Student(3, "msd"));
        treeSet.add(new Student(1, "dk"));
        treeSet.add(new Student(2, "JJ"));
        treeSet.add(new Student(2, "JJ")); 

        
        System.out.println("\nTreeSet elements sorted by keys (Student objects):");
        for (Student student : treeSet) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
        }

        // LinkedHashSet Example with Custom Object (Student)
        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(new Student(2, "mv"));
        linkedHashSet.add(new Student(1, "jk"));
        linkedHashSet.add(new Student(3, "aj"));
        linkedHashSet.add(new Student(2, "jk")); // Duplicate element (ignored)

      
        System.out.println("\nLinkedHashSet elements (Student objects):");
        for (Student student : linkedHashSet) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
        }
    }

    static class Student implements Comparable<Student> {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Student other) {
            // Compare students based on their IDs
            return Integer.compare(this.id, other.id);
        }
    }
}