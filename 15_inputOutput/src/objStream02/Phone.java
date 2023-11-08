package objStream02;

import java.io.Serializable;

// 객체 자체를 입출력하고자 하면 반드시 직렬화과정 필수
/*
 직렬화(serialization) : 객체를 스트림으로 만드는 작업
 					    멤버변수만 직렬화 대상이 됨
 사용하는 이유 : 객체를 만들어 놓은 것들은 언젠가는 소멸됨
 			  미리 파일로 저장해 놓으면 필요할 때 다시 복원하여 사용가능				    
*/

// implements Serializable 하면 직렬화 됨
public class Phone implements Serializable{
	private String name;
	private int price;
	
	public Phone() {
	}
	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Phone [name=" + name + ", price=" + price + "]";
	}
}