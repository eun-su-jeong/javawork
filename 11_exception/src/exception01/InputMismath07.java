package exception01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismath07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 3개 입력하세요");
		
		int sum =0;
		for(int i=1; 1<=3; i++) {
			System.out.print(i+ "번째 점수: " );
			try {
				int num =scan.nextInt();
				sum += num;
			}catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다 다시 입력하세요" );
				scan.next();
				i--;
				}
			}
			System.out.println("합계: " + sum);
			System.out.println("평균: " + sum / 3.0);
		}
		
	}       