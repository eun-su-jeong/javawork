package op01;

public class Ch02_increase {

	public static void main(String[] args) {
		// ++ 하나 증가
		int num1 = 10;
		num1++;
		System.out.println(num1);
		
		num1 = 10;
		num1--;	// 9
		num1--;	// 8
		num1++;	// 9
		System.out.println(num1);
		
		// 단항일 때는 연산자가 앞에 있으나 뒤에 있으나 결과가 똑같다 
		++num1;
		--num1;
		
		// 연산시 달라짐
		int num2 = 10;
		int num3 = 10;
		//			 1. 11   3. +  2. 11	
		int result = ++num2 + ++num3;
		System.out.println(result);
		
		num2 = 10;
		num3 = 10;
		result = ++num2 + num3++;  
		System.out.println(result);
		
		num2 = 10;
		num3 = 10;
		result = num2-- + ++num3;
		
		
		num2 = 10;
		num3 = 10;
		result = ++num2 + --num3;
		
		
		num2 = 10;
		num3 = 10;
		result = --num2 + num3--;
	}
}
