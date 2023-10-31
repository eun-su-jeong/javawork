package polyEx08;

public class ProductArrayTest02 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv());
		b.buy(new Game());
		b.buy(new Computer());
		b.buyList();
	}
}
