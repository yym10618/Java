package test3;

/*
 * ��¥ : 2022/01/12
 * �̸� : ����
 * ���� : �ڹ� Ŭ���� ��� ��������
 */
class Customer{
	protected int id;
	protected String name;
	protected String grade;
	protected int point;
	protected double pointRatio;
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = "SILVER";
		this.point = 100;
		this.pointRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		point += price * pointRatio;
		return price;
	}
	
	public void showInfo() {
		System.out.println("=============");
		System.out.println("����ȣ : "+id);
		System.out.println("���̸� : "+name);
		System.out.println("����� : "+grade);
		System.out.println("���� ����Ʈ : "+point);
		System.out.println("����Ʈ ������ : "+pointRatio);
		System.out.println("=============");
	}
}

class VipCustomer extends Customer{
	
	private double saleRatio;
	
	public VipCustomer(int id, String name) {
		super(id, name);
		super.grade = "VIP";
		super.point = 1000;
		super.pointRatio = 0.05;
		this.saleRatio = 0.1;
	}
	public int calcPrice(int price) {
		point += price * pointRatio;
		return price - (int)(price * saleRatio);
	};
}
public class Ex07 {
	
	public static void main(String[] args) {
		
		Customer kim = new Customer(1001, "������");
		VipCustomer lee = new VipCustomer(1002, "�̼���");
		
		System.out.println("�����ߴ��� ������ �ݾ� : "+kim.calcPrice(10000));
		System.out.println("�̼��Ŵ��� ������ �ݾ� : "+lee.calcPrice(10000));
		
		kim.showInfo();
		lee.showInfo();
	}

}
