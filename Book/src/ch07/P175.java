package ch07;

public class P175 /* InitEx*/{ 
	
	// ������
	P175 /*InitEx*/(){
		System.out.println("������ ȣ��");
	}
	
	// static �ʱ�ȭ��
	static {
		System.out.println("Ŭ���� �ʱ�ȭ �� ����");
	}
	
	// �ν��Ͻ� �ʱ�ȭ ��
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ �� ����");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main �޼������");
		System.out.println("main init1 ��ü ����");
		P175 init1 = new P175();
		System.out.println("main init2 ��ü ����");
		P175 init2 = new P175();
	}


}
