package test1;

/*
 * ��¥ : 2022/01/06
 * �̸� : ����
 * ���� : 1 ~ 10���� ���� �� 2�� ����� 3�� ��� ������ �� ���ϱ�
 */
public class Ex07 {
	
	public static void main(String[] args) {
		
		int total = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			if(k%2 == 0 || k%3 == 0) {
				total += k;
			}
		}
		
		System.out.println("1 ~ 10���� 2�� 3����� ������ �� : "+total);
		
	}

}
