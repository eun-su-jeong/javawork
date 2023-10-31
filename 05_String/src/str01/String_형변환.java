package str01;

public class String_형변환 {

	public static void main(String[] args) {
		// 문자 -> 숫자로 형변환
		String str1 = "100";
		int num1 = Integer.parseInt(str1);
		double dou1 = Double.parseDouble(str1);
		
		System.out.println(dou1);
		System.out.println(num1+10);
		System.out.println(str1+10);

		// 숫자 -> 문자로 형변환
		int num2 = 50;
		double dou2 = 78.12;
		
		String str2 = String.valueOf(num2);
		String str3 = String.valueOf(dou2);
		
		System.out.println(str2 + 90);
	}
}
