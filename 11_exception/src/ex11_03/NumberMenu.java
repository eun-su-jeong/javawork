package ex11_03;

import java.util.Scanner;

public class NumberMenu {
    public void menu() {
        NumberController controller = new NumberController();

		Scanner scan = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = scan.nextInt();
		System.out.print("정수2 : ");
		int num2 = scan.nextInt();
        
        try {
            boolean check = controller.check(num1, num2);
            System.out.println(num1 + "은(는) " + num2 + "의 배수인가 ? " + check);
        } catch (NumRangeException e) {
            System.out.println("예외 처리: " + e.getMessage());
        }
    }
}