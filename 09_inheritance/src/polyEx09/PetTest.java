package polyEx09;

public class PetTest {

	public static void main(String[] args) {
		Pet pet = new Dog("흰색");
		pet.sound();
		pet.pattern();
		
		String kind = pet.getKind();
		System.out.println(kind);
		pet.getColor();
		pet.infor();
		System.out.println(pet);
		System.out.println("---------------------------");
		
		pet = new Frog();
		pet.sound();
		pet.pattern();
		System.out.println(pet);
		
		
	}

}
