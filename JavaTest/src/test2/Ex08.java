package test2;

/*
* ��¥ : 2022/01/06
* �̸� : ����
* ���� : �ڹ� ���丮�� ��� �޼��� ��������
*/
public class Ex08 {
	
	public static void main(String[] args) {
		
		System.out.println("3! = "+factorial(3));
		System.out.println("4! = "+factorial(4));
		System.out.println("5! = "+factorial(5));
	}
	
	public static int factorial(int n) {
		
		if(n <= 1) {
			return 1;
		}
		
		return n * factorial(n-1);
	}

}