package objTv06;

public class Tv {
	String company = "LG";
	String model = "울트라ai";
	int inch = 65;
	int volume;
	int channel = 1;
	boolean power;
	
	void power() {
		power = !power;
		if(power)
			System.out.println("Tv를 켭니다");
		else
			System.out.println("Tv를 끕니다");
	}
	int channerUp() {
		channel += 2;
		return channel;
	}
	int channerDown() {
		channel -= 2;
		return channel;
	}
	int volume(int volume) {
		this.volume = volume;
		return this.volume;
	}	
}
