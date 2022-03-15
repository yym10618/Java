package test3;

/*
 * ��¥ : 2022/01/12
 * �̸� : ����
 * ���� : �ڹ� Ŭ���� ������ ��������
 */
class King {
	private String name;
	private int year;
	
	public King(int year) {
		this("����");
		this.year = year;		
	}	
	public King(String name) {		
		this.name = name;
	}	
	public King(String name, int year) {
		this.name = name;
		this.year = year;
	}	
	public void show() {
		System.out.println("name : "+name);
		System.out.println("year : "+year);
	}
}

public class Ex02 {
	
	public static void main(String[] args) {		
		King k1 = new King("����", 1392);
		King k2 = new King("�������");
		King k3 = new King(1776);
		
		k1.show();
		k2.show();
		k3.show();
	}	
}