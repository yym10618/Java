package test4;

/*
 * ��¥ : 2022/01/12
 * �̸� : ����
 * ���� : �ڹ� APIŬ���� ��������
 */
class Apple{
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("������ : "+country);
		System.out.println("���� : "+price);
	}
}

class Banana{
	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("������ : "+country);
		System.out.println("���� : "+price);
	}
}

class Grape extends Object{
	private String country;
	private int price;
	
	public Grape(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("������ : "+country);
		System.out.println("���� : "+price);
	}
}
public class Ex06 {
	
	public static void main(String[] args) {
		
		Ex06 test = new Ex06();
		
		Apple apple = new Apple("�ѱ�", 3000);
		Banana banana = new Banana("�ʸ���", 2000);
		Grape grape = new Grape("�̱�", 3000);
		
		test.showInfo(apple);
		test.showInfo(banana);
		test.showInfo(grape);
	}
	
	public void showInfo(Object fruit) {
		
		if(fruit instanceof Apple) {
			Apple apple = (Apple)fruit;
			apple.show();
		}else if(fruit instanceof Banana){
			Banana banana = (Banana)fruit;
			banana.show();
		}else if(fruit instanceof Grape) {
			Grape grape = (Grape)fruit;
			grape.show();
		}
	}

}
