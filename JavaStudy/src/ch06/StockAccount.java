package ch06;

import ch05.Account;

public class StockAccount extends Account{

	private String stock;
	private int amount;
	private int price;
	
	public StockAccount(String bank, String id, String name, int balance, String stock, int amount, int price) {
		super(bank, id, name, balance); // �θ�Ŭ���� ������ ȣ��
		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}
	
	
	public void sell(int amount, int price) {
		this.amount -= amount;
		super.balance += amount * price;
	}
	public void buy(int amount, int price) {
		this.amount += amount;
		super.balance -= amount * price;
	}
	
	public void show() {
		System.out.println("====================");
		System.out.println("���ǻ� : "+bank);
		System.out.println("���¹�ȣ : "+id);
		System.out.println("�Ա��� : "+name);
		System.out.println("�����ܾ� : "+balance);
		System.out.println("�ֽ����� : "+stock);
		System.out.println("���� : "+amount);
		System.out.println("���� : "+price);
		System.out.println("====================");
	}
}
