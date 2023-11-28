package const01;

class A01{
	/*
	 * 속성 - 변수, 상수
	 * 메소드 - 실행한 결과를 얻을 수 있는 메소드
	 * 생성자 - 객체가 생성될 때마다 한 번 호출
	 * */
	
	//생성자 : 반환형이 없고 클래스 이름과 동일한 이름을 갖는다
	// - 주로 속성의 초기화 할때 많이 사용한다
	
	int num;
	String str;
	boolean bool;

	A01(){
		num = 10;
		str ="안녕";
		bool = true;
		System.out.println("생성자가 호출되었음");
	}
	
	A01(int age, String name, boolean bool){
		this.num = age;
		this.str = name;
		this.bool = bool;
	}
	// 오버로딩 : 반환형은 상관없음 , 메소드 명은 같아야된다. 매개변수를 달라야한다(갯수|자료형)
	// 오버로딩의 대표적인 예 : .println(); 
	int plus(){
		return 0;
	}
	int plus(int num1) {
		return num1;
	}
	int plus(int num1 , int num2) {
		return num1 + num2;
	}
	int plus(int num1 , int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	String plus(double num1 , int num2) {
		double result = num1 + num2;
		
		return "합 =" + result;
	}
}

public class ConstMain {

	public static void main(String[] args) {

		A01 a1 = new A01();
		A01 a2 = new A01(20,"은길동",true);
		System.out.println(a1.str);
		System.out.println(a2.str);
		
		int result = a1.plus(5);
		String result1 = a1.plus(2.5, 1);
		
		System.out.println(result);
		System.out.println(result1);
	
	}

}
