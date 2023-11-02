package object01;
class Value extends Object{
	int value;
	
	Value(int value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object o) {
		/*
		Value v = (Value)o;
		int num = v.value;					
		return value == num;
		*/
		
		//int num1 = ((Value)o).value;	
		return value == ((Value)o).value;
	}
}

public class Equals01 extends Object{
	public static void main(String[] args) {
		Value value1 = new Value(10);  
		Value value2 = new Value(10);  
		// 오버라이딩 하기 전에
		/*
		if(value1.equals(value2))
			System.out.println("value1과 value2가 주소가 같다");
		else
			System.out.println("value1과 value2가 주소가 다르다");
		*/
		// 오버라이딩 하고 난 후
		if(value1.equals(value2))
			System.out.println("value1과 value2가 값이 같다");
		else
			System.out.println("value1과 value2가 값이 다르다");
		
		if(value1 == value2)
			System.out.println("value1과 value2가 주소가 같다");
		else
			System.out.println("value1과 value2가 주소가 다르다");
		
		System.out.println("----------------------------------------");
		
		value1 = value2;
		
		if(value1.equals(value2))
			System.out.println("value1과 value2가 같다");
		else
			System.out.println("value1과 value2가 다르다");
	}
}