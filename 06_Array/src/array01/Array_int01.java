package array01;

public class Array_int01 {

	public static void main(String[] args) {
		// 배열 : 같은 자료형을 연속된 저장공간에 저장함
		//       배열의 길이는 늘리거나 줄일 수 없다
		//		 int[] 변수명 = new int[갯수]	
		//		 int 변수명[] = new int[갯수]
		
		// 저장공간을 확보만하고 값은 나중에 넣을 때
		int arrayInt[] = new int[10];
		int[] arrayIn2 = new int[5];
		
		// 배열을 만들면서 값이 바로 넣을 때
		int arrayInt3[] = {1,2,3,4,5};
		//        index =  0,1,2,3,4
		
		System.out.println(arrayInt3[0]);
		System.out.println(arrayInt3[3]);
		System.out.println("--------------------------");
		
		arrayInt3[1] = 20;
		
		for(int i=0; i<=4; i++) {
			if(i==4)
				System.out.print(arrayInt3[i]);
			else
				System.out.print(arrayInt3[i] + ", ");
		}
		System.out.println("\n--------------------------");
		
		for(int i=0; i<=4; i++) {
			arrayInt3[i] = i*2;
		}
		
		for(int i=0; i<=4; i++) {
			if(i==4)
				System.out.print(arrayInt3[i]);
			else
				System.out.print(arrayInt3[i] + ", ");
		}
		System.out.println();
		
		int int1[] = {3,4,5,6,7,8,9,10,11};
		int int2[] = new int[10];
		System.out.println("int1의 길이 : " + int1.length);
		System.out.println("int2의 길이 : " + int2.length);
		
		for(int i=0; i<int1.length; i++)
			System.out.println(int1[i]);
		
		// 문제1. 
		/*
		1. 길이가 5인 배열 만들기
		2. 배열에 값을 for문으로 0,3,6,9,12를 넣기
		3. 각 배열을 돌면서 합계를 구하여 출력하기
		*/
	}

}
