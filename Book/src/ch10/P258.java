package ch10;

public class P258 { // A main
	
	public static void main(String[] args) {
		
		P257 a = new P257();
		
		// static ��� Ŭ���� ��ü ����
		P257.B b = new P257.B();
		b.var1 = 3;
		b.method1();
		P257.B.var2 = 3;
		P257.B.method2();
		
		// �ν��Ͻ� ���� Ŭ���� ��ü ����
		P257.C c = a.new C();
		c.var1 = 3;
		c.method1();
		
		// ���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
	}
}
