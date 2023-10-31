package polyEx08;

public class Product {
	// 필드 : 제품의 가격, 보너스
	int price;
	int bonusPoint;
	
	// 생성자
	Product(int price) {
		this.price = price;
		bonusPoint = price / 10;
	}
}