package exception01;

public class Throw10 {
	// throw는 강제로 예외 발생을 시킬 때 사용	
	
	public static void main(String[] args) {
		try {
			// int num = 3/0;
			
			Exception e = new Exception("고의로 예외 발생시킴");
			throw e;			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("예외 발생");
		}
	}
}