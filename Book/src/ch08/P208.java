package ch08;

public class P208 {

	public static void main(String[] args) {
		
		P206 p = new P207();
		
		p.run();
		
		// �ڽ�Ŭ������ �ڷ������� ��ȯ(��������ȯ)
		P207 c = (P207)p;
		c.eat();
		
	}
}
