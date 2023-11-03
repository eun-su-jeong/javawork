package exception01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch09 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("정수 입력 : ");
			int num2 = scan.nextInt();
			
			String[] strNum = {"3","4","a123"};
			int num = Integer.parseInt(strNum[2]);
			System.out.println(strNum[4]);
				
		// catch문이 여러개일 때는 위에부터 순서대로 내려가면서 맞는 exception을 찾는다	
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위 넘어섰습니다");
		} catch(InputMismatchException e) {
			System.out.println("입력값은 정수로 넣으세요");
		} catch(NumberFormatException e) {
			System.out.println("정수로 변환할 수 없습니다");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}