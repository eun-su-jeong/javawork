package inOut01;

import java.io.File;
import java.io.IOException;

public class File01 {
	// 간단한 파일 만들때
	// java.io.File 클래스
	public static void main(String[] args) {	
		try {			
			File f1 = new File("test.txt");
			f1.createNewFile();	// 반드시 createNewFile()메소드를 호출해야 생성됨

			// File f2 = new File("C:\\test01.txt");
			File f2 = new File("C:/Users/애드인에듀/test01.txt");
			f2.createNewFile();

			// mkdir : 폴더생성 명령어
			File folderMk = new File("C:/Users/애드인에듀/temp");
			folderMk.mkdir();

			File f3 = new File("C:/Users/애드인에듀/temp/test02.txt");
			f3.createNewFile();

			System.out.println("test.txt파일이 존재하는가? " + f1.exists());
			System.out.println("test03.txt파일이 존재하는가? " + new File("test03.txt").exists());

			System.out.println("test.txt가 파일인가? " + f1.isFile());
			System.out.println("temp는 파일인가? " + folderMk.isFile());	

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}