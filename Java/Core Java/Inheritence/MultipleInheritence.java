
interface Color{
	void color();
}

interface MaxSpeed{
	void maxspeed();
}

class Truck implements Color,MaxSpeed {
	
	public void color() {
		System.out.println("Color of the model is black");
	}
	
	public void maxspeed() {
		System.out.println("Max Speed of the model is 180 km/hr");
	}

}

public class MultipleInheritence{
	public static void main(String[] args) {
		Truck truck1=new Truck();
		truck1.color();
		truck1.maxspeed();
	}
}
