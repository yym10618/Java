package ch03;

/*
 * ��¥ : 2022/01/03
 * �̸� : ����
 * ���� : �ڹ� �ݺ��� for �ǽ��ϱ� ���� p90
 */
public class Sub2_ForTest {

	public static void main(String[] args) {

		// for
		//for( �ʱ�� ; ���ǽ� ; ������ ) {} 
        for( int i=1 ; i<=5 ; i++ ) {
			System.out.printf("%d�� �ݺ�...\n", i);
		} 
        
		// 1���� 10������ ��
        int sum = 0;
        
        for(int k=1 ; k<=10 ; k++) {
        	sum += k;
        }
        
        System.out.println("1���� 10���� �� : "+sum);
        
		// 1���� 10������ ¦�� ��
        int tot = 0;
        
        for(int k=1 ; k<=10 ; k++) {
            
        	if(k % 2 == 0) {
            	tot += k;
            }        	
        }
        
        System.out.println("1���� 10���� ¦���� : "+tot);
		
        // ��ø for
        for(int a=1 ; a<=3 ; a++) {
        	
        	System.out.println("a : "+a);
        	for(int b=1 ; b<=4 ; b++) {
        		System.out.println("b : "+b);
        		
        		for(int c=1 ; c<=5 ; c++) {
        			System.out.println("c : "+c);
        		}
        	}
        }
        
		// ������
        for(int x=2 ; x<=9 ; x++) {
        	
        	System.out.println(x+"��");
        	
        	for(int y=1 ; y<=9 ; y++) {
        		int z = x * y;
        		System.out.printf("%d x %d\n", x, y, z);
        	}
        }
        
		// ���ﰢ��
        for(int start=10 ; start>=1 ; start--) {
        	
        	for(int end=1 ; end<=start ; end++) {
        		
        		System.out.print("��");
        	}
        	
        	System.out.println(); // �ٹٲ�
        }
	}
}
