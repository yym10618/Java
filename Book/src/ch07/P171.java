package ch07;

public class P171 {
	
	public static void main(String[] args) {
		
		Student3 stu1 = new Student3(); // 1�� ������
		Student3 stu2 = new Student3("ȫ�浿"); // 2�� ������
		Student3 stu3 = new Student3("ȫ�浿", 4); // 3�� ������
		Student3 stu4 = new Student3("ȫ�浿", 4, "����Ʈ�������"); // 4�� ������
		
	}

}
class Student3{
	
	//�ʵ�
		String name; // �л���
		int grade; // �г�
		String department; // �а�
		
		// 1�� ������
		Student3(){
			
		}
		
		// 2�� ������
		Student3(String n){
			name = n;
		}

		// 3�� ������
		Student3(String n, int g){
			name = n;
			grade = g;
		}
		
		// 4�� ������
		Student3(String n, int g, String d){
			name = n;
			grade = g;
			department = d;
		}
}
		
		// �а��� �г��� �Ű������� �޴� ������(���� �߻�)
		//Student(String d, int g){
			//department = d;
			//grade = g;
		//}
