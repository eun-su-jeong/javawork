package args13;

public class MultiArgsTest {

	public static void main(String[] args) {
		// MultiArgsTest mt = new MultiArgsTest();
		// String str = mt.concatenate("","","","");
		String str = concatenate("a","b","c");
		System.out.println(str);
		
		String strArr[] = {"홍길동","아무개","이순신","kkk","iwoeir"};
		System.out.println(concatenate(strArr));
		System.out.println(con2("-","홍길동","아무개","이순신"));
		System.out.println(con2("/",new String[]{"1","2","3"}));
		System.out.println(con2(" ",strArr));		
	}

	static String concatenate(String... a) {
		String result = "";
		for(String str : a) {  
			result += str + ", ";
		}
		return result;
	}
	
	static String con2(String delim, String... b) {
		String result = "";
		for(String str : b) {
			result += str + delim;
		}
		return result;
	}
	
	/*
	String concatenate(String i, String a, String b, String c) {
		String result = "";
		result = i + a + b + c;
		return result;
	}
	*/
	

}
