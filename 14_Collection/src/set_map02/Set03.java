package set_map02;

import java.util.*;

public class Set03 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		while(set.size() < 6) {
			set.add((int)(Math.random()*45)+1);
		}
		
		// 순서대로 출력
		// index없기 때문에 할 수 없음 => List로 변경후 사용
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
	}
}