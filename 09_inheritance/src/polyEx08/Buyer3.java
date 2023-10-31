package polyEx08;

import java.util.ArrayList;

public class Buyer3 {
	int money = 5000;
	int bonusPoint;
	ArrayList<Product> aList = new ArrayList<Product>();
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족으로 물건을 구매할 수 없음");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		aList.add(p);
		
		System.out.println(p + " 구입");
	}
	
	void refund(Product p) {
		if(aList.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + " 반품");
		} else {
			System.out.println("구입한 상품이 아니라 반품 불가");
		}
	}
	
	void buyList() {
		int sum = 0;
		String list = "";
		if(aList.isEmpty()) {
			System.out.println("구입한 제품이 없습니다");
			return;
		}
		
		for(int i=0; i<aList.size(); i++) {
			Product p1 = aList.get(i);
			sum += p1.price;
			list += (i==aList.size()-1) ? p1 : p1 + ", ";
		}

		System.out.println("구입한 물품의 총합계 : " + sum + "만원입니다");
		System.out.println("구입한 물품 list : " + list);
	}
}