package ch08;

public class P213 {
	
	public static void main(String[] args) {
		
		allObject(new P209());
		allObject(new P209Amd());
		allObject(new P210Nvidia());
		allObject("¾È³ç");
	}
	
	public static void allObject(Object obj) {
		
		System.out.println(obj.toString());
	}

}
