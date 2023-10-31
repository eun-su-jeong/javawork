package array01;

public class Array_2차원05 {

	public static void main(String[] args) {
		
		int[][] score = {{1, 2, 3, 4, 5},			//[0]
						 {4, 5, 6, 7, 8},			//[1]
						 {9,10,11,12,13}};			//[2]
		              // [0][1][2][3][4]
		System.out.println(score[1][2]);	// 6
		System.out.println(score[2][3]);	// 12
		
		System.out.println("score의 길이(행길이) : " + score.length);
		System.out.println("score[0]의 길이(열길이) :" + score[0].length);
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		int iArr[][] = new int[4][3];
		int count = 3;
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[0].length; j++) {				
				iArr[i][j] = count;
				count += 3;
				System.out.print(iArr[i][j] + " ");
			}
			System.out.println();
		}
		
		int iArr2[][] = {{1,2,3},
						 {4,5},
						 {6,7,8,9}};
		
		for(int i=0; i<iArr2.length; i++) {
			for(int j=0; j<iArr2[i].length; j++) {
				System.out.print(iArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
