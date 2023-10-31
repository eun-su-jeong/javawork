package abs01;

// 추상클래스 : 추상메소드가 1개이상 있으면 반드시 추상클래스로 만들어야 함
public abstract class Pet {
	private String kind;
	private String color;
	
	Pet(String kind, String color){
		this.kind = kind;
		this.color = color;
	}
	// 추상메소드 : 선언부만 있고 실행부분이 없는 메소드
	public abstract void sound();
	public abstract void pattern();
}
