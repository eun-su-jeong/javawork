package object01;

import java.util.Date;

class Card {
	String kind;
	int number;
	Card() {
		this("SPADE", 1);
	}
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "kind : " + kind + ", numer : " + number;
	}
	
}
public class ToString03 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("HEART", 10);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println(c1);
		
		// String, Date 클래스는 toString() 오버라이딩이 되어 있다
		String str = new String("korea");
		Date today = new Date();
		
		System.out.println(str);
		System.out.println(today);
	}
}