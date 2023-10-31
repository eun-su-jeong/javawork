package interface03;

public class RemoteTest {

	public static void main(String[] args) {
		// 인터페이스는 객체생성을 할 수 없다
		// 형변환 가능
		RemoteControl rc = null;
		Audio rcAudio = new Audio();
		      // 0x345
		Tv rcTv = new Tv();
		   //0x123
		
		rc = rcAudio;			// 0x345
		// rc = new Audio();	// 0x465
		rc.turnOn();
		rc.setVolume(-200);
		rc.turnOff();
		System.out.println();
		
		rc = rcTv;
		rc.turnOn();
		rc.setVolume(400);
		rc.turnOff();
		
		rc = rcAudio;			// 0x345
		// rc = new Audio()		// 0x897
		
		// 익명객체(새로운 클래스 정의)
		Tv tv = new Tv() {
			int a = 3;
			// 새롭게 만든 메소드 사용불가
			void tvShow() {
				System.out.println("익명객체 tvShow()메소드");
			}
			// 메소드 재정의 사용
			@Override
			public void turnOn() {
				System.out.println("Tv를 켭니다");
			}
		};
		
		// 인터페이스는 익명객체로 생성할 수 있다
		// 단 한번만 사용할 때 만들어 사용
		RemoteControl rc2 = new RemoteControl() {
			int volume=0;
			
			@Override
			public void turnOn() {
				System.out.println("익명객체에서 라디오를 켬");
			}

			@Override
			public void turnOff() {
				System.out.println("익명객체에서 라디오를 끔");
			}

			@Override
			public void setVolume(int volume) {
				if(volume > RemoteControl.MAX_VOLUME)
					this.volume = RemoteControl.MAX_VOLUME;
				else if(volume < RemoteControl.MIN_VOLUME)
					this.volume = RemoteControl.MIN_VOLUME;
				else
					this.volume = volume;
				
				System.out.println("익명객체의 라디오 볼륨 : " + this.volume);
			}
		};
		
		rc2.turnOn();
		rc2.setVolume(45);
		rc2.turnOff();
		System.out.println("--------------");
		
		rc.setMute(true);
		System.out.println("--------------");
		
		rc = new Radio();
		rc.turnOn();
		rc.setMute(true);
		RemoteControl.info();
		rc.turnOff();
		
	}
}
