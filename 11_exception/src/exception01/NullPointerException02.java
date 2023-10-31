package exception01;

public class NullPointerException02 {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.toString());
		} catch(NullPointerException e) {
			System.out.println("데이터가 들어 있지 않습니다");
			System.out.println("예외메시지 : " + e);
		}
		System.out.println("끝까지 실행 완료");
	}

}