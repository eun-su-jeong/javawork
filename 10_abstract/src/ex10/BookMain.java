package ex10;

import java.util.ArrayList;

public class BookMain {

	public static void main(String[] args) {
		LibraryController lc = new LibraryController();
		lc.insertBook();
		ArrayList<Book> bList = lc.selectAll();
		for(int i=0; i<bList.size(); i++) {
			System.out.println(bList.get(i));
		}
		/*
		Member mem = new Member("김수연", 23, '남');
		lc.insertMember(mem);
		*/
		lc.insertMember(new Member("김수연", 23, '남'));
		lc.myInfo();
		
		Book searchBook = lc.searchBook("java");
		if(searchBook == null) {
			System.out.println("찾는 책이 없습니다");
		} else {
			System.out.println(searchBook);
		}
		
		int index = lc.rentBook(5);
		if(index < bList.size()) {
			System.out.println("-------- 빌려주는 책 정보 --------");
			System.out.println(bList.get(index));
			System.out.println("책을 대여함");
		} else {
			System.out.println("책이 없습니다");
		}
	}
}