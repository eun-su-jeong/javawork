package conditional01;

import java.util.Scanner;

public class Con03_multi_if {

	public static void main(String[] args) {
		// 사용자로 부터 점수를 입력받아 학점 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		
		if(score > 100)
			System.out.println("100점이상의 점수는 넣을 수 없습니다");
		else if(score >= 90)   // 100~90
			System.out.println("A학점");
		else if(score >= 80) // 89~0 중에서 89~80
			System.out.println("B학점");
		else if(score >= 70) // 79~0 중에서 79~70
			System.out.println("C학점");
		else if(score >= 60)
			System.out.println("D학점");
		else if(score >= 0)
			System.out.println("F학점");
		else
			System.out.println("음수는 점수가 될 수 없습니다");
		
		
//	... 103, 102, 101      -1, -2, -3 ...
		if(score > 100 || score < 0)
			System.out.println("점수를 잘못 입력하였습니다");
		else if(score >= 90 && score <= 100)
			System.out.println("A학점");
		else if(score >= 80 && score <= 89)
			System.out.println("B학점");
		else if(score >= 70 && score <= 79)
			System.out.println("C학점");
		else if(score >= 60 && score <= 69)
			System.out.println("D학점");
		else
			System.out.println("F학점");
		
		
		if(score > 100 || score < 0)
			System.out.println("점수를 잘못 입력하였습니다");
		else if(score >= 90)   // 100~90
			System.out.println("A학점");
		else if(score >= 80) // 89~0 중에서 89~80
			System.out.println("B학점");
		else if(score >= 70) // 79~0 중에서 79~70
			System.out.println("C학점");
		else if(score >= 60)
			System.out.println("D학점");
		else
			System.out.println("F학점");
	}
}
