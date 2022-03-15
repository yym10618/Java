package ch09;

public class Banana {
	
	private String country;
	private int pirce;
	
	public Banana(String country, int price) {
		this.country = country;
		this.pirce = price;
	}
	
	
	public void show() {
		System.out.println("바나나 원산지 : "+this.country);
		System.out.println("바나나 가격 : "+this.pirce);
	}
	
	@Override
	public String toString() {
		show();
		return super.toString();
	}

}
