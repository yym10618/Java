package ch07;

class Car{
	String color;
	String company;
	String type;
	
	public void go() {
		System.out.println("�����ϴ�.");
	}
	public void back() {
		System.out.println("�����ϴ�.");
	}
}
public class P144 {
	
	public static void main(String[] args) {
		
		Car tico = new Car();
		Car pride = new Car();
		
		tico.color = "ȭ��Ʈ";
		tico.company = "���";
		tico.type = "����";
		
		pride.color = "��";
		pride.company = "���";
		pride.type = "����";
		
		tico.go();
		pride.go();
		System.out.println(tico.color);
		System.out.println(tico.company);
		System.out.println(tico.type);
		System.out.println(pride.color);
		System.out.println(pride.company);
		System.out.println(pride.type);
	}

}
