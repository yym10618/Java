package ch03;

import java.util.Scanner;

/*
 * ��¥ : 2022/01/03
 * �̸� : ����
 * ���� : �ڹ� ���ǹ� �ǽ��ϱ� ���� p79
 */
public class Sub1_IfTest {

	public static void main(String[] args) {
		// if��
 		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2) {
			// ������ ���϶� ����
			System.out.println("num1�� num2���� �۴�.");
		}
		
		if(num1 > 0) {
			System.out.println("num1�� 1���� ũ��.");
		}
		
		if(num1 > 0) {
			
			if(num2 > 1) {
				
				System.out.println("num1�� 0���� ũ��, num2�� 1���� ũ��.");
			}
		}
		if(num1 > 0 && num2 > 1) {
			System.out.println("num1�� 0���� ũ�� �׸��� num2�� 1���� ũ��.");
		}
		
		// if ~ else
		int num3 = 3, num4 = 4;
		
		if(num3 > num4) {
			//������ ���϶�
			System.out.println("num3�� num4���� ũ��.");
		}else {
			//������ �����϶�
			System.out.println("num3�� num4���� �۴�.");
		}
		
		// if ~ else if ~ else
		if(num1 > num2) {
			System.out.println("num1�� num2���� ũ��.");
		}else if(num2 > num3){
			System.out.println("num2�� num3���� ũ��.");
		}else if(num3 > num4){
			System.out.println("num3�� num4���� ũ��.");
		}else {
			System.out.println("num4�� ���� ũ��.");
		}
		
		// Ȯ�ι���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		
		System.out.println("�Է� ���� : "+score);
		
		if(score >= 90 && score <= 100) {
			System.out.println("A�Դϴ�.");
		}else if(score >= 80 && score < 90){
			System.out.println("B�Դϴ�.");
		}else if(score >= 70 && score < 80){
			System.out.println("C�Դϴ�.");
		}else if(score >= 60 && score < 70){
			System.out.println("D�Դϴ�.");
		}else {
			System.out.println("F�Դϴ�.");
		}
	}

}
