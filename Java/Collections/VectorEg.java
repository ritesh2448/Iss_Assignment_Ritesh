package collections;

import java.util.Vector;
import java.util.Collections;

public class VectorEg {
    public static void main(String[] args) {
        // Creating a Vector of integers
        Vector<Integer> numbers = new Vector<>();

        numbers.add(520);
        numbers.add(68);
        numbers.add(36);
        numbers.add(14);

        // Sorting the Vector in ascending order
        Collections.sort(numbers);

        
        for (int number : numbers) {
            System.out.println(number);
        }

        // Creating a Vector of custom objects (Student)
        Vector<Student> students = new Vector<>();

       
        students.add(new Student(2, "Virat"));
        students.add(new Student(3, "MSD"));
        students.add(new Student(1, "JJ"));

        // Sorting the Vector of custom objects based on ID
        Collections.sort(students, (s1, s2) -> s1.getId() - s2.getId());

        
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
        }
    }

    // Student class
    static class Student {
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
    }
}
