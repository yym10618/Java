package ch10;

import ch09.Apple;
import ch09.Banana;

public class FruitBox<T> {
	
	private T fruit;
	
	// getter : �������(�Ӽ�)�� �ܺο� �����ϴ� �޼��� get ctrl+space
	public T getFruit() {
		return fruit;
	}
	
	// setter : �������(�Ӽ�)�� ���� �ܺο��� �����ϴ� �޼��� set ctrl+space
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}

}
