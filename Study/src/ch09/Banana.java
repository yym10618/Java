package ch09;

public class Banana {
	
	private String country;
	private int pirce;
	
	public Banana(String country, int price) {
		this.country = country;
		this.pirce = price;
	}
	
	
	public void show() {
		System.out.println("�ٳ��� ������ : "+this.country);
		System.out.println("�ٳ��� ���� : "+this.pirce);
	}
	
	@Override
	public String toString() {
		show();
		return super.toString();
	}

}
