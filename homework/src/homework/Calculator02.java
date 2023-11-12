package homework;

public class Calculator02 {

	public static void main(String[] args) {
		
		System.out.println(Add(3, 5));
		System.out.println(Subtract(4, 9));
		System.out.println(Multiply(6, 8));
		System.out.println(Divide(70, 5));
	}
	public static int Add (int num1, int num2) {
		return num1 + num2;
	}
	public static int Subtract(int num1, int num2) {
		return num1 - num2;
	}
	public static int Multiply(int num1, int num2) {
		return num1 * num2;
	}
	public static int Divide(int num1, int num2) {
		return num1 / num2;
	}

}


