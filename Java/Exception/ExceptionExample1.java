package Exception;

import java.util.*;
import java.io.*;

public class ExceptionExample1 {
	public static void main(String []args) {
		Scanner sc =new Scanner(System.in);
		
		try {
			System.out.println("Enter first number");
			int num1 =sc.nextInt();
			
			System.out.println("Enter second number");
			int num2 =sc.nextInt();
			
			int result =num1/num2;
		}
		
		catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");	
		}
		catch(InputMismatchException e) {
			System.out.println("Both numbers need to be integer only");
		}
		finally {
			System.out.println("Closing scanner");
			sc.close();
		}
	}

}
