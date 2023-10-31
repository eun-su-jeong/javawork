package casting03;

public class Ch03_castingOp {

	public static void main(String[] args) {
		// int형 보다 작은 자료형을 연산하면 int형으로 형변환됨
		byte b1 = 10;
		byte b2 = 20;
		
		byte result = (byte)(b1 + b2);
		int result2 = b1 + b2;
		
		char c1 = 'A';
		char c2 = (char)(c1 + 1);
		int c3 = c1 + 1;
		System.out.println(c2);
		System.out.println(c3);
		
		int int1 = 100;
		int int2 = 3;
		int result3 = int1 / int2;
		System.out.println(result3);
		
		int int3 = 100;
		double dou1 = 3;
		double result4 = int3 / dou1;
		int result5 = (int)(int3/dou1);
		
		int int4 = 100;
		int int5 = 3;
		double re = (double)int4 / int5; 	// 33.3333333
		double re2 = int4 / int5; 	// 33.0
	}
}
