package ch04;

/*
 * ��¥ : 2022/01/04
 * �̸� : ����
 * ���� : �ڹ� Method Type �ǽ��ϱ� ���� p
 */
public class Sub4_MethodTypeTest {
	
	// main �޼��� : �ڹ� ���α׷��� �����Լ�(���� ������)
	public static void main(String[] args) {
		
		// type1 ȣ��
		double y1 = type1(0.1);
		double y2 = type1(1.2);
		
		System.out.println("y1 : "+y1);
		System.out.println("y2 : "+y2);
		
		//type2 ȣ��
		type2(true);
		type2(false);
		
		//type3 ȣ��
		String result = type3();
		System.out.println("result : "+result);
		
		//type4 ȣ��
		type4();
		
	}
	
	// type1 : �Ű����� o, ���ϰ� o
	public static double type1(double x) {
		
		double y = x + 3.14;
		return y;
	}
	
	// type2 : �Ű����� o, ���ϰ� x
	public static void type2(boolean status) {
		
		if(status) {
			System.out.println("�� �Դϴ�.");
		}else {
			System.out.println("���� �Դϴ�.");
		}
		
	}
	
	// type3 : �Ű����� x, ���ϰ� o
	public static String type3() {
		
		int n1 = 1;
		int n2 = 2;
		
		if(n1 > n2) {
			return "n1�� n2���� ũ��.";
		}else {
			return "n1�� n2���� �۴�.";
		}
	}
	
	// type4 : �Ű����� x, ���ϰ� x
	public static void type4() {
		
		double result = type1(10.01);
		System.out.println("type4�� ��� : "+result);
		
	}

}
