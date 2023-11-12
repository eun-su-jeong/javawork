package homework;

public class Calculator01 {

	public static void main(String[] args) {
		Add add = new Add();
		Subtract subtract = new Subtract();
		Multiply multiply = new Multiply();
		Divide divide = new Divide();
		
		System.out.println(add.Add(3, 5));
		System.out.println(subtract.Subtract(4, 9));
		System.out.println(multiply.Multiply(6, 8));
		System.out.println(divide.Divide(70, 5));
	}

}


