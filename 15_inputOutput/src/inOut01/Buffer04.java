package inOut01;

import java.io.*;

public class Buffer04 {
	/*
	보조스트림 : 기반스트림으로 부족한 성능을 향상시켜주는 스트림
			   기반스트림에서 제공하지 않는 추가적인 메소드 제공(데이터 전송속도 향상 등)
			>> 외부매체와 직접적으로 연결되는 스트림이 아님 
			   단독사용불가(반드시 기반스트림과 함께 사용) 	
	*/
	public static void main(String[] args) {
		// fileSave();
		fileRead();
	}
	
	public static void fileSave() {
		// FileWriter
		// BufferedWriter : 버퍼라는 공간을 제공해주는 보조스트림(속도 향상)
		
		/*
		1. 기반스트림 생성
		2. 보조스트림 생성
		*/
		// FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			/*
			fw = new FileWriter("c_buffer.txt");
			bw = new BufferedWriter(fw);
			*/
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			bw.write("안녕\n");
			bw.write("곧 즐거운 점심시간이야");
			bw.newLine(); // BufferedWriter에 있는 메소드 : 줄바꿈
			bw.write("와 맛있겠다");
			
		} catch (IOException e) { 
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/*
		try-with-resource 구문으로 자원반납까지 간단하게 작업할 수 있다
		jdk7 버전이상부터 사용가능
		try(try블럭내에서 사용할 스트림 객체 생성 구문) {
		
		} catch {
		
		}
		*/
		
		// 알아서 bw2.close() 해줌
		try(BufferedWriter bw2 = new BufferedWriter(new FileWriter("d_buffer.txt"))) {
			bw.write("안녕\n");
			bw.write("곧 즐거운 점심시간이야");
			bw.newLine(); // BufferedWriter에 있는 메소드 : 줄바꿈
			bw.write("와 맛있겠다");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void fileRead() {
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}