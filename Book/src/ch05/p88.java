package ch05;

import java.util.Scanner;

public class p88 {

	public static void main(String[] args) {

		System.out.print("������ �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		String grade = "";
		switch(score / 10) {
		case 9 :
			grade = "A";
		case 8 :
			grade = "B";
		case 7 :
			grade = "C";
		case 6 :
			grade = "D";
		default :
			grade = "F";
		}
		System.out.println("���� : "+grade);
	}

}
