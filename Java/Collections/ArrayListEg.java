package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEg {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();

        numbers.add(150);
        numbers.add(85);
        numbers.add(14);

  
        for (int number : numbers) {
            System.out.println(number);
        }

        // Creating an ArrayList of custom objects (Student)
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Virat"));
        students.add(new Student(2, "JJ"));
        students.add(new Student(3, "MSD"));

    
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

