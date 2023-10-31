package var01;

public class Ch01_int {

	public static void main(String[] args) {
		// * 기본자료형
		// 정수 : int(long)
		// 실수 : double(float)
		// 문자 1개 : char(유니코드 사용)
		// 참, 거짓 : boolean
		
		// * 참조자료형
		// 문자열 : String
		int num1;
		num1 = 10;
		System.out.println(num1);
		
		num1 = 30;
		System.out.println(num1);
		
		int num2 = 100;
		System.out.println(num2);
		System.out.println(num1);
		
		System.out.println("------------------------------");
		System.out.println("30+100=" + (num1 + num2));
		System.out.println("100-30=" + (num2 - num1));
		System.out.println("30*100=" + num1 * num2);
		System.out.println("100/30=" + num2 / num1);
		
		System.out.println("------------------------------");
		int result = num1 + num2;
		System.out.println(result);
		
		int result2 = result * 20;
		System.out.println(result2);
	}
}
