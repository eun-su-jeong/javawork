package exception01;

import java.util.ArrayList;

public class LibraryController {
	private Member mem = new Member();
	private Book book = new Book();
	
	private ArrayList<Book> bList = new ArrayList<Book>();
	
	public void insertMember(Member m) {
		this.mem = m;
	}
	public void myInfo() {
		System.out.println(mem);
	}
	public void insertBook() {
		bList.add(new Book("java", "신용권", "한빛미디어"));
		bList.add(new Book("Oracle", "아무개", "DBi"));
		bList.add(new Book("spring", "홍길동", "스프링"));
	}
	
	public ArrayList<Book> selecAll(){
		return bList;
	}
	public Book searchBook(String keyword) {
		Book book = null;
		
		for(int i = 0; i < bList.size(); i++) {
			if(bList.isEmpty()) {
				System.out.println("책이 없습니다");
				break;
			}else if(keyword.equals(bList.get(i).getTitle())) {
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
