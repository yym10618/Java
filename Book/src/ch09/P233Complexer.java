package ch09;

public class P233Complexer implements P232Printer, P232Scanner, P233Fax{

	@Override
	public void send(String tel) {
		System.out.println(FAX_NUMBER + "���� "+tel+"�� FAX ����");
		
	}

	@Override
	public void receive(String tel) {
		System.out.println(tel + "���� "+FAX_NUMBER+"�� FAX ����");
		
		
	}

	@Override
	public void scan() {
		System.out.println("��ĵ ����");
		
	}

	@Override
	public void print() {
		System.out.println("��� ����");
		
	}
	
	

}
