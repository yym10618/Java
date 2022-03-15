package test2;

import java.util.Scanner;

/*
 * ��¥ : 2022/01/06
 * �̸� : ����
 * ���� : �ڹ� �迭 ����Ž�� ��������
 * 
 * ����Ž��
 *  - ����Ž���� ��ü ���Ұ� ���ĵ� ���¿��� �߾Ӱ��� �������� ������ ������
 *    ������ ������ ������� �˻��� �����ϴ� �˰����̴�.
 *    
 * �˻��ܰ�
 *  1�ܰ� : �迭�� �߾Ӱ��� ã�´�.
 *  2�ܰ� : �˻��ϰ��� �ϴ� ������ �߾Ӱ��� ũ�� �߾Ӱ��� �������� ������.
 *  3�ܰ� : �ٽ� ���� ���ݿ� ���ؼ� �߾Ӱ��� ã�´�.
 *  4�ܰ� : ���� ���� �ݺ� ������ ���� �˻��ϰ����ϴ� ���� �߰��� �� �ִ�.
 */
public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {5, 10, 18, 22, 35, 55, 75, 103, 152};
		
		System.out.println("�˻��� �� �Է�: ");
		int value = sc.nextInt();
		
		int start = 0;
		int end = arr.length - 1;
		int loc = 0;
		boolean state = false;
		
		while(start <= end) {
			
			int mid = (start + end) / 2;
			
			if(arr[mid] > value) {
				end = mid - 1;
			}else if(arr[mid] < value) {
				start = mid + 1;
			}else {
				loc = mid;
				state = true;
				break;
			}
			
		}
		if(state) {
			System.out.printf("ã�� ��ġ : %d��° �ֽ��ϴ�.", loc+1);
		}else {
			System.out.println("ã�� ���ڰ� �����ϴ�.");
		}
		sc.close();
	}

}
