package var01;

public class Ch02_double {

	public static void main(String[] args) {
		double dou1 = 12.345;
		double dou2 = 46.2839;
		System.out.println(dou1 + ", " + dou2);
		
		/* int / int = int
		 * double / double = double
		 * double / int = double
		 * int / double = double 
		 */
		
		System.out.println(dou2/dou1);	// double / double = double
		System.out.println(10/3);		// int / int = int
		System.out.println(10/3.0);		// int / double = double
		
		// % 나머지
		int num1 = 15;
		int num2 = 4;
//		System.out.println("10/3의 몫 = " + 10/3);
//		System.out.println("10/3의 나머지 = " + 10%3);
		
		System.out.println(num1 + "/" + num2 + "의 몫 = " + (num1 / num2));
		System.out.println(num1 + "/" + num2 + "의 나머지 = " + (num1 % num2));
	}
}
