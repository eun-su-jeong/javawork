package interface04;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new KumhoTire();
	Tire backLeftTire = new KumhoTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
