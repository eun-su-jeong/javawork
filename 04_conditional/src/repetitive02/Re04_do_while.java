package repetitive02;

import java.util.Scanner;

public class Re04_do_while {

	public static void main(String[] args) {
		/*
		 - 조건을 나중에 확인하므로 무조건 조건과 상관없이 1번은 반드시 실행한다
			do{
				
			}while(조건식);
		*/
		boolean b1 = false;
		while(b1) {
			System.out.println("while 조건식");
		}
		
		do {
			System.out.println("do-while 조건식");
		} while(b1);
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		do {	
			System.out.print("1. for문 설명, 2.while문 설명, 3.do-while문 설명, 끝내려면 0 입력: ");
			num = scan.nextInt();
			switch(num) {
			case 1:
				System.out.println("조건이 정해져 있을 때 사용하면 좋음");
				break;
			case 2:
				System.out.println("특정 조건에 도달했을 때 break사용하여 종료할 때 사용");
				break;
			case 3:
				System.out.println("조건을 나중 따지므로 무조건 1번은 실행됨");
			}
		}while(num != 0);
		System.out.println("프로그램 종료");
	}
}
