package interface2;

public class BoardeTest {

	public static void main(String[] args) {
		//Boardinterface bf = new BoardInterface();
		
		BoardImpl bi = new BoardImpl();
		// 자식객체를 부모로 형변환 가능 
		Boardinterface bf = new BoardImpl();
		
		System.out.println(bf.select());
		System.out.println(bf.delete());
		System.out.println(bf.insert());

	}

}
