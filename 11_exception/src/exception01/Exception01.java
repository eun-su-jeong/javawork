package exception01;

public class Exception01 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);

		try {
			// 예외가 발생할 수 있는 경우
			System.out.println(3);
			int result = 30/0;
			System.out.println(4);
		} catch(Exception e) {
			// 예외가 발생했을 때 실행
			System.out.println(5);
		}	
	
		System.out.println(6);
	}
}