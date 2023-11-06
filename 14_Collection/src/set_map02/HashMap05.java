package set_map02;

import java.util.*;

public class HashMap05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		
		map.put("myId", "pw1234");
		map.put("20230001", "pw0001");
		map.put("20230002", "pw0002");
		
		System.out.println("id와 pw 입력 : ");
		String id = sc.next();
		String pw = sc.next();
		
		if(map.containsKey(id)) {
			// String value = (String)map.get(id);
			if(map.get(id).equals(pw)) {
				System.out.println("로그인 하였습니다");
			} else {
				System.out.println("pw가 틀립니다");
			}			
		} else {
			System.out.println("id가 일치하지 않습니다");
		}
		
	}

}