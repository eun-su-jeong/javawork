package ex10;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryController {
	private Member mem = new Member();
	private ArrayList<Book> bList = new ArrayList<Book>();
	
	public void insertMember(Member m) {
		this.mem = m;
	}
	/*
	private ArrayList<Member> mList = new ArrayList<Member>();	
	
	public void insertMember() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("추가할 멤버의 이름, 나이, 성별을 입력해 주세요");
		String name1 = sc.next();
		int age1 =sc.nextInt();
		char gender1 = sc.next().charAt(0);
		
		mem.setName(name1);
		mem.setAge(age1);
		mem.setGender(gender1);
		mList.add(mem);
	}
	*/
	
	public void myInfo() {
		System.out.println(mem);		
	}
	
	public void insertBook() {
		bList.add(new Book("java","신용권","한빛미디어"));
		bList.add(new Book("oracle","아무개","DBi"));
		bList.add(new Book("spring","홍길동","스프링"));
	}
	
	public ArrayList<Book> selectAll() {
		return bList;
	}
	
	public Book searchBook(String keyword) {
		Book book = null;
		
		for(int i=0; i<bList.size(); i++) {
			if(bList.isEmpty()) {
				System.out.println("책이 없습니다");
				break;
			} else if(keyword.equals(bList.get(i).getTitle())) {
				book = bList.get(i);
				break;
			}
		}
		return book;
	}
	
	public int rentBook(int index) {
		return index;
	}
}