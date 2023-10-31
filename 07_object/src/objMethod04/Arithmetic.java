package objMethod04;

public class Arithmetic {
	// 5칙연산 메소드 만들기
	int plus(int x, int y) {
		int re = x + y;
		return re;
	}
	int minus(int x, int y) {
		return x-y;
	}
	int multiply(int x, int y) {
		return x*y;
	}
	double divide(int x, int y) {
		return (double)x/y;
	}
	int remainder(int x, int y) {
		return x%y;
	}
}
