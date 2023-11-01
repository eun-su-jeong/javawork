package exception01;

public class NumberFormat04 {

	public static void main(String[] args) {
		String strNum[] = {"23","17","123abc","3.141592"};
		int i = 0;
		try {
			for(i=0; i<strNum.length; i++) {
				int result = Integer.parseInt(strNum[i]);
				System.out.println("숫자로 변환된 값 : " + result);
			}
			/*
			for(String num : strNum) {
				int result = Integer.parseInt(num);
				System.out.println("숫자로 변환된 값 : " + result);
			}
			*/
		} catch(NumberFormatException ne) {
			System.out.println("'" + strNum[i] + "'는 숫자로 변경불가");
		}	
	}
}