package exSnack12;

public class Snack {
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	// 생성자 2개
	public Snack() {		
	}
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;	
	}
	
	// getter, setter 메소드
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getNumOf() {
		return numOf;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
	public String information() {
		return kind + ", " + name + ", " + flavor + ", " + numOf + ", " + price;
	}	
}
