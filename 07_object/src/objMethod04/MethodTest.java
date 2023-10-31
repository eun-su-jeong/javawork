package objMethod04;

public class MethodTest {

	public static void main(String[] args) {
		Arithmetic am = new Arithmetic();
		System.out.println("7+8 = " + am.plus(7, 8));
		System.out.println("10+67 = " + am.plus(10, 67));
		System.out.println("198342-38294 = " + am.minus(198342, 38294));
		System.out.println("2938/45 = " + am.divide(2938, 45));
		System.out.printf("2938/45 = %.3f\n", am.divide(2938, 45));
		System.out.println("---------------------------");
		System.out.println(am.remainder(98, 8));
	}

}
