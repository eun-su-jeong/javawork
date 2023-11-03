package set_map02;

import java.util.HashSet;
import java.util.Set;

class Member {
	String name;
	int age;
	public Member() {
	}
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

	
	@Override
	public int hashCode() {
		return name.hashCode()   +age;
		//return Objects.hash(age, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return (member.age == age) && (member.name.equals(name));
		}
		return false;
	}
}

public class Set02 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 20));
		set.add(new Member("홍길동", 20));
		System.out.println(set.size());
	}
}