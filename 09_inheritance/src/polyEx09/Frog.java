package polyEx09;

public class Frog extends Pet{

	Frog() {
		super("개구리", "진연두");
	}
	Frog(String color) {
		super("개구리", color);
	}
	
	@Override
	void sound() {
		System.out.println("개굴개굴");
	}
	
	@Override
	void pattern() {
		System.out.println("점프를 잘한다");
	}
}
