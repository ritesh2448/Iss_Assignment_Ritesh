//This program shows user defined exception
package Exception;

import java.util.*;

public class ExceptionExample2 {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	try {
		System.out.print("Enter your age : ");
		int age=sc.nextInt();
		CheckAge(age);
		System.out.print("Access Granted");
	}
	catch(AgeException e) {
		System.out.println("Access Denied :"+ e);
	}
	finally {
		sc.close();
	}
}
	public static void CheckAge(int age) throws AgeException{
		if(age<18) {
			throw new AgeException("You must be 18 years old");
		}
	}
}

class AgeException extends Exception{
	AgeException(String message){
		super(message);
	}
}
