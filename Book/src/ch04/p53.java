package ch04;

public class p53 {

	public static void main(String[] args) {
		
		int number1 = 10;
		System.out.println("number1 = 10 -> "+number1); // 10���
		
		number1 += 10; // ���ϰ� ����
		System.out.println("number1 += 10 -> "+number1); // 20���
		
		number1 -= 10; // ���� ����
		System.out.println("number1 -= 10 -> "+number1); // 10 ���
		
		number1 *= 2;  // ���ϰ� ����
		System.out.println("number1 *= 2 -> "+number1); // 20���
		
		number1 /= 2;  // ������ ����
		System.out.println("number1 /= 2 -> "+number1); // 10���
		
		number1 %= 3;  // ������ ����
		System.out.println("number1 %= 3 -> "+number1); // 1���
	}
}
