package ch06;

// Ŭ���� ����
class A{
	int m = 3;
	void print(){
		System.out.println("��ü ���� �� Ȱ��");
	}
}

public class p219CreateObjectAndUsageOfMembers {
	
	public static void main(String[] args) {
		// Ŭ������ ��ü ����
		A a = new A();
		
		// Ŭ���� ��� Ȱ��
		// @�ʵ� Ȱ�� : �ʵ忡 ���� �б�/����
		a.m = 5;
		System.out.println(a.m);
		
		// @�޼��� Ȱ�� : �޼��带 ȣ��
		a.print();
	}

}
