package static10;

public class StaticMember {
	// 인스턴스 필드
	int num = 1;
	String name = "이턴스";
	
	// 정적 필드
	static int sNum = 2;
	static String sName = "김정적";
	
	// 인스턴스 메소드
	// 인스턴스 멤버와 정적 멤버 모두 사용가능
	void Me1() {
		System.out.println("인스턴스 메소드 Me1()");
	}
	String Me2() {
		System.out.println("인스턴스 메소드 Me2()");
		return "Me2()";
	}
	
	// 정적 메소드
	// 주의사항 : 정적 멤버만 호출가능
	static void sMe3() {  // 객체생성하든 한하든 사용가능
		//System.out.println(num);   // 사용불가
		System.out.println(sNum);  // 객체생성하든 한하든 사용가능
		System.out.println("정적 메소드 sMe3()");
		sMe4();
		//Me2();	// 사용불가
	}
	static int sMe4() {
		System.out.println("정적 메소드 sMe4()");
		return 4;
	}
}
