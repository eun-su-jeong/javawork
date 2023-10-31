package op01;

import java.util.Scanner;

public class Ch05_threeOp {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 7;
		
		// 삼항 연산자 : 조건식 ? 조건이 참일때 실행 : 조건이 거짓일때 실행
		
		String re = num1 < num2 ? "num1의 숫자가 더 크다" : "num1의 숫자가 더 작다";
		System.out.println(re);
		
		char re2 = num1 > num2 ? '대' : '소';
		System.out.println(re2);
		
		int num3 = -8;
		int re3 = num3 < 0 ? -num3 : num3;
		System.out.println(re3);
		
		// 사용자로 부터 점수 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		String re4 = score >= 80 ? "합격" : "불합격";
		System.out.println("시험에 " + re4 + "했습니다");
		
		String grade = 
				score > 100 ? "매길수 없습니다" :
				score >= 90 ? "A학점" : 
				score >= 80 ? "B학점" : 
				score >= 70 ? "C학점" :
				score >= 60 ? "D학점" : 
				score >= 0 ? "F학점" : "매길수 없습니다";
		System.out.println("당신의 학점은 " + grade);

	}

}
