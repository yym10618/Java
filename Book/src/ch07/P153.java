package ch07;

class Param{
	
	void add(int x, int y) {
		int z = x + y;
		System.out.println(z);
	}
	
	void add2(double x, double y) {
		double z = x + y;
		System.out.println(z);
	}
}
public class P153 {
	
	public static void main(String[] args) {
		
		Param p = new Param();
		p.add(10, 5);
		//p.add("10", "5"); // ����
		
		p.add2(10, 5);
	}

}
