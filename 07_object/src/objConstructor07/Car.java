package objConstructor07;

public class Car {
	String company="삼성";
	String model="ss";
	String color="흰색";
	int speed=5;

	static String companys;
	static String models;
	static String colors;
	static int speeds;
	
	Car(String company, String model, String color) {
		System.out.println("생성자 호출");
		this.company = company;
		this.model = model;
		this.color = color;
	}
}
