package print01;

public class Ch02_println_String {

	public static void main(String[] args) {
		System.out.println("문자열 " + "두번째 문자열");
		// 문자열이 나오면 그 뒤는 모두 문자열로 인식
		System.out.println("문자열 " + 10 + 20);
		
		// 숫자로 시작하면 문자열이 나오기 전까지 숫자로 인식
		System.out.println(10 + 20 + " 문자열");
		
		// 결과 : 30문자열1020
		System.out.println(10 + 20 + "문자열" + 10 + 20);
		
		// 결과 : 30문자열30
		System.out.println(10 + 20 + "문자열" + (10 + 20));
	}
}
