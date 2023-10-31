package casting03;

public class Ch01_promotion {

	public static void main(String[] args) {
		byte b1 = 20;
		short s1 = b1;
		
		int int1 = b1;
		int1 = s1;
		System.out.println(int1);
		
		double d1 = int1;
		System.out.println(d1);
		
		char ch1 = 'A';
		int intCh = ch1;
		System.out.println("영문자 'A'의 유니코드 : " + intCh);
		
		char ch2 = '김';
		int intCh2 = ch2;
		System.out.println("한글 '김'의 유니코드 : " + intCh2);
		System.out.println("한글 \"김\"의 유니코드 : " + intCh2);
	}
}
