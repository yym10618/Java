package ch06;

public class P113 {
	
	public static void main(String[] args) {
		
		int[] number = new int[100];
		
		// �迭 ������ ����
		for(int i=0 ; i<number.length ; i++) {
			number[i] = i + 1;
		}
		
		// �迭 ���� ���
		for(int i=0 ; i<number.length ; i++) {
			System.out.println(number[i]);
		}
	}

}
