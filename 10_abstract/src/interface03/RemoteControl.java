package interface03;

public interface RemoteControl {
	// 상수
	public static final int MAX_VOLUME = 100;
	// public static final을 붙이지 않으면 컴파일시 자동으로 붙인다 
	int MIN_VOLUME = 0;
	
	public abstract void turnOn();
	// public abstract붙이지 않으면 컴파일시 자동으로 붙인다 
	void turnOff();
	void setVolume(int volume);
	
	// jdk 1.8버전부터 추가됨
	//default 메소드 : 실행문을 넣을 수 있다
	// 재정의 하지 않으면 아래 케소드 실행, 재정의 하념 재정의한 메소드 호출
	default void setMute(boolean mute) {
		System.out.println("나중에 추가된 메소드");
		if(mute) {
			System.out.println("무음처리완료");
		}else {
			System.out.println("무음처리해제");
		}
	}
	
	//static메소드 : 실행문을 넣을 수 있다
	static void info() {
		System.out.println("static() 메소드 호출 가능");
	}
}
