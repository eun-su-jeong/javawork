package ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 5. 실습문제
		/*
		키보드로 입력 받은 값들을 변수에 저장하고 저장된 변수의 값을 다음과 같이 출력하시오
		이 때, 성별이 'M'이면 남학생, 'M'아 아니면 여학생으로 출력하시오.
		
		ex.
		이름 : 이준기
		학년(숫자만) : 2
		반(숫자만) : 7
		번호(숫자만) : 3
		성별(M/F) : M
		성적(소수점 둘째 짜리까지) : 97.35
		
		2학년 7반 3번 이준기 남학생의 성적은 97.35이다.
		*/
		/*
		System.out.print("성별 입력(M/F) : ");
		char g1 = sc.next().charAt(0);
		String re2 = g1 == 'M' ? "남" : "여";
		System.out.println(re2);
		
		int a = 2;
		int b = 7;
		int c = 3;
		String d = "이준기";
		double e = 96.78456;
		
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다", a,b,c,d,re2,e);
		*/
		// 7
		// 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		int kor = 60;
		int eng = 98;
		int math = 64;
		int sum = kor + eng + math;
		double avg = sum / 3.0;

		String aa = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "합격" : "불합격";
		System.out.println(aa);

		// 8. 실습문제
		/*
		주민번호를 입력받아 남자인지 여자인지 출력하기
		
		ex.
		주민번호를 입력하세요(- 포함) : 123456-3123456
		
		여자
		*/
		/*
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String str = sc.next();
		char gender = str.charAt(7);
		char gender = sc.next().charAt(7);  // 1,2,3,4
		
		String result = (gender == '1' || gender == '3') ? "남자" : "여자";
		System.out.println(result);*/
	}
}
