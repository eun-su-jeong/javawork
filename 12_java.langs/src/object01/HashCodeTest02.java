package object01;

public class HashCodeTest02 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		String str3 = "def";
		String str4 = "def";
		
		System.out.println(str1.equals(str2)); //재정의
		System.out.println(str1.hashCode()); //재정의
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1)); // 
		System.out.println(System.identityHashCode(str2));
	}
}
