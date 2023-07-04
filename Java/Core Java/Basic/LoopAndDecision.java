import java.util.Scanner;

public class LoopAndDecision {
    
    public static void main(String[] args) {

        // For loop to print odd numbers from 1 to 10
        System.out.println("Using for loop to print odd numbers from 1 to 10");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        // while loop to print even numbers
        System.out.println("Using while loop to print even numbers from 1 to 10");
        int j = 1;
        while (j <= 10) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
            j++;
        }
        System.out.println();

        // Do-while loop
        System.out.println("Using do-while loop to print numbers from 1 to 5");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
        System.out.println();

        // if-else
        int age = 18;
        if (age >= 21) {
            System.out.println("You are eligible to participate");
        } else {
            System.out.println("You are not eligible to participate");
        }
        System.out.println();

        // switch statement
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a shape (circle, square, triangle):");
        String shape = scanner.nextLine();

        switch (shape) {
            case "circle":
                System.out.println("You selected circle");
                break;
            case "square":
                System.out.println("You selected square");
                break;
            case "triangle":
                System.out.println("You selected triangle");
                break;
            default:
                System.out.println("Invalid Shape");
                break;

        }
        
        scanner.close();

    }
}

