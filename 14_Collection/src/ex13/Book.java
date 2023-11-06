package ex13;

import java.util.Objects;

public class Book implements Comparable<Book>{
	private String title;
	private String author;
	private String category;
	private int price;
	public Book() {
	}
	public Book(String title, String author, String category, int price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "(" + title + "/" + author + "/" + category + "/" + price + ")";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, category, price, title);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book b = (Book)obj;
			return (author.equals(b.author)) 
					&& (category.equals(b.category)) 
					&& (price == b.price) 
					&& (title.equals(b.title));
		}
		return false;
		/*		
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(category, other.category) && price == other.price
				&& Objects.equals(title, other.title);
		*/
	}
	/*
	 * 특정필드를 기준으로 정수값 반환
	 *  - 정수 일때
	 *    this.price < o.price => -1
	 *    this.price == o.price => 0
	 *    this.price > o.price => 1
	 *  - 문자열 일때
	 *    문자가 같을 때 => 0
	 *    다르면 => 음수 또는 양수  
	 */

	@Override
	public int compareTo(Book o) {
		// 숫자일 때
		// return this.getPrice() - o.getPrice();
		
		// 문자열 비교할 때
		return this.getTitle().compareTo(o.getTitle());
	}
}