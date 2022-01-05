package ch05;

public class Account {

	// �Ӽ�(�ʵ�) : ������ ĸ��ȭ(private) ����
	private String bank;
	private String id;
	private String name;
	private int balance;
	
	// ������(Constructor) : ��ü ������ �� ��������� �ʱ�ȭ�ϴ� �޼���
	public Account(String bank, String id, String name, int balance) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	// ���
	public void deposit(int money) {
		this.balance += money;
		
	}
	public void withdraw(int money) {
		this.balance -= money;
		
	}
	public void show() {
		System.out.println("--------------------");
		System.out.println("����� : "+this.bank);
		System.out.println("���¹�ȣ : "+this.id);
		System.out.println("�Ա��� : "+this.name);
		System.out.println("�����ܾ� : "+this.balance);
		System.out.println("--------------------");
		
	}
	
}
