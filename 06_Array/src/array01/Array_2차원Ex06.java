package array01;

public class Array_2차원Ex06 {

	public static void main(String[] args) {
		// 2차원 배열에 각 학생(5명)별 점수 입력
		// 국어, 영어, 수학
		int score[][] = {{95, 100, 78},
						 {68, 57, 100},
						 {62, 97, 85},
						 {85, 83, 69},
						 {86, 74, 38}};
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------");
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		
		for(int i=0; i<score.length; i++) {	
			int sum = 0;
			korSum += score[i][0];
			engSum += score[i][1];
			mathSum += score[i][2];			
			
			System.out.print(i+1 + "\t");
			
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.print(score[i][j] + "\t");				
			}
			double avg = (double)sum / score[i].length;
			System.out.printf("%d\t%.1f\n", sum, avg);
		}
		System.out.println("=============================================");
		System.out.print("총점\t"+korSum+"\t"+engSum+"\t"+mathSum+"\n");
		System.out.printf("%s\t%.1f\t%.1f\t%.1f", "평균", korSum/(double)5, engSum/(double)5, mathSum/(double)5);
		/*
		  번호  국어  영어  수학  총점  평균
		 -------------------------------
		   1  95   100   78   273  83.3
		   2  68   57    100   273  83.3
		   3  62   97    85   273  83.3
		   4  85    83   69   273  83.3
		   5  86    74   38   273  83.3
		 -------------------------------
		 총점   479   500  387 
		 평균  95.0  100.0 78.3
		 */

		
		
		
		
		
		
		
		
		

		
		
		// System.out.printf("%5s%5s%5s%5s%5s%5s\n", "번호","국어","영어","수학","총점","평균");
	}

}
