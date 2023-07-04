package Exception;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCustom {
    public static void main(String[] args) {
        // Creating a HashMap with Student as key and value
        Map<Student, Student> studentMap = new TreeMap<>();

        Student student1 = new Student(18, "vk");
        Student student2 = new Student(7, "msd");
        Student student3 = new Student(3, "");

        studentMap.put(student1, student1);
        studentMap.put(student2, student2);
        studentMap.put(student3, student3);

        //Sorting the map by keys in ascending order(as we are using treemap)
        System.out.println("Map entries(sorted by keys:");
        for (Map.Entry<Student, Student> entry : studentMap.entrySet()) {
            Student key = entry.getKey();
            Student value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
        
        // Retrieving a value from the map using a key
        Student searchKey = new Student(7, "msd");
        Student searchValue = studentMap.get(searchKey);
        System.out.println("\nRetrieved value for key " + searchKey + ": " + searchValue);
    }

    // Student class
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
            return Integer.compare(this.id, other.id);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}