package polymorphism07;

public class Car {
	private boolean power;
	private String model;
	private String color;
	private final int MAX_SPEED = 300;
	private int speed;
	
	Car() {
		this("EIE2023","white");
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	void getPower() {
		power = !power;
		if(power)
			System.out.println("차가 출발합니다.");
		else
			System.out.println("차가 멈춥니다.");
	}
	void speedUp() {
		speed += 10;
	}
	void speedDown() {
		speed -= 10;
	}
	String infor() {
		return "모델 : " + model + ", 색상 : " + color + ", 현재 속도 : " + speed; 
	}
}
