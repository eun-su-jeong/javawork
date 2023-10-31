package ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 3. 1~100까지 숫자를 맞추기 게임
		Scanner scan = new Scanner(System.in);
		int com = (int)(Math.random()*100) + 1;
		int user = 0;
		/*
		do {
			System.out.print("1~100 사이의 숫자를 입력하세요 : ");
			user = scan.nextInt();
			
			if(user > com) {
				System.out.println("더 작은 숫자를 입력해보세요");
			} else if(user < com){
				System.out.println("더 큰 숫자를 입력해보세요");
			}
		} while(user != com);
		System.out.println("축하합니다. 맞췄습니다.");
		*/
		// 4. 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		/*
		while(true) {
			System.out.print("숫자 입력 : ");
			user = scan.nextInt();
			
			if(user == 0) {
				System.out.println("1이상의 숫자를 다시 입력하세요.");
				continue;
			}
			for(int i=user; i>=1; i--) {
				if(i == 1)
					System.out.print(i + "\n");
				else
					System.out.print(i + ", ");
			}
			break;
		}
		*/
		// 5. 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		// 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요.
		
		// 1번째 답
		/*
		boolean change = true;
		while(change) {
			System.out.print("두 수를 입력하세요 ex> 56 8 : ");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			if(num1 == 0 || num2 == 0) {
				System.out.println("0보다 큰 숫자 입력");
				continue;
			}
			
			if(num1 >= num2) {
				for(int i=num2; i<= num1; i++)
					System.out.print(i + ", ");
			} else {
				for(int i=num1; i<= num2; i++)
					System.out.print(i + ", ");
			}
			change = false;
		}
		*/
		// 2번째 답
		boolean change = true;
		while(change) {
			System.out.print("두 수를 입력하세요 ex> 56 8 : ");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			if(num1 == 0 || num2 == 0) {
				System.out.println("0보다 큰 숫자 입력");
				continue;
			}
			// num1은 작은수 num2 큰수 넣고
			if(num1 > num2) {
				int tmp = num1;
				num1 = num2;
				num2 = tmp;
			}
			
			for(int i=num1; i<=num2; i++)
				System.out.print(i + ", ");
			
			change = false;
		}
	}

}
