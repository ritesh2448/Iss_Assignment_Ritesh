
public class Basic2 {
	//use of datatypes,modifier and final keyword
	private static final String DEFAULT_COLOR ="UNKNOWN";
	private static final int DEFAULT_SPEED = 0;
	private String brand;
	private String color;
	private int maxSpeed;
	
	//constructor1
	public Basic2(String brand,String color) {
		this.brand=brand;
		this.color=color;
		this.maxSpeed=DEFAULT_SPEED;
		
	}
	//constructor2
	public Basic2(String brand,String color,int maxSpeed) {
		this.brand=brand;
		this.color=color;
		this.maxSpeed=maxSpeed;
		
	}
	//method
	public void displayInfo() {
		System.out.println("Brand : " +brand);
		System.out.println("Color : "+color);
		System.out.println("Maximum Speed : "+maxSpeed+"\n");
		
	}
	
	public static void main(String[] args) {
		//objects
		Basic2 car1=new Basic2("Honda","Black",200);
		Basic2 car2=new Basic2("Toyoto","Red");
		
		car1.displayInfo();
		car2.displayInfo();
	}

}
