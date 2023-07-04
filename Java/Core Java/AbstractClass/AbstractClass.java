abstract class Animals{
	String name;
	
	Animals(String name){
		this.name=name;
	}
	
	abstract void sound();
	
	void displayInfo() {
		System.out.println("This is a "+name);
	}
}

class Dog extends Animals{

	Dog(String name) {
		super(name);
		
	}
	
	void sound() {
		System.out.println("Dog barks");
	}
	
	
}
public class AbstractClass {

	public static void main(String[] args) {
		Dog dog1=new Dog("Tommy");
		dog1.sound();
		dog1.displayInfo();

	}

}
