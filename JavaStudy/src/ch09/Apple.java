package ch09;

public class Apple extends Object {
	
	private String country;
	private int pirce;
	
	public Apple(String country, int price) {
		this.country = country;
		this.pirce = price;
	}
	
	
	public void show() {
		System.out.println("��� ������ : "+this.country);
		System.out.println("��� ���� : "+this.pirce);
	}
	
	@Override
	public String toString() {
		show();
		return super.toString();
	}

}
