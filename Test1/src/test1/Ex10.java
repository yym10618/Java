package test1;

/*
 * 날짜 : 2022/01/06
 * 이름 : 양용민
 * 내용 : 자바 피보나치 수열 연습문제
 */
public class Ex10 {
	
	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.print(n1+", ");
		System.out.print(n2+", ");
		
		for(int i=1 ; i<=10 ; i++) {
			
			n3 = n1 + n2;
			
			System.out.print(n3+", ");
			
			n1 = n2;
			n2 = n3;
			
		}
	}

}
