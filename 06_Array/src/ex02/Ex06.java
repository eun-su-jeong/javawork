package ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.
		/*
		System.out.print("배열의 길이 입력 : ");
		int num = sc.nextInt();
		
		int iArr[] = new int[num];
		int sum = 0;
		
		for(int i=0; i<iArr.length; i++) {
			System.out.print("배열 [" + i +"] index에 넣을 값 입력 : ");
			iArr[i] = sc.nextInt();
			sum += iArr[i];
		}
		System.out.println(Arrays.toString(iArr));
		System.out.println("총합 = " + sum);
		*/
		
		//2.
		// 풀이 1.

		while(true) {
			System.out.print("정수 입력 : ");
			int num2 = sc.nextInt();
			int iArr2[] = new int[num2];
			
			if(num2 % 2 == 1 && num2 >= 3) {				
				int count = 1;
				for(int i=0; i<num2; i++) {
					if(i < num2/2) 
						iArr2[i] = count++;
					else
						iArr2[i] = count--;
				}
			} else {
				System.out.println("다시 입력하세요");
				continue;
			}
			System.out.println(Arrays.toString(iArr2));
			break;
		}

		// 풀이 2.
		/*
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		
		if(num2 % 2 == 1 || num2 > 3) {
			int iArr2[] = new int[num2];
			int count = 1;
			for(int i=0; i<num2; i++) {
				if(i < num2/2) 
					iArr2[i] = count++;
				else
					iArr2[i] = count--;
			}
			System.out.println(Arrays.toString(iArr2));
		} else {
			System.out.println("다시입력하세요");
			System.out.print("정수 입력 : ");
			num2 = sc.nextInt();
		}
		*/
		// 3.
		/*
		String chickens[] = {"후라이드","양념","파닭","간장"};
		System.out.print("치킨 이름을 입력하세요 : ");
		String menu = sc.next();
		
		boolean flag = false;
		for(int i=0; i<chickens.length; i++) {
			if(menu.equals(chickens[i])) {
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println(menu + "치킨 배달 가능");
		else
			System.out.println(menu + "는 없는 메뉴입니다.");
		*/
		
		// 4.
		/*
		System.out.print("주민번호 입력(-포함) : ");
		String jumin = sc.next();
		
		char[] origin = new char[jumin.length()];
		for(int i=0; i<origin.length; i++) {
			if(i<8)
				origin[i] = jumin.charAt(i);
			else
				origin[i] = '*';
		}
		System.out.println(origin);
		*/
		/*		
		4.
		주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
		단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		
		ex.
		주민등록번호(-포함) : 123456-1234567
		123456-1******
		
		5.
		
		*/
		/*
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			 System.out.println("-----------------------------------------------------");
			 System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			 System.out.println("-----------------------------------------------------");
			 System.out.print("선택> ");
			 
			 int selectNo = Integer.parseInt(scanner.nextLine());
			 
			 if (selectNo == 1) {
				 System.out.print("학생 수 입력 : ");
				 studentNum = sc.nextInt();
				 scores = new int[studentNum];
			 } else if (selectNo == 2) {
				 for(int i=0; i<scores.length; i++) {
					 System.out.print("scores[" + i + "]>");
					 scores[i] = sc.nextInt();
				 }
			 } else if (selectNo == 3) {
				 // System.out.println(Arrays.toString(scores));
				 for(int i=0; i<scores.length; i++) {
					 System.out.println("scores[" + i + "]>" + scores[i]);
				 }
			 } else if (selectNo == 4) {
				 int max = 0, sum = 0;
				 for(int i=0; i<scores.length; i++) {
					 max = max < scores[i] ? scores[i] : max;
					 sum += scores[i];
				 }
				 System.out.println("최고 점수 : " + max);
				 System.out.printf("평균 점수 : %.2f\n", (double)sum / scores.length);
			 } else if (selectNo == 5) {
				 run = false;
			 }
		 }
		 System.out.println("프로그램 종료");*/
	}
}
