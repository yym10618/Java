package test1;

/*
 * ��¥ : 2022/01/06
 * �̸� : ����
 * ���� : �ڹ� �ݺ��� ��������
 */
public class Ex08 {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i =0 ; i<n ; i++) {
			
			for(int j=n-1 ; j>i ; j--) {
				System.out.print(" ");
			}
			
			for(int j=0 ; j<2*i+1 ; j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}

}
