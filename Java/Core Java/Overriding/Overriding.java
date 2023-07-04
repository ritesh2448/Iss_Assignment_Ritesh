
class Animal{
	void sound() {
		System.out.println("Animals make sound");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("cat meous");
	}
}

public class Overriding {
	public static void main(String[] args) {
		Animal a1=new Animal();
		Animal a2 = new Cat();
		a1.sound();
		a2.sound();
	}

}
