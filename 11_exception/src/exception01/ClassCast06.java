package exception01;

public class ClassCast06 {

	public static void main(String[] args) {
		ClassCast06.changeIf(new Animal());
		ClassCast06.changeIf(new Dog());
		ClassCast06.changeIf(new Cat());
		
		System.out.println("--------------------------");
		
		ClassCast06.changeTry(new Animal());
		ClassCast06.changeTry(new Dog());
	}
	
	// Dog 클래스만 사용
	public static void changeTry(Animal ani) {
		try {
			Dog dog = (Dog)ani;
			System.out.println("Dog클래스로 형변환");
		} catch(ClassCastException e) {
			System.out.println("클래스 형변환 불가");
		}
	}
	
	public static void changeIf(Animal ani) {
		if(ani instanceof Dog) {
			Dog dog = (Dog)ani;
			System.out.println("Dog클래스로 형변환");
		} else if(ani instanceof Cat) {
			Cat cat = (Cat)ani;
			System.out.println("Cat클래스로 형변환");
		} else {
			System.out.println("클래스 형변환 불가");
		}
	}
}