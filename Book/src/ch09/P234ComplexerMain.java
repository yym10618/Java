package ch09;

public class P234ComplexerMain {
	
	public static void main(String[] args) {
		 
		P233Complexer com = new P233Complexer();
		System.out.println(P233Complexer.INK);
		System.out.println(P233Complexer.FAX_NUMBER);
		com.print();
		com.scan();
		com.send("02-8765-4321");
		com.receive("02-8765-4321");
		
	}

}
