package exception01;

public class Throw10 {

	public static void main(String[] args) {
		try {
			//int num = 3/0
			
			Exception e = new Exception("고의로 발생시킹");
			throw e;	//throw 강제로 예외 발생을 시킬때 사용
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("예외발생");
		}
		

	}

}
