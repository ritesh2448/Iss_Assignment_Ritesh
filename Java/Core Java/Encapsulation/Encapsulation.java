class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        double increaseAmount = salary * (percentage / 100);
        salary += increaseAmount;
        System.out.println(name + "'s salary increased by " + percentage + "%. New salary: " + salary);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 30, 50000.0);

        System.out.println("Name: " + employee.getName()); 
        System.out.println("Age: " + employee.getAge());  
        System.out.println("Salary: " + employee.getSalary());  

        employee.increaseSalary(10);  
    }
}
