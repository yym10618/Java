package test4;

/*
 * ��¥ : 2022/01/12
 * �̸� : ����
 * ���� : String, Wrapper Ŭ���� ��������
 */
public class Ex05 {
	
	public static void main(String[] args) {
		
		String strCsv = "60,72,82,86,92";
		String[] scores = strCsv.split(",");
		
		int total = 0;
		
		for(int i=0 ; i<scores.length ; i++) {
			
			total += Integer.parseInt(scores[i]);
			
		}
		
		System.out.println("���� : "+total);
	}

}
