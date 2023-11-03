package ex12_05;

import java.util.Scanner;

public class Ex12_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("----------------------------------------");
			System.out.println(" 1. 모든 문자를 대문자로 변환");
			System.out.println(" 2. 문자열에서 문자가 몇번 출현하는지 횟수 반환");
			System.out.println(" 3. 글자 변경하기");
			System.out.println(" 0. 프로그렘 종료");
			System.out.println();
			
			System.out.print("원하는 작업을 선택하세요 : ");
			String selection = scan.nextLine();
			
			System.out.println();
			
			switch (selection) {
			case "1":
				System.out.print("문자열을 입력하세요 : ");
				String str = scan.nextLine();				
				System.out.println(toUpper(str));
				break;
				
			case "2":
				System.out.print("문자열을 입력하세요 : ");
	        	String input = scan.nextLine();

	        	System.out.print("찾을 문자를 입력하세요 : ");
	        	char targetChar = scan.next().charAt(0);
	        	scan.nextLine();
	        	
	        	int count = charCount(input, targetChar);
	       		System.out.println("문자열 '" + input + "'에서 '" + targetChar + "'가 " + count + "번 나타납니다.");
				break;
			
			case "3":
				System.out.print("문자열을 입력하세요 : ");
	        	String input2 = scan.nextLine();

	       		System.out.print("바꿀 문자열을 입력하세요 : ");
	        	String oldStr = scan.nextLine();

	        	System.out.print("새 문자열을 입력하세요 : ");
	        	String newStr = scan.nextLine();

	        	String result = strReplace(input2, oldStr, newStr);
	       		System.out.println("변경된 문자열 : " + result);
				break;
				
			case "0":
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default:
				System.out.println("잘못 선택했습니다");	
			}
		}
	}
	
	public static String toUpper(String str) {
        return str.toUpperCase();
    }
	
	public static int charCount(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
	
	public static String strReplace(String str, String old, String newStr) {
        return str.replace(old, newStr);
    }

}