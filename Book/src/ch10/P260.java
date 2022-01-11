package ch10;

public class P260 { // OuterMain
	
	public static void main(String[] args) {
		
		P259 out = new P259();
		
		out.setInterfaceEx(new P260InterfaceExImple1());
		out.outerMethod();
		out.setInterfaceEx(new P260InterfaceExImple2());
		out.outerMethod();
	}

}
