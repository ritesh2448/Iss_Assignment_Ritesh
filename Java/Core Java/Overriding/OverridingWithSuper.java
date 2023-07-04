class Birds{
	void sound() {
		System.out.println("Birds make sound");
	}
}

class Sparrow extends Birds {
	@Override
	void sound() {
		super.sound();
		System.out.println("sparrow cheeps");
	}
}

public class OverridingWithSuper {
	public static void main(String[] args) {
		Sparrow spr1 = new Sparrow();
		spr1.sound();
	}

}
