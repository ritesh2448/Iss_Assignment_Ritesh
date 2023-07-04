//Defining a class
public class Basic1 {
    //instance variable or state
	double length;
	double width;
	
	//Method or behaviour
	public void setLength(double length) {
		this.length=length;
	}
	
	public void setWidth(double width) {
		this.width=width;
	}
	
	public double calArea() {
		return length*width;
	}
	
	public void displayInfo() {
		System.out.println("Length : "+length);
		System.out.println("Width : "+width);
		System.out.println("Area : "+calArea());
	}
	
	public static void main(String[] args) {
		
		//Object
		Basic1 rectangle = new Basic1();
		//performing actions on object
		rectangle.setLength(5);
		rectangle.setWidth(6);
		rectangle.displayInfo();
	}

}
