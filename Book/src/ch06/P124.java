package ch06;

public class P124 {
	
	public static void main(String[] args) {
		
		// ���� �迭
		int[] arrInt = {1, 2, 3};
		
		// ������ �迭
		int[] arrInt2 = new int[5];
		
		// ������ �迭�� �� ����
		for(int i=0 ; i<arrInt.length ; i++) {
			arrInt2[i] = arrInt[i];
		}
		
		// �迭 �� ���
		for(int i=0 ; i<arrInt2.length ; i++) {
			System.out.println(arrInt2[i]);
		}
	}

}
