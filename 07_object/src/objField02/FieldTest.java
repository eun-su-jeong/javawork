package objField02;

public class FieldTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		String company = car1.company;
		System.out.println("car1 회사명 : " + company);
		
		System.out.println("car1 모델명 : " + car1.model);
		
		car1.model = "SM9";
		System.out.println("car1 모델명 : " + car1.model);
		
		// car1.MAX_SPEED = 800;  상수는 한번 값을 넣으면 변경할 수 없다
		car1.maxSpeed = 800;
		System.out.println("------------------------------");
		
		Car car2 = new Car();
		System.out.println("car2 회사명 : " + car2.company);
		System.out.println("car2 모델명 : " + car2.model);
	}

}
