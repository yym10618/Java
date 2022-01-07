package ch08;

public class P210 {
	
	public static void main(String[] args) {
		
		P209 gc = new P209();
		gc.process(); // 원래 그래픽카드 process
		
		gc = new P209Amd();
		gc.process();
		
		gc = new P210Nvidia();
		gc.process();
	}

}
