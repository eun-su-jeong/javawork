package object01;

import java.util.Date;

public class GetClass05 {
	public static void main(String[] args) {
		Card c1 = new Card("HEART", 10);
		
		// getClass() : 객체 얻어오기
		Class cObj = new Card().getClass(); // 재정의한 것은 가져오지 않음
		Class cObj2 = c1.getClass();
		try {
			Class cObj3 = Card.class.forName("Card");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(c1);
		System.out.println(cObj.getName());
		System.out.println(cObj.toString());
		
		System.out.println(cObj2.getName());
		System.out.println(cObj2.toString());
		
		
	}
}