import package_example.Circle;

public class Package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Circle circle = new Circle(5.0);
	        double radius = circle.getRadius();
	        double area = circle.calculateArea();

	        System.out.println("Circle radius: " + radius);
	        System.out.println("Circle area: " + area);

	}

}
