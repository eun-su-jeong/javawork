package polyEx09;

public class Cat extends Pet{

	Cat() {
		super("고양이", "얼룩이");
	}
	Cat(String color) {
		super("고양이", color);
	}
	
	@Override
	void sound() {
		System.out.println("야옹");
	}
	
	@Override
	void pattern() {
		System.out.println("높은곳에 잘 올라간다");
	}
}
