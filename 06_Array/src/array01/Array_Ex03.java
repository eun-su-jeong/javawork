package array01;

public class Array_Ex03 {

	public static void main(String[] args) {
		// 1. 총점, 평균 구하기
		int score[] = {100, 97, 56, 75, 90};
		
		int sum = 0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		double avg = (double)sum / score.length;
		
		System.out.println("점수의 합계 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);
		
		// 2. 최대값, 최소값 구하기
		int num[] = {65, 26, 59, 98, 3, 73, 16, 84, 36, 8};
		int max = num[0];
		int min = num[0];
		
		for(int i=1; i<num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
			if(min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		// index번호에 연산 가능
		int k = 3;
		System.out.println(num[0+k]);
		System.out.println(num[0+8]);
		System.out.println(num[2*3]);
	}
}
