package polymorphism07;

public class CarTest {

	public static void main(String[] args) {
		Car car = null;
		FireCar fc = new FireCar("E9","black");
		
		fc.getPower();
		fc.water();
		fc.speedUp();
		System.out.println(fc.infor());
		
		FireCar fc2 = new FireCar();
		System.out.println(fc2.infor());
		
		// 다형성 : 호출은 같은이름이지만 어떤 객체가 있느냐에 따라 값이 달라짐
		// 자동형변환 : 자손타입 -> 부모타입으로 형변환
		System.out.println("----------------------------------------");
		car = fc;
		System.out.println(car.infor());
		car = fc2;
		System.out.println(car.infor());
		
		// 강제형변환 : 부모타입 -> 자손타입 형변환
		FireCar fc3 = null;
		fc3 = (FireCar)car; // 자식타입으로 객체생성 -> Car 타입을 형변환 -> 자식타입으로 형변환
		
		Car car2 = new Car();
		// 형변환 불가
		// fc2 = (FireCar)car2;	// Car타입으로 생성(car객체), 자식객체로 변환(자식객체, car객체)불가			
	}
}
