package inOut01;

import java.io.*;

public class ByteStream02 {

	public static void main(String[] args) {
		// 바이트 기반 스트림
		/*
		바이트 스트림 : 1byte를 전송함(한글은 깨짐)
		기반 스트림 : 외부매체와 직접적으로 연결되는 통로
		
		- xxxInputSream : xxx매체로부터 데이터를 입력받는 통로(외부매체로 부터 데이터를 읽어옴)
		- xxxOutputSream : xxx매체로 데이터를 출력하는 통로(외부매체로 부터 데이터를 내보냄(쓰기))
		*/
		// fileSave();
		fileRead();
	}
	
	public static void fileSave() {
		// FileOutputStream : 파일과 직접적으로 연결하여 1바이트 단위로 출력하는 스트림
		/*
		 * 1. 스트림 생성(통로만들기)
		 * 2. 스트림 데이터를 출력(메소드 활용)
		 * 3. 다 사용한 후에 스트림 반납
		 */
		
		FileOutputStream fout = null;
		
		try {
			/* FileOutputStream("파일명", true(or false))
			 * - false(기본값) : 파일에 데이터가 있어도 덮어쓰기함 
			 * - true : 파일에 데이터가 있으면 이어서 쓰기를 함
			 */
			// 1. 스트림 통로 생성
			fout = new FileOutputStream("a_byte.txt"); // 파일이 없으면 만들고 있으면 그파일을 이용
			
			// 2. 스트림 데이터를 출력 
			fout.write(65);
			fout.write('b');
			
			byte[] arr = {97, 99, 100};
			fout.write(arr);		// 문자로 저장
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 3. 스트림 반납(반드시해야함)
		try {
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void fileRead() {
		// FileInputStream : 파일로 부터 데이터를 1바이트 단위로 입력하는 스트림
		/*
		 * 1. 스트림 생성(통로만들기)
		 * 2. 스트림 데이터를 입력받아옴(메소드 활용)
		 * 3. 다 사용한 후에 스트림 반납
		 */	
		FileInputStream fin = null;
		
		try {
			// 1. 스트림 생성(통로만들기)
			fin = new FileInputStream("a_byte.txt");
			
			// 한글자씩 유니코드표의 숫자 출력
			/*
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			*/
			// fin.read는 => while(조건에서도 파일을 읽고) { 파일을 읽고 }
			// 하나씩 건너 뛰어서 출력됨
			/*
			while(fin.read() != -1) {
				System.out.println(fin.read());
			}
			*/
			
			// 반드시 fin.read() 호출은 한번만해야 한글자 출력
			// 위의 해결방법 1.
			/*
			while(true) {
				int value = fin.read();
				if(value == -1) {
					break;
				}
				System.out.println(value);
			}
			*/
			
			// 해결방법 2. : 권장하는 방법
			int result = 0;
			while((result = fin.read()) != -1) {
				System.out.print((char)result);
			}		
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 3. 닫기
		try {
			fin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}