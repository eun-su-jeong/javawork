package homework;

public class Calculator01 {

	public static void main(String[] args) {
		Add add = new Add();
		Subtract subtract = new Subtract();
		Multiply multiply = new Multiply();
		Divide divide = new Divide();
		
		System.out.println(add.add(3, 5));
		System.out.println(subtract.subtract(4, 9));
		System.out.println(multiply.multiply(6, 8));
		System.out.println(divide.divide(70, 5));
	}

}


