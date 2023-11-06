package ex13;

import java.util.*;

public class BookController {
	ArrayList<Book> bookList = new ArrayList<Book>();
	BookController() {
		bookList.add(new Book("자바의 정석","남궁 성","기타",20000));
		bookList.add(new Book("쉽게 배우는 알고리즘","문병로","기타",15000));
		bookList.add(new Book("대화의 기술","다니엘","인문",17500));
		bookList.add(new Book("암 정복기","박신우","의료",21000));
	}
	public void insertBook(Book book) {
		bookList.add(book);
	}
	public ArrayList<Book> selectList() {
		return bookList;
	}
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<Book>();
		for(Book book : bookList) {
			if(book.getTitle().contains(keyword))
				searchList.add(book);
		}
		return searchList;
	}
	public Book deleteBook(String title, String author) {
		Book book = null;
		for(int i=0; i<bookList.size(); i++) {
			if(title.equals(bookList.get(i).getTitle()) && author.equals(bookList.get(i).getAuthor())) {
				book = bookList.remove(i);
				break;
			}
		}
		return book;
	}
	public int ascBook() {
		bookList.sort(null);
		return 1;
	}
}