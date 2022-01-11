package ch09;

public class P235ComplexerMain2 {
	
	public static void main(String[] args) {
		
		P233Fax fax = new P233Fax() {

			@Override
			public void send(String tel) {
				System.out.println("여기는 익명 구현 객체의 send()");
			}

			@Override
			public void receive(String tel) {
				System.out.println("여기는 익면 구현 객체의 receive()");
			}
			
		};
		
		fax.send("1234");
		fax.receive("5678");
	}

}
