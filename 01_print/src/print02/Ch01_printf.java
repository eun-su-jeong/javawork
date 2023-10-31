package print02;

public class Ch01_printf {

	public static void main(String[] args) {
		// 십진수 출력
		System.out.printf("%d\n", 3);
		System.out.printf("%d, %d\n", 5, 8);
		System.out.printf("%d, %d\n", 123456, 8923898);
		
		// 8진수 출력
		System.out.printf("%o\n", 9);
		
		// 16진수 출력
		System.out.printf("%x\n", 13);
		System.out.printf("%X\n", 13);
		
		// 실수형 출력
		System.out.printf("%f\n", 3.123432345345);
		
		// 문자 1개 출력
		System.out.printf("%c\n", 'm');
		
		// 문자열 출력
		System.out.printf("%s\n", "abcdef");
		
		// boolean타입 출력
		System.out.printf("%b\n", true);
		System.out.printf("%b\n", 6 >= 3);
		
		// 올해는 2023년 10월 이고, 우리나라의 평균키는 164.8 입니다 
		System.out.printf("올해는 %d년 %d월 이고, 우리나라의 평균키는 %f 입니다\n", 2023, 10, 164.8);
		
		// 이 과정의 정원은 '20'명이고, 현재는 '9'명 수강중 입니다. 평균 '23.5'% 달성했습니다
		System.out.printf("이 과정의 정원은 %d이고, 현재는 %d명 수강중 입니다. 평균 %f%% 달성했습니다", 20, 9, 23.5);
	}
}
