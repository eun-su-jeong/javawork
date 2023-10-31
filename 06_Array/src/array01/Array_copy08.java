package array01;

import java.util.Arrays;

public class Array_copy08 {
	public static void main(String[] args) {
		int[] oldScore = {90, 87, 69, 97, 100};

		int[] newScore = new int[10];
		
		for(int i=0; i<oldScore.length; i++) {
			newScore[i] = oldScore[i]; 
		}
		newScore[5] = 78;
		System.out.println(Arrays.toString(newScore));
		
		System.arraycopy(oldScore, 1, newScore, 3, 4);
		System.out.println(Arrays.toString(newScore));
		
		String oldStr[] = {"java","python","oracle"};
		String newStr[] = new String[10];
		
		System.arraycopy(oldStr, 0, newStr, 2, 3);
		System.out.println(Arrays.toString(newStr));
		
		
	}

}
