package ch09;

public class P236ComplexerMain3 {
	
	public static void main(String[] args) {
		
		P236ComplexerInterface ci = new P236ComplexerInterface() {

			@Override
			public void print() {
				System.out.println("여기는 익명 구현 객체의 print()");
			}

			@Override
			public void scan() {
				System.out.println("여기는 익명 구현 객체의 scan()");
			}

			@Override
			public void send(String tel) {
				System.out.println("여기는 익명 구현 객체의 send()");
			}

			@Override
			public void receive(String tel) {
				System.out.println("여기는 익명 구현 객체의 receive()");
			}
			
		};
		
		ci.send("1234");
		ci.receive("5678");
		ci.print();
		ci.scan();
	}

}
