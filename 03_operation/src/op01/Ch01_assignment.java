package op01;

public class Ch01_assignment {

	public static void main(String[] args) {
		int num1 = 10;
				
		num1 += 10;  	// num1 = num1 + 10;
		System.out.println("num1 + 10 = " + num1);
		
		num1 = 10;
		num1 -= 5;		// num1 = num1 - 5;
		System.out.println("num1 - 5 = " + num1);
		
		num1 = 10;
		num1 *= 3;		// num1 = num1 * 3;
		System.out.println("num1 * 3 = " + num1);
		
		num1 = 10;
		num1 /= 3;		// num1 = num1 / 3;
		System.out.println("num1 / 3 = " + num1);
		
		num1 = 10;
		num1 %= 3;		// num1 = num1 % 3;
		System.out.println("num1 % 3 = " + num1);
		
		int num2 = 3_000_000;  // 100,000,000 사람이 볼때 편하게 하기위해
		int num3 = 2_000;
		
		long re = num2 * num3;
		System.out.println(re);
	}
}
