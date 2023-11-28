package extend;

class Parent{
	int x = 10;
	String str = "부모";
	
	int method1() {
		return 20;
	}
}

// class를 생성해야 상속을 바들 수 있다

class Child extends Parent{
	int x = 20;
	int childvar = 100;
	String children = "자식";
	String str = "자식";
	
	void method2() {
		String str = "로컬변수";
		System.out.println(str);
		System.out.println(this.str);
		System.out.println(super.str);
		// 부모 출력 : super
		// 자식 출력 : this
		// 지역변수 : 지정된 변수 
		// 지역변수 -> 자식 -> 부모
	}
	
}
public class inherit{

	public static void main(String[] args) {
		Child ch1 = new Child();
//		
//		System.out.println(ch1.children);
//		System.out.println(ch1.str);
		// 우선 순위는 자식이 먼저 (내꺼)
		
		ch1.method2();

	}

}
