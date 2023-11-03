package system03;

import java.util.Scanner;

public class System01 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long startNano = System.nanoTime();
		for(int i=1; i<1000; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		long endTime = System.currentTimeMillis();
		long endNano = System.nanoTime();
		System.out.println(endTime-startTime);
		System.out.println(endNano-startNano);
		
		Scanner sc = new Scanner(System.in);
	}

}