package ch07;

public class P145 {
	
	public static void main(String[] args) {
		
		// Car Ÿ���� �迭��ü ����
		Car[] cars = new Car[3];
		
		// car ��ü ����
		Car tico = new Car();
		tico.color = "ȭ��Ʈ";
		tico.company = "���";
		tico.type = "����";
		
		// ��� �ε����� tico ��ü ����
		for(int i=0 ; i<cars.length ; i++) {
			cars[i] = tico;
		}
		
		System.out.println("2�� �ε��� color : "+cars[2].color);
		
		cars[0].color = "��"; // 0�� �ε��� ��ü�� color �ʵ忡 "��" ����
		
		System.out.println("2�� �ε��� color : "+cars[2].color);
		
	}

}
