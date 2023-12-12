package interface2;

public interface Boardinterface {
	//public static final 반드시 들어가야 하지만 안넣으면 컴파일 할때 알아서 처리해줌 
	//상수만 넣을수 있다
	//구현하지 않는다
	public static final int Max = 100;
	int Min = 0;
	
	void method();
	
	String select();
	int delete();
	int insert();
}
