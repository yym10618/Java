package ch07;

public class P174 {

	public static void main(String[] args) {
		
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("������");
		Car2 c3 = new Car2("����", "������");
		Car2 c4 = new Car2("black", "���", "ȭ����");
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		System.out.println("c3 = "+c3);
		System.out.println("c4 = "+c4);
	}
}
