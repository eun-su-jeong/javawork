package inOut01;

import java.io.*;

public class CharStream03 {

	public static void main(String[] args) {
		/*
		 문자 기반 스트림
		 - 문자 스트림 : 데이터를 2byte 단위로 전송하는 통로
		 - 기반 스트림: 외부매체와 직접적으로 연결되는 통로
		 
		 xxxReader : 입력용 스트림
		 xxxWriter : 출력용 스트림
		 */
		fileSave();
		fileRead();
	}
	public static void fileSave() {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("b_char.txt");
			
			fw.write("한글 가능");
			fw.write("d");
			fw.write("\n");
			
			char[] arr = {'A','d','d','i','n','e','d','u'};
			fw.write(arr);
			fw.write("\n");
			
			char[] arrStr = {'김','길','동'};
			fw.write(arrStr);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void fileRead() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("b_char.txt");
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value); // 유니코드로 출력
				
			}
		} catch (IOException  e) {
			e.printStackTrace();
		}
	}
}
