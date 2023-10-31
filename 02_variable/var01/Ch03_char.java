package var01;

public class Ch03_char {

	public static void main(String[] args) {
		char ch1 = 'a';
		char ch2 = '김';
		char ch3 = '&';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		char ch4 = 'A' + 1;
		System.out.println(ch4);
		char ch5 = 'A';
		// char re = ch5 + 1;  // 자동형변환 때문에 오류
		
		System.out.println("---------------");
		char ch6 = 'A' + '1';  // 유니코드 : 65(A)+49(1) = 114(r)
		System.out.println(ch6);
	}
}
