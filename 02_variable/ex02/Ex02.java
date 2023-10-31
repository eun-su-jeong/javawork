package ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 2.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나를 입력하세요 : ");
		char ch1 = sc.next().charAt(0);
		/*
		int reCh1 = ch1;
		System.out.println(ch1 + "의 unicode : " + reCh1);
		*/
		System.out.println(ch1 + "의 unicode : " + (int)ch1);
		
		// 3.
		/*
		System.out.println("국어점수 입력 : ");
		int kor = sc.nextInt();
		System.out.println("영어점수 입력 : ");
		int eng = sc.nextInt();
		System.out.println("수학점수 입력 : ");
		int math = sc.nextInt();
		*/
		System.out.println("국어, 영어, 수학 점수 입력 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		// double avg = (double)sum / 3;
		// double avg = sum / (double)3;
		// double avg = (double)sum / (double)3;
		double avg = sum / 3.0;
		
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f", avg);
		
		// 4.
		int iNum1 = 10;
        int iNum2 = 4;
        
        float fNum = 3.0f;
        
        double dNum = 2.5;
        
        char ch = 'A';
        
        System.out.println( iNum1 / iNum2 ); // 몫 : 2
        System.out.println( (int)dNum ); // 2
        
        System.out.println( iNum2 * dNum ); // 10.0
        System.out.println( (double)iNum1 ); // 10.0
        
        System.out.println( (double)iNum1 / iNum2 ); // 2.5
        System.out.println( dNum ); // 2.5
        
        System.out.println( (int)fNum ); // 3
        System.out.println( iNum1 / (int)fNum ); // 3

        System.out.println( iNum1 / fNum ); // 3.3333333
        System.out.println( (double)iNum1 / fNum );   // 3.3333333333333335
        
        System.out.println( ch ); // 'A'
        System.out.println( (int)ch ); // 65
        System.out.println( (ch + iNum1) ); // 75 연산 때문에 자동형변환
        System.out.println( (int)ch + iNum1 ); // char형을 int형으로 강제형변환 + int형

        System.out.println( (char)(ch + iNum1) ); // 'K'
	}

}
