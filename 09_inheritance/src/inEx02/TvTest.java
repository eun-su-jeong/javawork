package inEx02;

public class TvTest {

	public static void main(String[] args) {
		AiTv ai = new AiTv();
		ai.power();
		ai.setChannel(11);
		System.out.println("현재 채널 : " + ai.getChannel());
		
		System.out.println(ai.internet("java"));
		
		System.out.println(ai.genre("스릴러"));
		ai.setVolume(17);
		System.out.println("현재 볼륨 : " + ai.getVolume());
		ai.power();
	}
}
