package ch08;

public class P197 { // SmartPhoneMain
	
	public static void main(String[] args) {
		
		Phone p = new Phone();
		p.name = "��ȭ��";
		p.company = "����";
		p.color = "ȭ��Ʈ";
		
		System.out.println("Phone ���");
		System.out.println(p.name);
		System.out.println(p.company);
		System.out.println(p.color);
		p.call();
		p.receive();
		
		SmartPhone sp = new SmartPhone();
		sp.name = "������";
		sp.company = "�Ｚ";
		sp.color = "��";
		
		System.out.println("SmartPhone ���");
		System.out.println(sp.name);
		System.out.println(sp.company);
		System.out.println(sp.color);
		sp.call();
		sp.receive();
		sp.installApp();
		
	}
	
}
	


