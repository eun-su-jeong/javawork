package staticsbj;

//라이브러리 클래스
class StaticApi{
	int num = 10; // 인스턴스변순
	static int snum = 40; // 클래스 변수
	
	void method() {
		System.out.println("안녕 인스턴스메소드");
	}

	static void smethod() {
		System.out.println("잘가 클래스메소드");
	}
}



public class StaticMain {

	public static void main(String[] args) {
		StaticApi sa = new StaticApi();
		sa.num =20;
		System.out.println(sa.num);
		System.out.println(sa.snum);
		System.out.println(StaticApi.snum);
		
		StaticApi.smethod();
		sa.method();
	}

}