package ex13;

import java.util.*;

public class Run {

	public static void main(String[] args) {
		BookMenu bMenu = new BookMenu();
		bMenu.mainMenu();
		
		// 컬렉션 정렬
		/*
		 * - 클래스별로 기본정렬(오름차순정렬) : sort
		 * - 내림차순 정렬 : comparator구현 클래스 작성이 필요
		 */
		/*
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(4);
		
		System.out.println("정렬 전 : " + list);
		
		
		list.sort(null);
		// Collections.sort(list);	// 위와 같음
		System.out.println("정렬 후 : " + list);
		
		
		Comparator<Integer> comp = Collections.reverseOrder();
		list.sort(comp);
		
		list.sort(Collections.reverseOrder());
		System.out.println("내림차순 정렬 후 : " + list);
		System.out.println("------------------------------");
		
		List<String> strList = new ArrayList<String>();
		strList.add("이길동");
		strList.add("홍길동");
		strList.add("김길동");
		strList.add("박길동");
		strList.add("남길동");
		
		System.out.println("정렬 전 : " + strList);
		
		strList.sort(null);
		System.out.println("정렬 후 : " + strList);
		
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("자바의 정석","남궁 성","기타",20000));
		bookList.add(new Book("쉽게 배우는 알고리즘","문병로","기타",15000));
		bookList.add(new Book("대화의 기술","다니엘","인문",17500));
		bookList.add(new Book("암 정복기","박신우","의료",21000));
		
		System.out.println("정렬 전 : " + bookList);
		
		// Book에는 여러 필드가 있는데 그중에서 어떤 필드를 기준으로 정렬할 것인지 정해지지 않아서 오류남
		// bookList.sort(null);
		Collections.sort(bookList);
		System.out.println("오름차순 정렬 후 : " + bookList);
		
		bookList.sort(Collections.reverseOrder());
		System.out.println("내림차순 정렬 후 : " + bookList);
		*/
	}

}