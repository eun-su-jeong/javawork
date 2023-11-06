package set_map02;

import java.util.*;

public class TreeSet07 {

	public static void main(String[] args) {
		int[] arrInt = {1,4,3,6,7,1,6,4,6,8};  // 10개 중 중복:4개
		
		TreeSet<Integer> ts = new TreeSet<>();
		for(Integer o : arrInt) {
			ts.add(o);
		}
		
		System.out.println(Arrays.toString(arrInt));
		System.out.println(ts);	// 오름차순 정렬로 출력
		
		// 내림차순 정렬 : descendingSet()
		NavigableSet<Integer> descend = ts.descendingSet();
		System.out.println(descend);
	}
}