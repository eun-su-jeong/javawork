package override1;

class ClassA{
	int num;
	String name;
	String abc;
	
	//생성자 오버로딩
	ClassA(){
		this(0,"아무개","안들어옴");
	}
	ClassA(int num, String name){
		this(num,name,"안들어옴");
		
	}
	ClassA(int num, String name, String abc){
		this.num = num;
		this.name = name;
		this.abc = abc;
		
	}
	
	void method() {
		System.out.println("부모 메소드");
	}
	
}

class ClassB extends ClassA{
	@Override
	void method() {
		System.out.println("자식 메소드");
	}
}

public class Override1 {
	public static void main(String[] args) {
		ClassA ca2 = new ClassA(2,"홍길동");
		ClassA ca = new ClassA(1,"홍길동","Hong");
		ClassA ca1 = new ClassA();
		
		ClassB cb = new ClassB();
		cb.method();
		
		ClassA ca3 = cb;

	}

}
