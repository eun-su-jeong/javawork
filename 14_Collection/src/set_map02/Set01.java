package set_map02;

import java.util.*;

public class Set01 {

	public static void main(String[] args) {
		Object[] objArr = {"1","2","2","3","3","3","4","4","4","4","4"};
		Set set1 = new HashSet();
		
		for(Object obj : objArr) {
			set1.add(obj);
		}
		
		System.out.println("set의 길이 : " + set1.size());
		System.out.println(set1);
	}
}