package ch08;

public class P212 {
	
	public static void main(String[] args) {
		
		P211 g = new P211();
		
		P209 gc = new P209();
		g.display(gc);
		
		P209Amd gc2 = new P209Amd();
		g.display(gc2);
		
		P210Nvidia gc3 = new P210Nvidia();
		g.display(gc3);
	}

}
