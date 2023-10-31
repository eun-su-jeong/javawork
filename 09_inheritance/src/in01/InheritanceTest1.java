package in01;

class A {
	int aa = 1;
}
// 상속은 1개만 가능
class B extends A {
	int bb = 2;
}
class C extends B {
	int cc = 3;
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		C objC = new C();
		System.out.println("C클래스 객체에서 aa속성 값 : " + objC.aa);
		System.out.println("C클래스 객체에서 bb속성 값 : " + objC.bb);
		System.out.println("C클래스 객체에서 cc속성 값 : " + objC.cc);
		
		B objB = new B();
		System.out.println("B클래스 객체에서 aa속성 값 : " + objB.aa);
		System.out.println("B클래스 객체에서 bb속성 값 : " + objB.bb);
		// cc는 사용 불가
		// System.out.println("B클래스 객체에서 cc속성 값 : " + objB.cc);
		
		A objA = new A();
		System.out.println("A클래스 객체에서 aa속성 값 : " + objA.aa);
		// bb, cc는 사용 불가
		/*
		System.out.println("A클래스 객체에서 bb속성 값 : " + objA.bb);
		System.out.println("A클래스 객체에서 cc속성 값 : " + objA.cc);
		*/
	}
}
