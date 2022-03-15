package test3;

/*
 * ��¥ : 2022/01/12
 * �̸� : ����
 * ���� : ������ ��������
 */
class Product{
	 protected String category;
	 protected int price;
	 
	 public Product(String category, int price) {
		 this.category = category;
		 this.price = price;
	 }
	 public void info() {}
}

class Television extends Product{
	 
	public Television(String category, int price) {
		super(category, price);
	}

	@Override
	public void info() {
		System.out.println("��ǰ�з� : "+category);
		System.out.println("��ǰ���� : "+price);
	}
	
	
}

class Computer extends Product{
	 
	public Computer(String category, int price) {
		super(category, price);
	}

	@Override
	public void info() {
		System.out.println("��ǰ�з� : "+category);
		System.out.println("��ǰ���� : "+price);
	}
	
	
}

public class Ex08 {
	
	public static void main(String[] args) {
		
		Product p1 = new Television("����", 100);
		Product p2 = new Computer("��ǻ��", 150);
		
		p1.info();
		p2.info();
	}

}
