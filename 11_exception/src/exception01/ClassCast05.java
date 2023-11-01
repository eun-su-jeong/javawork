package exception01;

class Animal{
	
}
class Dog extends Animal{

}
class Cat extends Animal{
	
}

public class ClassCast05 {
	public static void main(String[] args) {
		try {
			Dog dog1 = new Dog();
			Animal ani = dog1;
			Dog dog2 = (Dog)ani;
			System.out.println("Dog형변환");
			
			Animal ani2 = new Animal();
			Cat cat = (Cat)ani2;
			System.out.println("Cat형변환");

		}catch(ClassCastException ce) {
			System.out.println("클래서 형변환 불가");
		}
	}

}
