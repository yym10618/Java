package ch09;

public class P235ComplexerMain2 {
	
	public static void main(String[] args) {
		
		P233Fax fax = new P233Fax() {

			@Override
			public void send(String tel) {
				System.out.println("����� �͸� ���� ��ü�� send()");
			}

			@Override
			public void receive(String tel) {
				System.out.println("����� �͸� ���� ��ü�� receive()");
			}
			
		};
		
		fax.send("1234");
		fax.receive("5678");
	}

}
