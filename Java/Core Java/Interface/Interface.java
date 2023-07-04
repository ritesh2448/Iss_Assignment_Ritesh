interface Motion{
	void start();
	void stop();
}

class Bike implements Motion{
	public void start() {
		System.out.println("Bike Started");
		
	}
	public void stop() {
		System.out.println("Bike Stopped");
		
	}
	
	
}
public class Interface {

	public static void main(String[] args) {
		Bike bike1=new Bike();
		bike1.start();
		bike1.stop();

	}

}
