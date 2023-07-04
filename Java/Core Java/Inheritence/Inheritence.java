
class Vehicle {
	String brand;
	Vehicle(String brand){
		this.brand=brand;
	}

}

class Car extends Vehicle{
	int numOfWheels;
	Car(String brand,int numOfWheels){
		super(brand);
		this.numOfWheels=numOfWheels;
	}
	public void displayInfo() {
		System.out.println("Brand : "+brand);
		System.out.println("Number of wheels : "+numOfWheels);
		System.out.println();
	}
	
	
}

public class Inheritence{
	public static void main(String[] args) {
		Car car1=new Car("Honda",4);
		Car car2=new Car("Toyoto",6);
		car1.displayInfo();
		car2.displayInfo();
	}
}