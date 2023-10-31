package print02;

public class Ch02_printf_digit {

	public static void main(String[] args) {
		System.out.printf("%7d\n", 32000);
		System.out.printf("%7d\n", 132000);
		System.out.printf("%7d\n", 7800);
		System.out.printf("%7d\n\n", 2132000);
		
		System.out.printf("%07d\n", 32000);
		System.out.printf("%07d\n", 132000);
		System.out.printf("%07d\n", 7800);
		System.out.printf("%07d\n", 2132000);
		
		System.out.println("---------------------------");
		
		System.out.printf("[%10s]\n", "abcdefg");
		System.out.printf("[%-10s]\n", "abcdefg");
		System.out.printf("[%s]%n", "abcdefg");
		
		System.out.println("---------------------------");
		
		System.out.printf("%10.2f\n", 13.567);
		System.out.printf("%.3f\n", 123435.687968);
	}
}
