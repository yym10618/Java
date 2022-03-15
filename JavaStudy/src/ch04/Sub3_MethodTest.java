package ch04;

/*
 * ��¥ : 2022/01/04
 * �̸� : ����
 * ���� : �ڹ� �޼��� �ǽ��ϱ� ���� p152
 * 
 * �޼���(Method)
 *  - ���α׷��ֿ��� �Լ��� �ڹٿ��� Method
 *  - �Ϸ��� �ڵ������ ���ȭ�� ����ü
 *  - �Լ��� ����(Define)�ϰ� ȣ��(Call)
 */
public class Sub3_MethodTest {

	public static void main(String[] args) {

		// (1) �Լ� ȣ��
		int r1 = f(1);
		int r2 = f(2);
		int r3 = f(3);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		
		int s1 = sum(1, 10);
		int s2 = sum(1, 100);
		int s3 = sum(1, 1000);
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
	}// (3)main method end
	
	// (2) �Լ� ����
	public static int f(int x) {
		
		int y = 2 * x + 3;
		return y;
	}
	
	public static int sum(int start, int end) {
		
		int total = 0;
		
		for(int k=start ; k<=end ; k++) {
			total += k;
		}
		
		return total;
	}

}
