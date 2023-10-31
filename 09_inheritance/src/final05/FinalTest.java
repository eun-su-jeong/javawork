package final05;
//클래스에 final을 붙이면 상속할 수 없음 
final class Final01 {
	
}

/*
class FinalInher extends Final01 {
	
}
*/

class Final02 {
	int num = 10;
	// 변수 앞에 final을 붙이면 상수가 됨 : 값이 한번 저장되면 변경불가
	final int NUM2 = 34;
	
	// 메소드 앞에 final을 붙이면 오버라이딩 불가
	final int play() {
		// NUM2 = 40; 다른값으로 변경 불가
		return NUM2;
	}
	int show() {
		return num;
	}
}
class Final02Infer extends Final02 {
	// 메소드 재정의 불가
	/*
	int play() {
		return 3;
	}
	*/
	@Override
	int show() {
		return 5;
	}
}
public class FinalTest {

	public static void main(String[] args) {
		
	}

}
