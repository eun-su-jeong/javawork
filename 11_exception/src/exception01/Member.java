package exception01;

public class Member {
	private String name;
	private int age;
	private char gender;
	
	Member(){}
	Member(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "회원명 : " + name  + "회원나이 : " + age + "성별 : " + gender;
	}
}

