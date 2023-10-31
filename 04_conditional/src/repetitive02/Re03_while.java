package repetitive02;

import java.util.Scanner;

public class Re03_while {

	public static void main(String[] args) {
		// for문을 while으로
		int flag = 1;	// 초기값
		while(flag <= 5) {	//조건
			System.out.println("flag의 값은 " + flag);
			flag++;	// 증감식
		}
		System.out.println();
		
		int sum = 0;
		int i = 1;
		while(i <= 100) {
			sum += i++;
			/*
			sum += i;
			++i;
			*/
		}
		System.out.println("1~100까지의 합 : " + sum);
		System.out.println("------------------------------");
		
		sum = 0;
		i = 0;
		while(sum <= 10) {
			sum += ++i;
			/*
			i++;
			sum += i;
			*/
		}
		System.out.println("1~" + i + "까지의 합 = " + sum);

		// break : 반복문을 빠져나온다(for, while, do-while)
		int count = 0;
		while(true) {
			System.out.println(++count);			
			if(count == 3)
				break;
		}
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("멈추려면 'q' : ");
			char ch = scan.next().charAt(0);
			
			if(ch == 'q')
				break;
		}
		System.out.println("프로그램 종료");
			
		
		while(true) {
			System.out.print("연산할 숫자와 연산자 입력(끝내려면 @을 넣으세요) ex> + 4 9 : ");
			char op = scan.next().charAt(0);
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			if(op == '@')
				break;
			
			System.out.println(num1 + "" + op + num2 + "=" + (num1+num2));	 
		}
		System.out.println("프로그램 종료");
	}
}
