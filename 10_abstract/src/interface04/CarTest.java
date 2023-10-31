package interface04;

public interface CarTest {
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		System.out.println("---------------");
		
		myCar.backLeftTire = new HankookTire();
		myCar.run();
	}
}
