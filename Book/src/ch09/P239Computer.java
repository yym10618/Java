package ch09;

public class P239Computer {
	
	public static void main(String[] args) {
		
		P238GraphicCard gc = new P238Amd();
		
		System.out.println("�޸� : "+gc.MEMORY);
		
		// Amd�� ����
		gc = new P238Amd(); // �ڵ� ����ȯ
		gc.process();
		
		// Nvidia�� ��ü
		gc = new P238Nvidia(); // �ڵ� ����ȯ
		gc.process();
	}

}
