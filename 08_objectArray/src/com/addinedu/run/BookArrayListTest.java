package com.addinedu.run;

import java.util.*;

import com.addinedu.model.vo.Book;

public class BookArrayListTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Book> al = new ArrayList<Book>();
		
		System.out.print("도서명 입력 : ");
		String title = scan.nextLine();
		System.out.print("저자 입력 : ");
		String author = scan.nextLine();
		System.out.print("가격 입력 : ");
		int price = scan.nextInt();
		scan.nextLine();
		System.out.print("출판사 입력 : ");
		String publisher = scan.nextLine();
		
		Book b1 = new Book(title,author,price,publisher);
		
		al.add(b1);
	}
}
