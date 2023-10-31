package singleton15;

// 싱글톤 : 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 기법
//		 : 실행클래스에서 객체를 만들지 못하도록 해야 함 
class Singleton {	
	// 정적필드
	private static Singleton signleton = new Singleton();
	
	// 생성자에 private을 붙여 객체를 생성할 수 없게 만든다
	private Singleton() {}
	
	// 정적 메소드 
	static Singleton getInstance() {
		return signleton;
	}	
}
public class SingletonTest15 {

	public static void main(String[] args) {
		// Singleton s1 = new Singleton();  // 불가
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		// 객체를 가리키고 있는 주소가 같은가?
		if(sing1 == sing2)
			System.out.println("같은 객체를 가리키고 있음");
		else
			System.out.println("다른 객체임");
	}
}
