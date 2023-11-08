package objStream02;

import java.io.FileOutputStream;
import java.io.*;

public class ObjectDao {
	// FileOutputStream : 기반스트림 1byte
	// ObjectOutputStream : 객체단위로 출력할 수 있도록 도움을 주는 보조스트림
	//						ObjectWriter없음
	public void fileSave() {
		Phone ph1 = new Phone("아이폰", 1300000);
		Phone ph2 = new Phone("갤럭시", 2000000);
		Phone ph3 = new Phone("갤럭시노트", 1800000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))) {
			oos.writeObject(ph1);
			oos.writeObject(ph2);
			oos.writeObject(ph3);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	// FileInputStream : 기반스트림 1byte
	// ObjectInputStream : 객체단위로 가져올 수 있도록 도움을 주는 보조스트림
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))) {
			// EOFException : 파일의 끝을 만나는 순간 예외 발생
			/*
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			*/
			while(true) {
				System.out.println(ois.readObject());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) { 	// IOException 전에 처리해야 함
			System.out.println("파일 끝");
		} catch(IOException e) {
			e.printStackTrace();
		} 
	}
}