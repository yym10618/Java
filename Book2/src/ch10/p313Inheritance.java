package ch10;

class Human{
	String name;
	int age;
	void eat() {}
	void sleep() {}
}
class Student extends Human{
	int studentID;
	void goToSchool() {}
}
class Worker extends Human{
	int workerID;
	void goToWork() {}
}

public class p313Inheritance {
	public static void main(String[] args) {
		
		Human h = new Human();
		h.name = "������";
		h.age = 11;
		h.eat();
		h.sleep();
		
		Student s = new Student();
		s.name = "��μ�";
		s.age = 16;
		s.studentID = 128;
		s.eat();
		s.sleep();
		s.goToSchool();
		
		Worker w = new Worker();
		w.name = "������";
		w.age = 45;
		w.workerID = 128;
		w.eat();
		w.sleep();
		w.goToWork();
	}

}
