package ch07;

public class P176 {
	
	// static ����
	static int sVar;
	// staric �޼���
	static void sMethod() {
		
	}
	
	// �ν��Ͻ� ����
	int var;
	// �ν��Ͻ� �޼���
	void method() {
		
	}
	
	// static �ʱ�ȭ��
	static {
		sVar = 0; // static ����
		sMethod(); // static �޼���
		
		// ����(�ν��Ͻ� ����, �޼��� ��� �Ұ�)
//		var = 0; // �ν��Ͻ� ����
//		method(); // �ν��Ͻ� �޼���
	}
	
	// static �޼���
	static void sMethod2() {
		
		// ���� (static �޼��忡�� this Ű���� ���Ұ�)
//		this.sVar = 0; // static ����
//		this.sMethod(); // static �޼���
	}

}
