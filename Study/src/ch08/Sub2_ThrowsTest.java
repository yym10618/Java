package ch08;
/*
 * ��¥ : 2022/01/10
 * �̸� : ����
 * ���� : �ڹ� ���� ������ �ǽ��ϱ� ���� p273
 */
public class Sub2_ThrowsTest {
	
	public static void main(String[] args) {
		
		Calc c = Calc.getInstance();
		
		int r1 = c.plus(1, 4);
		int r2 = c.minus(1, 4);
		int r3 = c.multi(2, 4);
		
		int r4 = 0;
		
		try {
			// throws �޼��带 ȣ���Ҷ� ����ó��
			r4 = c.div(1, -1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
	}

}
