package obj;

public class Object01 {

	public static void main(String[] args) {
		ObjectApi oa = new ObjectApi();
		// oa = ObjectApi객체를 생성한 주소 
		oa.method1();
		int result = oa.method2();
		System.out.println(result);
		System.out.println(oa.method2());
		
		ObjectApi oa2 = new ObjectApi();	
		System.out.println(oa2.minus(5, 2));
	}

}
//라이브러리 클래스 ,API
class ObjectApi{
	//인스턴스속성,인스턴스필드
	int num;
	double doul;
	boolean b;
	String str;
	
	//인스턴스메소드 
	void method1() {
		// return 안씀
		System.out.println("반환값이 없는 메소드");
	}
	
	int method2() {
		int meVal = 10;
		return meVal;
	}
	
	int plus(int num1, int num2) {
		int sum = num1 + num2;
		return sum ;
	}
	int minus(int num1, int num2) {
		return num1 - num2;
	}
}
