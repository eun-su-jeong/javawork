package inOverriding03;
// 오버라이딩 : 상속에서 자식이 부모의 메소드의 원형은 그대로 하고 실행내용만 다르게 정의
//			  오버라이딩한 자식의 메소드가 호출됨
class F {
	void show() {
		System.out.println("부모 클래스 show()메소드 호출");
	}
	void play(String title) {
		System.out.println("부모 클래스에서 " + title +"을 플레이합니다.");
	}
}
class G extends F {
	// 오버라이딩
	@Override
	void show() {
		System.out.println("자식 클래스 show()메소드 호출");
	}
	// 오버로딩 : 매개변수의 갯수가 다르거나 자료형 달라야 됨
	void play(int aa) {
		System.out.println("자식 클래스에서 " + aa +"을 플레이합니다.");
	}
}

public class OverridingTest1 {
	public static void main(String[] args) {
		G g = new G();
		g.show();
		g.play("영화");
		g.play(4);
	}
}
