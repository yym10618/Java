package ch11;

public class P270ExceptionEx3 {
	
	public static void main(String[] args) {
		
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[3]);
			System.out.println(3 / 0);
			Integer.parseInt("a");
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� ����");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� ���� �ʰ�");
		}catch(Exception e) {
			System.out.println("���� �߻�");
		}
	}

}
