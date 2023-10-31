package com.addinedu.model.vo;

public class Book {
	// 도서명, 저자, 가격, 출판사
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	// 생성자
	public Book() {
	}
	
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	// setter, getter메소드 생성
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	// 모든 필드 값 반환하는 메소드
	public String information() {
		return title + ", " + author + ", " + price + ", " + publisher; 
	}
}
