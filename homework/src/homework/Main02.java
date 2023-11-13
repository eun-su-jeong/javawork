package homework;

public class Main02 {

	public static void main(String[] args) {
		
		System.out.println(add(3, 5));
		System.out.println(subtract(4, 9));
		System.out.println(multiply(6, 8));
		System.out.println(divide(70, 5));
	}
	public static int add (int num1, int num2) {
		return num1 + num2;
	}
	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}
	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	public static int divide(int num1, int num2) {
		return num1 / num2;
	}

}


