package test1;

import java.util.Scanner;

/*
 * ��¥ : 2022/01/06
 * �̸� : ����
 * ���� : �ڹ� �⺻ ����� ��������
 */
public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int    year;
		int    birth;
		String name;
		
		System.out.println("���� �⵵ �Է� : ");
		year = sc.nextInt();
				
		System.out.println("�¾ �⵵ �Է� : ");
		birth = sc.nextInt();
				
		System.out.println("�̸� �Է� : ");
		name = sc.next();
				
		int age = year - birth;
		
		System.out.printf("%s�� �ȳ��ϼ���.\n����� ���� �� %d�� �Դϴ�.", name, age);
		
		sc.close();
	}

}
