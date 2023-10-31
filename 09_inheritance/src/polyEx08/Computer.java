package polyEx08;

public class Computer extends Product{
	// 생성자 : 부모 생성자가 매개변수로 받는 생성자이면
	//			반드시 자식에게도 생성자가 필요(부모의 매개변수로 전달할 값)
	Computer() {
		super(1000);
	}
	@Override
	public String toString() {
		return "computer";
	}
}

