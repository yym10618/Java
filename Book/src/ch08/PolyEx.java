package ch08;

public class PolyEx { //PolyEx
	
	public static void main(String[] args) {
		
		P207/*Child*/ c = new P207/*Child*/();
		
		c.run();
		
		// �θ�Ŭ������ �ڷ������� ����(�ڵ�����ȯ)
		P206/*Parent*/ p = new P207/*Child*/();
		p.run(); // �����ǵ� �޼��尡 ����
		// p.eat(); // ����
	}

}
