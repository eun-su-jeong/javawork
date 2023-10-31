package com.addinedu.run;

import java.util.Scanner;

import com.addinedu.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		// 복습 1.
		Book b1 = new Book();
		b1.setTitle("혼자 공부하는 자바");
		b1.setAuthor("신용권");
		b1.setPrice(32000);
		b1.setPublisher("한빛미디어");
		
		Book b2 = new Book("마이바티스 프로그래밍","이동국",25000,"에이콘");
		
		Book b3 = new Book();
		// 사용자로 부터 입력받아 필드에 값 저장하기
		Scanner scan = new Scanner(System.in);

		System.out.print("도서명 입력 : ");
		b3.setTitle(scan.nextLine());
		System.out.print("저자 입력 : ");
		b3.setAuthor(scan.nextLine());
		System.out.print("가격 입력 : ");
		b3.setPrice(scan.nextInt());
		System.out.print("출판사 입력 : ");
		b3.setPublisher(scan.next());
		
		System.out.print("도서명 입력 : ");
		String title2 = scan.nextLine();
		System.out.print("저자 입력 : ");
		String author2 = scan.nextLine();
		System.out.print("가격 입력 : ");
		int price2 = scan.nextInt();
		System.out.print("출판사 입력 : ");
		String publisher2 = scan.next();
			
		Book b4 = new Book(title2, author2, price2, publisher2);

		// 일반 변수에 3권의 책을 입력

		Book book1 = null;
		Book book2 = null;
		Book book3 = null;
		
		for(int i=1; i<=3; i++) {
			System.out.print("도서명 입력 : ");
			String title = scan.nextLine();
			System.out.print("저자 입력 : ");
			String author = scan.nextLine();
			System.out.print("가격 입력 : ");
			int price = scan.nextInt();
			System.out.print("출판사 입력 : ");
			String publisher = scan.next();
			
			// 매번 검사
			if(i==1)
				book1 = new Book(title, author, price, publisher);
			else if(i==2)
				book2 = new Book(title, author, price, publisher);
			else
				book3 = new Book(title, author, price, publisher);
		}
		
		System.out.println(book1.information());
		System.out.println(book2.information());
		System.out.println(book3.information());
		
		// 도서 제목으로 검색
		System.out.print("검색할 책 제목 : ");
		String search = scan.nextLine();
		
		if(book1.getTitle().equals(search))
			System.out.println(book1.information());
		else if(book2.getTitle().equals(search))
			System.out.println(book2.information());
		else
			System.out.println(book3.information());
		
	}

}
