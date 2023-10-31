package op01;

public class Ch04_logical {

	public static void main(String[] args) {
		// 논리합과 논리곱
		/*
		 *  x  y  논리합(&&)   논리곱(||)
		 *  0  0	  0			0
		 *  0  1	  0			1
		 *  1  0	  0			1
		 *  1  1	  1			1
		 */
		
		int num1 = 10;
		int num2 = 20;
		
		boolean re1 = num1 > num2 && num1 < num2;
		System.out.println(re1);
		
		re1 = num1 > num2 || num1 < num2;
		System.out.println(re1);
		System.out.println("---------------------");
		
		// ! : not
		boolean b1 = num1 >= num2;
		System.out.println(!b1);
		System.out.println(!!b1);
		System.out.println("---------------------");
		
		// A : 65, a :97
		char ch1 = 'K';
		System.out.println("ch1 : " + ch1);
		System.out.println("소문자 인가?" + (ch1 >= 'a' && ch1 <= 'z'));
		System.out.println("대문자 인가?" + (ch1 >= 'A' && ch1 <= 'Z'));
		/*
		    65, 66, 67 ... 90, ...
		... 65, 66, 67,... 90
		*/
		
		
	}
}
