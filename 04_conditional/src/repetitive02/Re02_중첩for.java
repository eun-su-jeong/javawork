package repetitive02;

public class Re02_중첩for {

	public static void main(String[] args) {
		// 중첩 for문
		for(int i=1; i<=3; i++) {
			for(int j=5; j<=10; j++) {
				System.out.println("i=" + i + ", j=" + j);
			}
			System.out.println();
		}
		// 구구단 2단 출력
		/*
		2*1=2
		2*2=4
		2*3=6
		...
		2*9=18
		
		3*1=3
		3*2=6
		*/		

		for(int dan=2; dan<=9; dan++) {
			for(int i=1; i<=9; i++) {
				// System.out.println(dan + "*" + i + "=" + dan*i);
				System.out.printf("%d*%d=%2d\n",dan, i, dan*i);
			}
			System.out.println();
		}
		
	}
}
