package test2;

import java.util.Scanner;

/*
 * ��¥ : 2022/01/06
 * �̸� : ����
 * ���� : �ڹ� �޼��� ��������
 */
public class Ex06 {
	
		public static void intro(){
			System.out.println("****** START ******");
			System.out.println("�ΰ��� ������ �Է�");
		}
		
		public static int input(Scanner sc, String name){
			System.out.println("���� "+name+"�� �Է� : ");
			int input = sc.nextInt();
			return input;
		}
		
		public static void result(int val){
			System.out.println("���� ��� : "+val);
			System.out.println("****** END ******");
		}
		
		public static int add(int x, int y){
			return x + y;
		}
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			intro();
					
			int a = input(sc, "a");
			int b = input(sc, "b");
			
			int output = add(a, b);
			result(output);
			
			sc.close();
		}
		
	}

