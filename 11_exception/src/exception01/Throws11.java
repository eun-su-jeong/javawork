package exception01;

public class Throws11 {
	//Throws 는 예외 떠넘기기
	public static void main(String[] args) {
		try {
			change();
		}catch{
			System.out.println("클래스가 없음");
		}
	}
	
	public static void change(String str)throws ClassNotFoundException{
		int num = Integer.parseInt(str);

	}
