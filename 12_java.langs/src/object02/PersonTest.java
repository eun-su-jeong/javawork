package object02;

class Person {
	int id;
	public Person(int id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return id == ((Person)obj).id;
		} else {
			return false;
		}
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person(20231101);
		Person p2 = new Person(20231101);
		
		if(p1.equals(p2))
			System.out.println("p1의 값과 p2의 값이 같다");
		else
			System.out.println("p1의 값과 p2의 값이 다르다");
		
		if(p1==p2)
			System.out.println("p1과 p2의 객체가 같다");
		else
			System.out.println("p1과 p2의 객체가 다르다");
		
	}
}