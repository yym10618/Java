package test4;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * ��¥ : 2022/01/12
 * �̸� : ����
 * ���� : ����ó�� ��������
 */
public class Ex01 {
	public static void main(String[] args) {
		
		int answer = (int) (Math.random()*10)+1;
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.println("-------------");
			System.out.println("answer�� ���� ���纸����");
			System.out.print("1~10 ������ ���� �Է� : ");
			
			try {
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();
				
				if(input<0) {
					throw new Exception("������ �Է� �� �� �����ϴ�.");
				}
			}catch(InputMismatchException e) {
				System.out.println("���ڰ� �ƴմϴ�. ���ڸ� �Է��ϼ���.");
				continue;
			}catch(Exception e) {
				System.out.println(e.getMessage());
				continue;
				
			}
			
			if(answer>input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}else if(answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}else {
				System.out.println("answer : "+answer);
				System.out.println("�����Դϴ�.");
				System.out.println("�õ� Ƚ�� : "+count+"ȸ");
				break;
			}
		}while(true);
		
		System.out.println("���α׷��� ���� ���� �Ǿ����ϴ�.");
	}

}
