package conditional01;

public class Con04_중첩if {

	public static void main(String[] args) {
		// if안에 if문이 중첩으로 들어감
		int num1 = 0;
		
		if(num1 > 100) {  // 100보다 큰수 모두
			if(num1 > 200) // 200보다 큰수 모두
				System.out.println("200보다 큰 숫자");
			else	// 100~200
				System.out.println("100보다 크고, 200보다는 작은수");			
		} else { // 100보다 작은수 모두
			if(num1 > 0)  // 100~1
				System.out.println("100보다 작은 양수");
			else if(num1 == 0)  // 0
				System.out.println("0이다");
			else
				System.out.println("음수");
		}
	}

}
