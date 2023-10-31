package objMethod03;

public class Method {
	// 반환형이 없는 메소드
	void print1() {
		System.out.println("반환값이 없고 매개변수가 없는 메소드");
	}
	
	// 반환형이 있는 메소드
	int print2() {
		System.out.println("반환형이 int형이고 매개변수가 없는 메소드");
		int result = 1;
		return result;
	}
	
	String print3() {
		System.out.println("반환형이 문자열이고 매개변수가 없는 메소드");
		return "반환하는 문자";
	}
	
	boolean print4() {
		System.out.println("반환형이 불리언이고 매개변수가 없는 메소드");
		boolean re = 5 > 3;
		return re;
		// return true;
	}
	
	void print5(int x) {
		System.out.println(x);
	}
	
	int print6(int x) {
		int y = 10;
		return x+y;
	}
	
	String print7(int x) {
		int re = x * 5;
		System.out.println(re);
		return "* 연산함";
	}
	
	int print8(int x, int y) {
		int re = x+y;
		return re;
	}
	
	void print9(String str, int z) {
		System.out.println("입력한 문자열 : " + str);
		System.out.println("입력한 숫자 : " + z);
	}
	
	String print10(double d1, String str, boolean b1, int num) {
		System.out.println(str);
		System.out.println(!b1);
		System.out.println(d1*num);
		return "여러 매개변수 받기";
	}
	
}







