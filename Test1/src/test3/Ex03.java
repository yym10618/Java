package test3;

/*
 * ��¥ : 2022/01/12
 * �̸� : ����
 * ���� : �ڹ� Ŭ���� ��������
 */
class Car{
	private String brand;
	private String name;
	private int price;
	
	public Car(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
		
	}
	
	public void drive() {
		System.out.println(name+" ���� ��...");
	}
	
	public void info() {
		System.out.println("�귣�� : "+brand);
		System.out.println("������ : "+name);
		System.out.println("��  �� : "+price);
	}
}

public class Ex03 {
	
	public static void main(String[] args) {
		
		Car sonata = null;
		Car bmw    = null;
		
		sonata = new Car("����", "�ҳ�Ÿ", 3000);
		bmw    = new Car("BMW", "520d", 5000);
		
		sonata.drive();
		sonata.info();
		
		bmw.drive();
		bmw.info();
	}

}
