package test2;

/*
 * ��¥ : 2022/01/06
 * �̸� : ����
 * ���� : �ڹ� �迭 �������� ���� ��������
 */
public class Ex03 {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// ���� �迭 ���
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i]+", ");
		}
		
		System.out.print("\n");
		
		// �迭 ���Ҹ� �������� ����
		for(int j = 0; j < 5; j++) {
			int temp = arr[j];
			arr[j] = arr[9 - j];
			arr[9 - j] = temp;
		}
		
		// �������� ���ĵ� �迭 ���
		for(int n : arr) {
			System.out.print(n+", ");
		}
		
	}

}
