package exception01;

public class Throws11 {
	// Throws는 예외 떠넘기기
	public static void main(String[] args){
		try {
			change();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 없음");
		}
	}
	
	public static void change() throws ClassNotFoundException {
		Class class01 = Class.forName("java.lang.String2");
	}

}