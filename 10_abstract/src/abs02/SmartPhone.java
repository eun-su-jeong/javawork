package abs02;

public class SmartPhone extends Phone{

	SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void turnOn() {
		System.out.println("옆으로 밀어 전화를 받습니다");
	}

	@Override
	public void turnOff() {
		System.out.println("종료를 눌러 전화를 끊습니다");
	}
	
	void search(String search) {
		System.out.println(search + "를 찾았습니다");
	}
}
