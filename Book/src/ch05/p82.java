package ch05;

public class p82 {

	public static void main(String[] args) {

		int score = 80;
		String grade = "";
		
		System.out.println("�����ο� ����");
		if(score>=95) {
			grade = "A+";
		}else if(score>=90) {
			grade = "A";
		}else if(score>=85) {
			grade = "B+";
		}else if(score>=80) {
			grade = "B";
		}else if(score>=70) {
			grade = "C";
		}else if(score>=60) {
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println("����� ������ "+grade+"�Դϴ�.");
		System.out.println("�����ο� ��");
	}

}
