package exception01;

public class Finally08 {
	
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			// 예외가 발생할 수 있는 경우
			System.out.println(3);
			//int result = 30/0;
			System.out.println(4);
			return;
			
			}catch(Exception e) {
				// 예외가 발생했을 때
				System.out.println(5);
		}finally {
			// 실행이 되지 않는 경우는 없음
			System.out.println(6);
		}
		//try구문 안에 return이 있으면 실행되지 않음
		System.out.println(7);
		
	}

}
