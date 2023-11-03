package string04;

import java.util.Arrays;
import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str = new String(bytes);
		System.out.println(str);
		
		String str2 = new String(bytes, 6, 4);  // (객체,시작 index번호, 갯수)
		System.out.println(str2);
		
		// index에 해당하는 문자 1개 얻어오기
		String str3 = "abcdefg";
		char ch = str3.charAt(3);
		System.out.println(ch);
		
		// 모두 대문자로 변환
		String upperCase = str3.toUpperCase();
		System.out.println(upperCase);
		
		int indexCD = str3.indexOf("cd");
		int indexD = str3.indexOf('d');
		System.out.println(indexCD);
		System.out.println(indexD);
		
		String bookName = "자바 프로그램";
		
		// 문자, 문자열이 시작하는 index번호 반환(-1이면 없는 글자)
		if(bookName.indexOf("자바") > -1)
			System.out.println("자바 책 입니다");
		else
			System.out.println("자바 책이 아닙니다");
		
		// concat(String) : 2개의 문자열 연결
		String str4 = "java";
		String str5 = str4.concat(" program");
		String str6 = str4 + " program";
		System.out.println(str4 + " program");
		
		// contains(charSequence s) : 글자가 포함되어 있으면 true 반환
		boolean re = str6.contains("java");
		System.out.println(re);
		
		// replace(char old, char newChar) : 글자를 변경하여 문자열로 반환
		System.out.println(str5.replace('a', 'e'));
		
		// split(String regex, int limit) : regex를 기준으로 나누어 배열로 반환
		String str7 = "Cat/Dog/Hamster/Bear";
		String[] strArr = str7.split("/");
		System.out.println(Arrays.toString(strArr));
		System.out.println(strArr[1]);
		
		String[] strArr2 = str7.split("/", 3);
		System.out.println(Arrays.toString(strArr2));
		System.out.println(strArr2[2]);
		
		// substring(int startIndex, int EndIndex) : index를 기준으로 그 뒤의 글자를 가져와서 문자열로 반환
		//           : EndIndex 바로 직전까지 얻어옴
		String str8 = "JavaOracleSpringBoot";
		System.out.println(str8.substring(4, 10));
		System.out.println(str8.substring(4));  // index번호부터 끝까지 모두
		
		/*
		substring으로 주민번호를
		사용자로 부터 받기 (123456-1234567)
		
		123456-1****** 출력하기
		*/
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력(-포함) : ");
		String jumin = sc.next();
		
		String reJumin = jumin.substring(0, 8) + "******";		
		System.out.println(reJumin);
		
		System.out.println(jumin.substring(0, 8) + "******");
		*/
		// trim() : 앞,뒤의 공백제거
		String stTrim = "     kim";
		String stTrim2 = "kim     ";
		System.out.println(stTrim);
		System.out.println(stTrim2 + ";");
		System.out.println("----------------------------");
		
		System.out.println(stTrim.trim());
		System.out.println(stTrim2.trim() + ";");
		System.out.println("----------------------------");
		
		String stTrim3 = "     kim     ";
		System.out.println(stTrim3 + ";");
		System.out.println(stTrim3.trim() + ";");
		
		String stTrim4 = "     kim    Hong   Lee    ";
		System.out.println(stTrim4.trim() + ";");		
	}
}